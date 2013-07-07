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

import com.bjtu.sample.entity.Address;
import com.bjtu.sample.entity.Item;
import com.bjtu.sample.service.ItemService;

import java.util.*;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:/applicationContext-*.xml" })
public class itemTest {
	
	@Autowired
	private SessionFactory sessionFactory;
	Item item = new Item();
	
	@Autowired
	private ItemService itemService;

//	@Test
	public void AddToTable(){
		Session ss = sessionFactory.openSession();
		item.setArea("haidian");
		item.setCreateDate(new Date());
		ss.save(item);
	}
	
//	@Test
	public void AddToID(){
		Session ss = sessionFactory.openSession();
//		Item item = (Item) ss.load(Item.class, 1);
//		Transaction tx = ss.beginTransaction();
//		
//		String insert = "INSERT INTO Item (id, newName)";
//		// HQL query used to update a specific row
//		String update = "UPDATE Item c set c.area = :newName where c.id = :id";
//		// HQL used for deleting row in database
//		String delete = "DELETE Item c where c.area = :oldName";
//
//		int updatedEntities = ss.createQuery( insert )
//				.setString( "newName", "Bandung" )
//		        .setString( "id", "1" )
//		        .executeUpdate();
//		// Commit transaction
//		tx.commit();
//		// Close session 
//		ss.close();

		Address address = new Address();
		
		item.setName("test3");
		item.setArea("haidian");
		
		address.setName("address");
		item.setAddress(address);
		
		ss.save(item);
	}
	
	@Test
	public void ReadFromTable(){
		Session ss = sessionFactory.openSession();
		Item item = (Item) ss.load(Item.class, 6);
		
		System.out.print("*************************" + item.getArea());
		
		Assert.assertEquals("haidian", item.getArea());
	}
	
	@Test
	public void testListItem()
	{
		List<Item> items = itemService.ListItem();
		
		Assert.assertEquals(13, items.size());
	}
	
	@Test
	public void testUpdateItem()
	{
		itemService.UpdateItem();
		
		List<Item> items = itemService.ListItem();
		Assert.assertEquals("Shanghai", items.get(2).getArea());
	}
}
