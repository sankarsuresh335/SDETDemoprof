package Actions_Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Date_picker_demo {

	public static void main(String[] args) throws InterruptedException {
		
		
		String month_year="March,2020";
		String date		= "15";
		
		System.setProperty("webdriver.chrome.driver",
				"F:\\\\Selenium 6.30\\\\myselenium\\\\drivers\\\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.phptravels.net/index.php");

		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//*[@id=\"checkin\"]")).click();
		
		Thread.sleep(2000);
		
		while(true) {
		
		String text=driver.findElement(By.xpath("//*[@id=\"datepickers-container\"]/div[1]/nav/div[2]")).getText();
		
		System.out.println(text);
		
		
		
		if(month_year.equals(text)) {
			
			break;
		}else {
			
			
			driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[1]/div[3]/div/div/div")).click();
			
		
		}
		
		System.out.println(" please check");
		
		driver.findElement(By.xpath("//*[@id=\"datepickers-container\"]/div[1]/div/div/div[2]/div[17]")).click();
		
		System.out.println("this is the  sasi birth day ");

	}

}
}
