package com.bjtu.sample.service;

import java.io.Serializable;
import java.util.List;

import com.bjtu.sample.entity.Category;
import com.bjtu.sample.entity.Item;

/**
 * @author mac
 *
 */
public interface ItemService {
	
	public List<Item> ListItem();
	
	public void UpdateItem(Item item);
	
	
	/**
	 * Function to delete a row from item class
	 * @param persistentClass
	 * @param id
	 */
	public void DeleteItem(Class<Item> persistentClass, Serializable id);
	
	public void InsertNewItem(Item item);
	
	public Category getCategoryByName(String name);
	
	public void InsertDetail(Item item);
}
