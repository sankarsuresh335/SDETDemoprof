package Actions_Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Demo_2 {
	
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver = new ChromeDriver();

		driver.get("http://demoqa.com/menu/");
		System.out.println("demoqa webpage Displayed");

		driver.manage().window().maximize();

		driver.manage().deleteAllCookies();

		Actions actions = new Actions(driver);
		
		
		WebElement music=driver.findElement(By.xpath("//*[@id=\"ui-id-9\"]"));
		
		actions.moveToElement(music).perform();
		
		Thread.sleep(2000);
		
		WebElement rock=driver.findElement(By.xpath("//*[@id=\"ui-id-10\"]"));
		
		actions.moveToElement(rock).perform();
		
		Thread.sleep(2000);
		
		WebElement clasic=driver.findElement(By.xpath("//*[@id=\"ui-id-12\"]"));
		
		
		
		actions.moveToElement(clasic).perform();

	}

}
