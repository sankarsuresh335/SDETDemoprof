package Practise_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GmailVerfication_pages {
	
	
	public WebDriver driver;
	
	
	public void Launchbrowser() {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://accounts.google.com/signin/v2/identifier?service=accountsettings&continue=https%3A%2F%2Fmyaccount.google.com%2F%3Futm_source%3DOGB%26tab%3Dmk%26utm_medium%3Dact&csig=AF-SEnZYcJpDfyyilzWb%3A1574659527&flowName=GlifWebSignIn&flowEntry=AddSession");
		driver.manage().window().maximize();
	}
	
	public void singinmethod() {
		
		WebElement emailID=driver.findElement(By.id("identifierId"));
		
		emailID.sendKeys("sandy@gmail.com");
		
		WebElement nextbtn =driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/span/span"));
		nextbtn.click();
		
		WebElement passwordID=driver.findElement(By.xpath("//*[@id=\"password\"]/div[1]/div/div[1]/input"));
		
		passwordID.sendKeys("hhhhhaskas");
		
		WebElement submitbuton=driver.findElement(By.xpath("//*[@id=\"passwordNext\"]/span/span"));
		
		submitbuton.click();
		
	}
	
	public void textreslut() {
		
		
	WebElement reslut=driver.findElement(By.xpath("//*[@id=\"view_container\"]/div/div/div[2]/div/div[1]/div/form/span/section/div/div/div[1]/div[2]/div[2]/span"));
		
	String unexcepted=reslut.getText();
	
	if (unexcepted.equals("Wrong password. Try again or click Forgot password to reset it.")) {
		
		System.out.println("the excepted reslut is came");
		
	}else {
		
		System.out.println(" the excepted reslut is not came");
	}
	
	
	}
	
	public void teardown() throws InterruptedException {
		
		Thread.sleep(2000);
		
		driver.quit();
		
	}
	
	public static void main(String[] args) throws InterruptedException {
		
		GmailVerfication_pages page=new GmailVerfication_pages();
		
		page.Launchbrowser();
		page.singinmethod();
		page.textreslut();
		page.teardown();

	}

}
