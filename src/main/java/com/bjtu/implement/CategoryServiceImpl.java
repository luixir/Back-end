package com.bjtu.implement;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.bjtu.dao.GenericDaoSupport;
import com.bjtu.entity.Category;
import com.bjtu.service.CategoryService;


@Component("categoryService")
public class CategoryServiceImpl implements CategoryService {

	@Autowired
	private GenericDaoSupport genericDaoSupport;

	public List<Category> listAllCategories() {
		String querySentence = "FROM Category category";
		return genericDaoSupport.searchForList(querySentence, new HashMap<String, Object>());
	}

	public void addCategory(Category category) {
		genericDaoSupport.save(category);
	}

	public Category getCategoryByName(String name) {
		String query = "From Category category WHERE category.name=:myName";
		Map<String, Object> parameter = new HashMap<String, Object>();
		parameter.put("myName", name);
		Category category = (Category) genericDaoSupport.searchForList(query, parameter).get(0);
		return category;
	}

	public List<Category> listParentCategories() {
		String query = "FROM Category category WHERE category.parent is null";
		
		return genericDaoSupport.searchForList(query, new HashMap<String, Object>());
	}

	public void deleteCategory(Category category) {
		genericDaoSupport.delete(category);
		
	}
	
}
