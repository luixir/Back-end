package com.bjtu.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.bjtu.entity.Category;
import com.bjtu.service.CategoryService;

@Controller
@RequestMapping("/categories") //namespace
public class CategoryController {
	
	@Autowired
	private CategoryService categoryService;
	
	/**
	 * List all the categories
	 * 
	 * @return
	 */
	@RequestMapping("") //action
	public ModelAndView list() {
		List<Category> categories = categoryService.listAllCategories();
		ModelAndView modelAndView = new ModelAndView("category-list");
		modelAndView.addObject("categories", categories);
		
		return modelAndView;
	}
	
	/**
	 * Prepare to create a category
	 * 
	 * @return
	 */
	@RequestMapping("/create")
	public ModelAndView create() {
		List<Category> rootCategories = categoryService.listParentCategories();
		ModelAndView modelAndView = new ModelAndView("category-create");
		modelAndView.addObject("rootCategories", rootCategories);
		
		return modelAndView;
	}
	
	/**
	 * Create a category
	 * 
	 * @param category
	 * @return
	 */
	@RequestMapping(value = "/create", method = RequestMethod.POST)
	public ModelAndView onCreate(Category category) {
		
		if(category.getParent().getId()!=null){
			Category rootCategory = categoryService.loadCategory(category.getParent().getId());
			category.setParent(rootCategory);
		}
		
		categoryService.addCategory(category);
		
		ModelAndView modelAndView = new ModelAndView("redirect:/categories");
		
		return modelAndView;
	}
	
	/**
	 *  
	 * @param category
	 * @return
	 */
	@RequestMapping("/delete")
	public ModelAndView onDelete(Category category){
		categoryService.deleteCategory(category);
		ModelAndView modelAndView = new ModelAndView("redirect:/categories");
		return modelAndView;
	}
	
}