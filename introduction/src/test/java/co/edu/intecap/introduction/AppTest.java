package co.edu.intecap.introduction;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest
{
	private App app;
	
	@Before
    public void init() {
    	app = new App();
    }
	
	@Test
	public void givenName_whenSayHello_thenCorrectMessage () {
		String name = "Cesar";
		String msg = app.sayHello(name);
		
		Assert.assertTrue(msg.contains("Hola"));
		
	}

}
