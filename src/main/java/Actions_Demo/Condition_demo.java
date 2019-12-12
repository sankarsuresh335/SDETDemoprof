package Actions_Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Condition_demo {

	public static void main(String[] args) {
		
		ChromeOptions opt= new ChromeOptions();
		
		opt.setHeadless(true);

		System.setProperty("webdriver.chrome.driver", "F:\\Selenium 6.30\\myselenium\\drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://newtours.demoaut.com");

		WebElement username = driver.findElement(By.name("userName"));

		System.out.println(username.isDisplayed());

		WebElement password = driver.findElement(By.name("password"));

		System.out.println(password.isDisplayed());

		if (driver.findElement(By.name("userName")).isDisplayed()) {

			username.sendKeys("sankar");

		} else {

			System.out.println("it is not displayes");
		}
		
		if (driver.findElement(By.name("password")).isDisplayed()) {
			
			password.sendKeys("qualityqac");
			
		}
		else {
			
			System.out.println(" it is not displayed");
		}
		
		driver.navigate().to("https://www.facebook.com/");
		
		driver.findElement(By.cssSelector("input#email")).sendKeys("sankar");
		
		driver.findElement(By.cssSelector("input[name=pass]")).sendKeys("quality");
		
		System.out.println(driver.getTitle());
		
		/*System.out.println(driver.findElement(By.xpath("//*[@id=\"u_0_9\"]")).isSelected());
		
*/		

	}
	
	
	
	

}
