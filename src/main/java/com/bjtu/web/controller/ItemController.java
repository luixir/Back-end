package com.bjtu.web.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.bjtu.entity.Item;
import com.bjtu.service.ItemService;

@Controller
@RequestMapping("/items") //namespace
public class ItemController {
	
	@Autowired
	
	private ItemService itemService;
	
	/**
	 * List all the items
	 * 
	 * @return
	 */
	@RequestMapping("") //action
	public ModelAndView list() {
		List<Item> items = itemService.listEndingItems();
		ModelAndView modelAndView = new ModelAndView("item-list");
		modelAndView.addObject("items", items);
		
		return modelAndView;
	}

	
	/**
	 * prepare to create an item
	 * @return
	 */
	@RequestMapping("/create") // action
	public ModelAndView Create() {
		List<Item> rootItems = itemService.listEndingItems();
		ModelAndView modelAndView = new ModelAndView("Item-create");
		modelAndView.addObject("rootItems", rootItems);
		
		return modelAndView;
	}
	
	/**
	 * Create an item
	 * 
	 * @return
	 */
	@RequestMapping( value = "/create", method = RequestMethod.POST)
	public ModelAndView onCreate(Item item) {
		itemService.addItem(item);
		
		ModelAndView modelAndView = new ModelAndView("redirect:/items");
		
		return modelAndView;
	}
	
	
	


}
