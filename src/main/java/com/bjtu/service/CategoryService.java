package com.bjtu.service;

import java.util.List;

import com.bjtu.entity.Category;

public interface CategoryService {
	
	public List<Category> listAllCategories();
	
	public void addCategory(Category category);
	
	public Category getCategoryByName(String name);
	
	public Category loadCategory(Long id);
	
	public List<Category> listParentCategories();
	
	public void deleteCategory(Category category);

}
