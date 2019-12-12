package Practise_selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Facebook_Login_page {

	WebDriver driver;

	@BeforeClass
	public void openbroweres() {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");

		driver.manage().window().maximize();
	}

	@Test
	public void createsource() {

		WebElement username = driver.findElement(By.name("firstname"));

		username.sendKeys("sankar");

		WebElement surename = driver.findElement(By.name("lastname"));

		surename.sendKeys("suresh");

	}

	@Test
	public void mobileenr() {

		WebElement ph = driver.findElement(By.name("reg_email__"));
		ph.sendKeys("5698746265");
	}

	@Test
	public void password() {

		WebElement pass = driver.findElement(By.name("reg_passwd__"));
		pass.sendKeys("qualityqac");

	}

	@Test
	public void datepicker() {

		WebElement datepcker = driver.findElement(By.xpath("//*[@id=\"day\"]"));

		Select select = new Select(datepcker);

		select.selectByValue("6");

		List<WebElement> options = select.getOptions();

		for (int i = 0; i < options.size(); i++) {

			String opt = options.get(i).getText();

			System.out.println("date value.....=" + opt);

		}

		WebElement month = driver.findElement(By.xpath("//*[@id=\"month\"]"));

		Select select2 = new Select(month);
		List<WebElement> options2 = select2.getOptions();

		for (int i = 0; i < options2.size(); i++) {

			String month_value = options2.get(i).getText();

			System.out.println("month value =" + month_value);
		}

		select2.selectByVisibleText("Jun");

		System.out.println("the month is:" + "Dec");

		WebElement year = driver.findElement(By.xpath("//*[@id=\"year\"]"));

		Select select3 = new Select(year);

		select3.selectByIndex(12);

		System.out.println("year fixed");

	}

	@Test
	public void gender() {

		WebElement gender = driver.findElement(By.xpath("//*[@id=\"u_0_a\"]"));

		gender.click();

	}

	@Test
	public void submitbutton() {

		WebElement sum = driver.findElement(By.name("websubmit"));

		sum.click();

	}

	/*@AfterClass
	public void teardown() {

		driver.close();

	}
*/
}
