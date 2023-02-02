package testNGPro;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class AssertionHandson {
	
	boolean value=false;
	
	@Test
	@Parameters("Name")
	public void checkEquals(String name) {
		System.out.println(name);		
		Assert.assertEquals(name, "arg1");
	}
	@Test
	@Parameters("Name")
	public void checkNotEquals(String name) {
		System.out.println(name);
		Assert.assertNotEquals(name, "arg1");
			
	}
	@Test
	public void checkBool() {
		Assert.assertTrue(value, "true is passed");
		
	}

}
