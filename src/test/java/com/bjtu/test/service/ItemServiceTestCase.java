package com.bjtu.test.service;

import java.util.List;

import junit.framework.Assert;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.bjtu.entity.Item;
import com.bjtu.service.ItemService;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:/applicationContext-*.xml" })
public class ItemServiceTestCase {

	@Autowired
	private ItemService itemService;
	
	@Test
	public void testListEndingItems() {
		List<Item> items = itemService.listEndingItems();
		Assert.assertEquals(3, items.size());
	}
	
}
