package Actions_Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Demo_Act {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com");
		
		driver.manage().window().maximize();
		
		WebElement textname = driver.findElement(By.id("txtUsername"));

		textname.sendKeys("Admin");

		WebElement testpassword = driver.findElement(By.id("txtPassword"));

		testpassword.sendKeys("admin123");

		WebElement clickbutton = driver.findElement(By.id("btnLogin"));

		clickbutton.click();

		
		Thread.sleep(2000);
		
		WebElement admin=driver.findElement(By.xpath("//*[@id=\"menu_admin_viewAdminModule\"]/b"));
		
		
		WebElement usrmag=driver.findElement(By.xpath("//*[@id=\"menu_admin_UserManagement\"]"));
		WebElement user=driver.findElement(By.xpath("//*[@id=\"menu_admin_viewSystemUsers\"]"));
		
		Actions act= new Actions(driver);
		
		act.moveToElement(admin).moveToElement(usrmag).moveToElement(user).click().build().perform();

		

	}

}
