package testNGPro;

import org.testng.annotations.Test;

public class DependencyMgmt {
	@Test
	//@Test(priority=0)
	public void SSLC() {
		System.out.println("High School");		
	}
	@Test
	//@Test(priority=1,dependsOnMethods="SSLC")
	public void HSC() {
		System.out.println("Higher Sec School");
	}
	@Test
	//@Test(priority=2,dependsOnMethods="HSC")
	public void Engg() {
		System.out.println("Engg College");
	}

}
