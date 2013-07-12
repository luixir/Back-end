package com.bjtu.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.bjtu.entity.Category;
import com.bjtu.service.CategoryService;

@Controller
@RequestMapping("/category") //namespace
public class CategoryController {
	
	@Autowired
	private CategoryService categoryService;

	/**
	 * List all the categories
	 * 
	 * @return
	 */
	@RequestMapping("categories") //action
	public ModelAndView list() {
		List<Category> categories = categoryService.listAllCategories();
		ModelAndView modelAndView = new ModelAndView("category-list");
		modelAndView.addObject("categories", categories);
		
		return modelAndView;
	}
	
}
