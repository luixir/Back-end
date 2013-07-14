package com.bjtu.service;

import java.util.List;

import com.bjtu.entity.Category;
import com.bjtu.entity.Item;

/**
 * @author mac
 *
 */
public interface ItemService {
	
	public List<Item> listAllItem();
	
	public List<Item> listEndingItems();
	
	public void addItem(Item item);
	
	public void deleteItem(Item item);
	
	public List<Item> getItemByCategory(String name);
	
}
