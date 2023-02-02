package testNGPro;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ParallelTestingHandson {
	@Test
	public void openGoogle() {
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\dominicroya\\\\eclipse-workspace\\\\lib\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://google.co.in");
		//driver.quit();
	}
	@Test
	public void openBing() {
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\dominicroya\\\\eclipse-workspace\\\\lib\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://bing.com");
		//driver.quit();
	}

}
