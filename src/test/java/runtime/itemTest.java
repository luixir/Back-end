package runtime;


import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.bjtu.sample.entity.Item;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:/applicationContext-*.xml" })
public class itemTest {
	
	@Autowired
	private SessionFactory sessionFactory;
	Item item = new Item();

	@Test
	public void AddToTable(){
		Session ss = sessionFactory.openSession();
		item.setArea("haidian");
		item.setCreateDate(new Date());
		ss.save(item);
		
	}
	
	@Test
	public void ReadFromTable(){
		Session ss = sessionFactory.openSession();
		Item item = (Item) ss.load(Item.class, 1);
		
		System.out.print("*************************" + item.getArea());
		
		Assert.assertEquals("haidian", item.getArea());
	}
	
}
