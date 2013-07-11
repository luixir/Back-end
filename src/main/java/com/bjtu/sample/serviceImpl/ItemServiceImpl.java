package com.bjtu.sample.serviceImpl;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.*;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.junit.Assert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.bjtu.sample.dao.GenericDaoSupport;
import com.bjtu.sample.entity.*;
import com.bjtu.sample.service.*;

/**
 * @author mac
 *
 */
@Component("itemService")
public class ItemServiceImpl implements ItemService{
	@Autowired
	private GenericDaoSupport genDao;
	
	@Autowired
	private SessionFactory sessionFactory;
	
	public List<Item> ListItem(){
		String querySentence = "From Item item";
		
		return genDao.searchForList(querySentence, new HashMap<String, Object>());
	}
	
	public void UpdateItem(Item item){
		// Load item entity
//		Item item = genDao.load(Item.class, 2);
		item.setArea("Bandung");
		genDao.update(item);
	}
	
	// TESTED OK
	public void DeleteItem(Class<Item> persistentClass, Serializable id){
		Item item = genDao.load(persistentClass, id);
		genDao.delete(item);
	}
	
	// TESTED OK
	public void InsertNewItem(Item item){
		genDao.save(item);
	}
	
	public void InsertDetail(Item item){
		ItemDetail itemdetail = new ItemDetail();
		itemdetail.setitemContent("ITEM DETAIL 2");
		itemdetail.setNumber(30);
		itemdetail.setPrice(new BigDecimal("234.45"));
		itemdetail.setOriginalTotalPrice(new BigDecimal("233.6"));
		itemdetail.setItem(item);
		genDao.save(itemdetail);
	}
	
	public Category getCategoryByName(String name){
		String query = "From Category category WHERE category.name=:myName";
		Map<String, Object> parameter = new HashMap<String, Object>();
		parameter.put("myName", name);
		Category category = (Category) genDao.searchForList(query, parameter).get(0);
		return category;
	}
}
