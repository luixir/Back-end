package runtime;

import org.mortbay.jetty.Connector;
import org.mortbay.jetty.Server;
import org.mortbay.jetty.nio.SelectChannelConnector;
import org.mortbay.jetty.webapp.WebAppContext;

/**
 * Jetty Server starter. Use embedded mode.
 * 
 * @author Downpour
 */
public class Sample {
	
	/**
	 * @param args
	 * @throws Exception
	 */
	public static void main(String[] args) throws Exception {
		long begin = System.currentTimeMillis();
		Connector connector = new SelectChannelConnector();
		connector.setPort(Integer.getInteger("jetty.port", 8080).intValue());

		WebAppContext webapp = new WebAppContext("webapp", "/sample");
		webapp.setDefaultsDescriptor("./src/test/java/runtime/webdefault.xml");
		
		Server server = new Server();
		server.setConnectors(new Connector[] { connector });
		server.setHandler(webapp);
		server.start();
		System.out.println("Jetty Server started, use " + (System.currentTimeMillis() - begin) + " ms");
	}
}
