package com.bjtu.web.controller;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.bjtu.entity.Category;
import com.bjtu.service.CategoryService;

@Controller
@RequestMapping("/categories") //namespace
public class CategoryController {
	
	@Autowired
	private CategoryService categoryService;
	
	private String Path = "F:\\Documents\\images\\";
	
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
	@RequestMapping("/create" )
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
	public ModelAndView onCreate(Category category, @RequestParam("categoryPictureFile") MultipartFile categoryPicture) {
		if(category.getParent().getId() != null){
			Category rootCategory = categoryService.loadCategory(category.getParent().getId());
			category.setParent(rootCategory);
		}
		
		System.out.println("filename:" + categoryPicture.getOriginalFilename());
		category.setPicture( "static/img/" + categoryPicture.getOriginalFilename());
		
		File file = new File(Path + categoryPicture.getOriginalFilename());
		
		try {
			FileUtils.copyInputStreamToFile(categoryPicture.getInputStream(), file);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		
		categoryService.addCategory(category);
		
		ModelAndView modelAndView = new ModelAndView("redirect:/categories");
		
		return modelAndView;
	}
	
	/**
	 * Prepare to modify a category
	 * Getting the database
	 * 
	 * @return
	 */
	@RequestMapping("/modify")
	public ModelAndView modify(Long id) {
		Category categories = categoryService.getCategoryById(id);
		List<Category> rootCategories = categoryService.listParentCategories();
		ModelAndView modelAndView = new ModelAndView("category-modify");
		modelAndView.addObject("categories", categories);
		modelAndView.addObject("rootCategories", rootCategories);
		
		return modelAndView;
	}
	
	/**
	 * Update the corresponding category
	 * 
	 * @param category modify
	 * @return
	 */
	@RequestMapping(value = "/modify", method = RequestMethod.POST)
	public ModelAndView onModify(Category category){
		if(category.getParent().getId() != null){
			Category rootCategory = categoryService.loadCategory(category.getParent().getId());
			category.setParent(rootCategory);
		}
		categoryService.saveOrUpdateCategory(category);
		
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