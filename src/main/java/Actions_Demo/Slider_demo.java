package Actions_Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Slider_demo {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"F:\\\\Selenium 6.30\\\\myselenium\\\\drivers\\\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://jqueryui.com/slider/");

		driver.manage().window().maximize();
		
		driver.switchTo().frame(0);
		
		WebElement slider=driver.findElement(By.xpath("//*[@id=\"slider\"]/span"));
		
		Actions act=new Actions(driver);
		
		act.moveToElement(slider).dragAndDropBy(slider, 20,0);
		
		


	}

}
