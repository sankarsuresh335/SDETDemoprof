package Actions_Demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Headless_brower {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		
		ChromeOptions options= new ChromeOptions();
		
		options.setHeadless(true);
		
		WebDriver driver=new ChromeDriver(options);
		
		driver.get("https://demo.nopcommerce.com/");
		
		System.out.println("titel name"+driver.getTitle());
		
		}

}
