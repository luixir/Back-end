package runtime;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.bjtu.sample.entity.*;
import com.bjtu.sample.service.*;

import java.math.BigDecimal;
import java.util.*;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:/applicationContext-*.xml" })
public class itemTest {
	
	@Autowired
	private SessionFactory sessionFactory;
	Item item = new Item();
	
	@Autowired
	// Declare the interface
	private ItemService itemService;

//	@Test
	public void AddToTable(){
		Session ss = sessionFactory.openSession();
		item.setArea("chaoyang");
		item.setCreateDate(new Date());
		ss.save(item);
	}
	
//	@Test
	public void AddNewCategory(){
		Session ss = sessionFactory.openSession();
		Category pegory = new Category();
		pegory.setName("Asian");
		
		List<Category> subcategory = new ArrayList<Category>();
		subcategory.add(0, pegory);
		
		Category parentCategory = new Category();
		parentCategory.setName("Food");
		parentCategory.setParent(parentCategory);
		
		Category category = new Category();		
		category.setSubCategory(subcategory);
		//category.setParent(category);
		
		Address address = new Address();
		address.setAddressDetail("Jiaoda Donglu 3");
		
		item.setName("Inul");
		item.setArea("Dongzhimen");
		item.setCategory(parentCategory);
		item.setAddress(address);
		
//		category.setSubCategory(category);
		
		ss.save(item);
	}
	
	@Test
	public void AddToItem(){
		Category category = itemService.getCategoryByName("Hotel");
		Item item = new Item();
		item.setArea("Dongxi");
		item.setCategory(category);
		item.setName("Four Season");
		
		itemService.InsertNewItem(item);
	}
	
//	@Test
	public void ReadFromTable(){
		Session ss = sessionFactory.openSession();
		Item item = (Item) ss.load(Item.class, 3);
		
		System.out.print("************************* " + item.getArea());
		
		Assert.assertEquals("chaoyang", item.getArea());
	}
	
//	@Test
	public void testListItem()
	{
		List<Item> items = itemService.ListItem();
		Assert.assertEquals(3, items.size());
	}
	
	/**
	 * Test if information could be updated
	 */
//	@Test
	public void testUpdateItem()
	{
		List<Item> items = itemService.ListItem();
		itemService.UpdateItem(item);
		Assert.assertEquals("bandung", items.get(1).getArea());
	}
	
//	@Test
	// OK
	public void testDeleteItem()
	{
		// If an item is deleted, all tables that has relation with the table will also be deleted
		itemService.DeleteItem(Item.class, new Long(16));
		Assert.assertEquals(null, item.getId());
	}
	
//	@Test
	public void InsertALot(){
		Category category = itemService.getCategoryByName("Hotel");
		Session ss = sessionFactory.openSession();
//		Category category = new Category();
//		category.setName("Movie");
//		ss.save(category);
		Address address = new Address();
		address.setName("JIAODA DONGLU 32");

		Item item = new Item();
		item.setName("bbbb");
		item.setAddress(address);
		item.setCategory(category);
		
//		itemService.InsertDetail(item);
		ss.save(item);
	}
	
//	@Test
	public void getcategory(){
		Category category = itemService.getCategoryByName("food");
		
		Assert.assertEquals("food", category.getName());
	}
}
