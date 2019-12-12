package Actions_Demo;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Javascript_excutot_demo {
	
	@Test
	public void JS_DEMO() throws InterruptedException {
		
	
	
	System.setProperty("webdriver.chrome.driver",
			"F:\\\\Selenium 6.30\\\\myselenium\\\\drivers\\\\chromedriver.exe");

	WebDriver driver = new ChromeDriver();

	driver.get("https://www.youtube.com/channel/UCiKEK85ndAfzyI4A7kkit7Q");

	driver.manage().window().maximize();
	
	Thread.sleep(2000);
	
	JavascriptExecutor jsp=(JavascriptExecutor) driver;
	
	jsp.executeScript("window.scrollBy(0,500)");
	
	Thread.sleep(3000);

	jsp.executeScript("window.scrollBy(0,-500)");
	Thread.sleep(3000);
	
	driver.quit();
}
}