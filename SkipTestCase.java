package testNGPro;

import org.testng.annotations.Test;

public class SkipTestCase {
	@Test
	//@Test(priority=0)
	public void eggsAdded() {
		System.out.println("Add 2 eggs and cook to scrambled");
	}
	@Test
	//@Test(priority=1)
	public void vegAdded() {
		System.out.println("Add All Vegetables");
		
	}
	@Test
	//@Test(priority=2)
	public void riceAdded() {
		System.out.println("Add 1 cup of Rice and mix well");
	}
	@Test
	//@Test(priority=3,enabled=false)
	public void chickenAdded() {
		System.out.println("Add 1 cup of chicken");
	}
	@Test
	//@Test(priority=4,enabled=false)
	public void seaFoodAdded() {
		System.out.println("Add 1 cup of seaFood");
	}
	@Test
	//@Test(priority=5)
	public void spicesAdded() {
		System.out.println("Added chilli, pepper, masala, sugar and required salt");
	}
	@Test
	//@Test(priority=6)
	public void sauseAdded() {
		System.out.println("Add Soy, chilli, tomato sauces");
	}
	@Test
	//@Test(priority=7)
	public void finish() {
		System.out.println("Mix and Cook Well and serve in a plate");
	}


}

//To skip a testcase from executing, enabled parameter is set to false. By default 
//the value is true 
