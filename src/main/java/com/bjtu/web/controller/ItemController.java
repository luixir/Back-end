package com.bjtu.web.controller;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.bjtu.entity.Address;
import com.bjtu.entity.Category;
import com.bjtu.entity.Feature;
import com.bjtu.entity.Item;
import com.bjtu.service.AddressService;
import com.bjtu.service.CategoryService;
import com.bjtu.service.FeatureService;
import com.bjtu.service.ItemService;

@Controller
@RequestMapping("/items") //namespace
public class ItemController {
	
	@Autowired
	private ItemService itemService;
	@Autowired
	private CategoryService categoryService;
	@Autowired
	private FeatureService featureService;
	@Autowired
	private AddressService addressService;
	
	private String Path = "F:\\Documents\\images";
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
	public ModelAndView onCreate(Item item, @RequestParam("mainPictureFile") MultipartFile mainPicture, @RequestParam("contentFile") MultipartFile content) {
		mainPicture.getOriginalFilename();
		item.setMainPicture("static/img/" + mainPicture.getOriginalFilename());
		
		File file = new File(Path + mainPicture.getOriginalFilename());
		
		try {
			FileUtils.copyInputStreamToFile(mainPicture.getInputStream(), file);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		content.getOriginalFilename();
		item.setContent("static/img/" + content.getOriginalFilename());
		
		File contentfile = new File(Path + content.getOriginalFilename());
		
		try {
			FileUtils.copyInputStreamToFile(content.getInputStream(), contentfile);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
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
		List<Category> listcategory = categoryService.listAllCategories();
		List<Feature> listfeature = featureService.listAllFeatures();
		List<Address> listaddress = addressService.listAllAddress();
		
		ModelAndView modelAndView = new ModelAndView("item-modify");
		
		modelAndView.addObject("item", item);
		modelAndView.addObject("listcategory", listcategory);
		modelAndView.addObject("listfeature", listfeature);
		modelAndView.addObject("listaddress", listaddress);
		return modelAndView;
	}
	
	/**
	 * Update the corresponding item
	 * @return
	 */
	@RequestMapping(value = "/modify", method = RequestMethod.POST)
	public ModelAndView onModify(Item item){
		itemService.saveOrUpdateItem(item);
		
		ModelAndView modelAndView = new ModelAndView("redirect:/items");
		return modelAndView;
	}

}
