package com.bjtu.service;

import java.util.List;

import com.bjtu.entity.Item;

/**
 * @author mac
 *
 */
public interface ItemService {
	
	public List<Item> listEndingItems();
	
	public void addItem(Item item);
	
}
