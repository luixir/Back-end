package com.bjtu.web.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.bjtu.entity.Category;
import com.bjtu.entity.Feature;
import com.bjtu.entity.Item;
import com.bjtu.service.CategoryService;
import com.bjtu.service.ItemService;
import com.bjtu.service.FeatureService;

@Controller
@RequestMapping("/items") //namespace
public class ItemController {
	
	@Autowired
	private ItemService itemService;
	@Autowired
	private CategoryService categoryService;
	@Autowired
	private FeatureService featureService;
	
	/**
	 * List all the items
	 * 
	 * @return
	 */
	@RequestMapping("") //action
	public ModelAndView list() {
		List<Item> items = itemService.listAllItem();
		List<Category> category = categoryService.listAllCategories();
		ModelAndView modelAndView = new ModelAndView("item-list");
		modelAndView.addObject("items", items);
		modelAndView.addObject("category", category);
		
		return modelAndView;
	}
	
	/**
	 * prepare to create an item
	 * @return
	 */
	@RequestMapping("/create") // action
	public ModelAndView create() {
		List<Category> listcategory = categoryService.listAllCategories();
		List<Feature> listfeature = featureService.listAllFeatures();
				
		ModelAndView modelAndView = new ModelAndView("item-create");
		modelAndView.addObject("listcategory", listcategory);
		modelAndView.addObject("listfeature", listfeature);
		
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
	
	/**
	 *  
	 * @param item
	 * @return
	 */
	@RequestMapping("/delete")
	public ModelAndView onDelete(Item item){
		itemService.deleteItem(item);
		ModelAndView modelAndView = new ModelAndView("redirect:/items");
		return modelAndView;
	}
	
	/**
	 * Prepare to modify an item
	 * @return
	 */
	@RequestMapping("/modify")
	public ModelAndView modify(Long id){
		Item item = itemService.getItemById(id);
		ModelAndView modelAndView = new ModelAndView("item-modify");
		modelAndView.addObject("item", item);
		return modelAndView;
	}
	
	/**
	 * Update the corresponding item
	 * @return
	 */
	@RequestMapping(value = "/modify", method = RequestMethod.POST)
	public ModelAndView onModify(){
		
		
		ModelAndView modelAndView = new ModelAndView("category-modify");
		return modelAndView;
	}

}
