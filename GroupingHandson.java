package testNGPro;

import org.testng.annotations.Test;

public class GroupingHandson {
	@Test(groups={"Apple"})
	public void apple1() {
		System.out.println("Testing Apple1");
		
	}
	@Test(groups={"Apple"})
	public void apple2() {
		System.out.println("Testing Apple2");
		
	}
	@Test(groups={"moto"})
	public void moto1() {
		System.out.println("Testing moto1");
		
	}
	@Test(groups={"moto"})
	public void moto2() {
		System.out.println("Testing moto2");
		
	}
	@Test(groups={"lenovo"})
	public void lenovo1() {
		System.out.println("Testing lenovo1");
		
	}
	@Test(groups={"lenovo"})
	public void lenovo2() {
		System.out.println("Testing lenovo2");
		
	}
	@Test(groups={"nokia"})
	public void nokia1() {
		System.out.println("Testing nokia1");
		
	}
	@Test(groups={"nokia"})
	public void nokia2() {
		System.out.println("Testing nokia2");
		
	}
}


//"Ctrl+shift+/" is the shortcut to comment in XML file. same shortcut in 
//java eclipse to comment.
