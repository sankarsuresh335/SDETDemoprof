package Actions_Demo;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToolQac_Demo2 {
	
	public static WebDriver driver;

	public static void main(String[] args) {
		

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver = new ChromeDriver();
		
		
        driver.get("http://demoqa.com/menu/");
        System.out.println("demoqa webpage Displayed");

		/*driver.get("https://www.toolsqa.com/");

*/		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		
		Actions actions= new Actions(driver);
		
	
		
        //Retrieve WebElement 'Music' to perform mouse hover 
    	WebElement menuOption = driver.findElement(By.xpath(".//div[contains(text(),'Music')]"));
    	//Mouse hover menuOption 'Music'
    	actions.moveToElement(menuOption).perform();
    	System.out.println("Done Mouse hover on 'Music' from Menu");
    	
    	//Now Select 'Rock' from sub menu which has got displayed on mouse hover of 'Music'
    	WebElement subMenuOption = driver.findElement(By.xpath(".//div[contains(text(),'Rock')]")); 
    	//Mouse hover menuOption 'Rock'
    	actions.moveToElement(subMenuOption).perform();
    	System.out.println("Done Mouse hover on 'Rock' from Menu");
    	
    	//Now , finally, it displays the desired menu list from which required option needs to be selected
    	//Now Select 'Alternative' from sub menu which has got displayed on mouse hover of 'Rock'
    	WebElement selectMenuOption = driver.findElement(By.xpath(".//div[contains(text(),'Alternative')]"));
    	
    	
    	actions.click().perform();
    	
    	
    	System.out.println("Selected 'Alternative' from Menu");
    	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*WebElement act=driver.findElement(By.xpath("//*[@id=\"primary-menu\"]/li[6]/a/span/span"));
		
		
		actions.contextClick().sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
		
		Set <String> windoews=driver.getWindowHandles();
		
		System.out.println(windoews);
		
		for (String string : windoews) {
			
			
			System.out.println(windoews.equals("https://www.toolsqa.com/handling-alerts-using-selenium-webdriver/"));
			
		}
		
		

		System.out.println("test case pase");
	}
*/
}
}
