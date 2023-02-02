package testNGPro;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class SuiteHandons {
	//Suite= Collection of testcase
	//To open a chrome broswer
	//open bing, google and yahoo search engines.
	//close it.
	//calcute the time taken for each browsers
	
	WebDriver driver;
	long startTime;
	long endTime;
	@BeforeSuite
	public void openBrowser() {
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\dominicroya\\\\eclipse-workspace\\\\lib\\\\chromedriver.exe");
		driver=new ChromeDriver();
		startTime =System.currentTimeMillis();
		
	}
	
	@Test
	public void google() {
		driver.get("https://google.co.in");
	}
	@Test
	public void bing() {
		driver.get("https://bing.com");
		
	}
	@Test
	public void yahoo() {
		driver.get("https://yahoo.com");
			
	}
	@AfterSuite
	public void closeBrowser() {
		driver.quit();
		endTime=System.currentTimeMillis();
		long total_time=endTime-startTime;
		System.out.println(total_time);	
		
	}
}
