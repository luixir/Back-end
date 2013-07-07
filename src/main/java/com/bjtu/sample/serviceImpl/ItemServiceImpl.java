package com.bjtu.sample.serviceImpl;

import java.util.*;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.bjtu.sample.dao.GenericDaoSupport;
import com.bjtu.sample.entity.Item;
import com.bjtu.sample.service.ItemService;

public class ItemServiceImpl implements ItemService{
	@Autowired
	private GenericDaoSupport genDao;
	
	@Autowired
	private SessionFactory sessionFactory;
	
	public List<Item> ListItem(){
		String querySentence = "From Item item WHERE item.startDate < :today";
		Map<String, Object> parameters = new HashMap();
		parameters.put("today", new Date());
		
		return genDao.searchForList(querySentence, parameters);
	}
	
}
