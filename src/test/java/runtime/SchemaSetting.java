/**
 *
 */
package runtime;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.SessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author downpour
 * 
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:/applicationContext-*.xml" })
public class SchemaSetting {
	
	private static final Log logger = LogFactory.getLog(SchemaSetting.class);

	@Autowired
	private SessionFactory sessionFactory;
	
	@Test
	public void test() throws Exception {
		logger.info("Setting up Schema.");
	}

}