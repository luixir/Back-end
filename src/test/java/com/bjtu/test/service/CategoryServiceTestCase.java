package com.bjtu.test.service;

import java.util.List;

import junit.framework.Assert;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.bjtu.entity.Category;
import com.bjtu.service.CategoryService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:/applicationContext-*.xml" })

public class CategoryServiceTestCase {
	
	@Autowired
	private CategoryService categoryService;

//	@Test
	// First scenario, add parent category
	public void testAddCategoryParent(){
		Category category = new Category();
		category.setName("Movie");
		category.setPicture("Food picture");
		categoryService.addCategory(category);
	}
	
//	@Test
	// Second scenario, add Sub category
	public void testAddSubCategory(){
		Category category = new Category();
		Category parentCategory = categoryService.getCategoryByName("Food");
		category.setParent(parentCategory);
		
		category.setName("Western food");
		
		categoryService.addCategory(category);
	}
	
	@Test
	public void testListParentCategory(){
		List<Category> category = categoryService.listParentCategories();
		Assert.assertEquals(4, category.size());
	}
	
	@Test
	public void testListAllCategories(){
		List<Category> category = categoryService.listAllCategories();
		Assert.assertEquals(2, category.size());
	}

}
