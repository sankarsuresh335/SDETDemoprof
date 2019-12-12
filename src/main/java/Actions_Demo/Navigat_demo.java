package Actions_Demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Navigat_demo {

	public static void main(String[] args) {

		ChromeOptions options = new ChromeOptions();

		options.setHeadless(true);

		System.setProperty("webdriver.chrome.driver", "F:\\Selenium 6.30\\myselenium\\drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver(options);

		driver.get("http://newtours.demoaut.com");

		System.out.println(driver.getTitle());

		driver.navigate().to("http://demo.nopcommerce.com");

		System.out.println(driver.getTitle());

		driver.navigate().back();

		System.out.println(driver.getTitle());

		driver.navigate().forward();

		System.out.println(driver.getTitle());

		driver.navigate().refresh();

		driver.close();

	}

}
