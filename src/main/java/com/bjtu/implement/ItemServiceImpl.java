package com.bjtu.implement;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.bjtu.dao.GenericDaoSupport;
import com.bjtu.entity.Item;
import com.bjtu.service.ItemService;

/**
 * @author mac
 *
 */
@Component("itemService")
public class ItemServiceImpl implements ItemService{

	@Autowired
	private GenericDaoSupport genericDaoSupport;
	
	public List<Item> listEndingItems() {
		String querySentence = "FROM Item item WHERE item.endDate = :today";
		Map<String, Object> parameters = new HashMap<String, Object>();
		parameters.put("today", new Date());
		return genericDaoSupport.searchForList(querySentence, parameters);
	}

	public void addItem(Item item) {
		genericDaoSupport.save(item);
	}

}
