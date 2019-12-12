package Actions_Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Data_demo {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "F:\\Selenium 6.30\\myselenium\\drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		Thread.sleep(2000);

		driver.findElement(By.cssSelector("span#icon_calendar")).click();

		Select se = new Select(driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div/select")));
		
		se.deselectByVisibleText("2020");

	}

}
