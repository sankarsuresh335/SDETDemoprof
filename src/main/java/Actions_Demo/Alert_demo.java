package Actions_Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_demo {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"F:\\\\Selenium 6.30\\\\myselenium\\\\drivers\\\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://demo.automationtesting.in/Alerts.html");

		driver.manage().window().maximize();

		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[1]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"OKTab\"]/button")).click();

		String testname = driver.switchTo().alert().getText();

		System.out.println(testname);

		Thread.sleep(3000);

		driver.switchTo().alert().accept();

		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[2]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"CancelTab\"]/button")).click();

		String actual = "You pressed Ok";

		driver.switchTo().alert().accept();

		String excepted = driver.findElement(By.xpath("//*[@id=\"demo\"]")).getText();

		System.out.println(excepted);

		if (actual.equals(excepted)) {

			System.out.println("the test case pass");

		}
		
		String actual1="You Pressed Cancel";
		
		driver.switchTo().alert().dismiss();
		String excepted2=driver.findElement(By.xpath("//*[@id=\"demo\"]")).getText();
		
		System.out.println(excepted2);
		
		if(actual1.equals(excepted2)) {
		

			
			System.out.println("the test case pass");
		}
			
		
	driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[3]/a")).click();
		
	driver.findElement(By.xpath("//*[@id=\"Textbox\"]/button")).click();
	
	driver.switchTo().alert().sendKeys("hi dear sasi");
	
	driver.switchTo().alert().accept();

	}
	
	

}
