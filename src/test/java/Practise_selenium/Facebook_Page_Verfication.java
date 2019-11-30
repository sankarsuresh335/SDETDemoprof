package Practise_selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Baseproperties.Base_properties;

public class Facebook_Page_Verfication extends Base_properties  {

	public WebDriver driver;
	
	Base_properties base=new Base_properties();
	
	@BeforeMethod
	public void browserlaunch_method() {
		
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		
		driver.manage().window().maximize();

	}
	@Test
	public void titel_verfication_page() {

		String Page_title = driver.getTitle();
		System.out.println("page title is " + ">>>>>>>>>>>" + Page_title + ">>>>>>>>>>>>>>>>>>");

		if (Page_title.equals("Facebook – log in or sign up")) {

			System.out.println("it is the correct page title");
		} else {

			System.out.println(" it is not correct page title ");
		}

	}
	
	@AfterMethod
	public void teardown_method() throws InterruptedException {

		Thread.sleep(2000);
		driver.quit();

	}

	
}
