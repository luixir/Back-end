package com.bjtu.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.ModelAndView;

import com.bjtu.entity.Category;
import com.bjtu.service.CategoryService;

public class CategoryController {
	
	@Autowired
	private CategoryService categoryService;

	/**
	 * List all the categories
	 * 
	 * @return
	 */
	public ModelAndView list() {
		
		List<Category> categories = categoryService.listAllCategories();
		ModelAndView modelAndView = new ModelAndView("category-list");
		modelAndView.addObject("categories", categories);
		
		return modelAndView;
	}
	
}
