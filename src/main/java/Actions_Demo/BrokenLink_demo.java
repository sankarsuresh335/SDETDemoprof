package Actions_Demo;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import javax.net.ssl.HttpsURLConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLink_demo {

	public static void main(String[] args) throws IOException, InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"F:\\\\Selenium 6.30\\\\myselenium\\\\drivers\\\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://newtours.demoaut.com/");

		driver.manage().window().maximize();

		List<WebElement> links = driver.findElements(By.tagName("a"));

		System.out.println(links.size());

		for (int i = 0; i < links.size(); i++) {

			WebElement elements = links.get(i);

			String url = elements.getAttribute("href");
			
				URL link= new URL(url);
				
			HttpURLConnection con= (HttpURLConnection) link.openConnection();
			
			con.connect();
			
			int staustcode=con.getResponseCode();
			
			Thread.sleep(2000);
			
			if(staustcode<400) {
				
				System.out.println(url+" it is  normal link");
			}
			else {
				
				System.out.println(url+"it is not normal link");
			}

		}

	}

}
