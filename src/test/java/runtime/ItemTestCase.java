/**
 * 
 */
package runtime;

import java.util.List;

import junit.framework.Assert;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.bjtu.entity.Item;

/**
 * @author Downpour
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:/applicationContext-*.xml" })
public class ItemTestCase {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	@Test
	public void testSaveItem() {
		Session session = sessionFactory.openSession();
		
		Item item = new Item();
		item.setName("downpour");
		item.setContent("18616858307");
		
		session.save(item);
		
	}
	
	@Test
	public void testGetItemByPrimaryKey() {
		Session session = sessionFactory.openSession();
		
		Item item = (Item) session.load(Item.class, 1);
		Assert.assertEquals("downpour", item.getName());
		Assert.assertEquals("18616858307", item.getContent());
	}
	
	@Test
	public void testUpdateItem() {
		Session session = sessionFactory.openSession();
		
		Item item = (Item) session.load(Item.class, 1);
//		item.changeContent("13816082224");
		
		session.update(item);
		
		Assert.assertEquals("13816082224", item.getContent());
	}

	@Test
	@SuppressWarnings("unchecked")
	public void testHQL() {
		Session session = sessionFactory.openSession();
		
		Query query = session.createQuery("FROM Item item WHERE item.account = :account");
		query.setParameter("account", "downpour");
		
		List<Item> items = query.list();
		
		Assert.assertEquals(1, items.size());
//		Assert.assertEquals("downpour", items.get(0).get());
		
	}

}
