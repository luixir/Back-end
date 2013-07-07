package com.bjtu.sample.serviceImpl;

import java.util.*;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.junit.Assert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.bjtu.sample.dao.GenericDaoSupport;
import com.bjtu.sample.entity.Item;
import com.bjtu.sample.service.ItemService;

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
	
	public void UpdateItem(){	
		Item item = genDao.load(Item.class, 6);
		item.setArea("Shanghai");
		genDao.update(item);
		
	}
}
