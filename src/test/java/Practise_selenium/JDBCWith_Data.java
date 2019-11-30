package Practise_selenium;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JDBCWith_Data {

	public static void main(String[] args) throws SQLException {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.newtours.demoaut.com/");
		driver.manage().window().maximize();
		
		Connection connection = DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/thala?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC",
				"root", "root");

		Statement sta = connection.createStatement();

		
		ResultSet set=sta.executeQuery("select username,password from thala.aijth");
			
		while(set.next()) {
			
		String username	=set.getString("username");
		
		String password=set.getString("password");
		
		System.out.println(username);
		System.out.println(password);
		
		driver.findElement(By.name("userName")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(password);
		
		driver.findElement(By.name("login")).click();
		String ti=driver.getTitle();
		
		System.out.println(ti);
		
		if(ti.equals("Welcome back to Mercury Tours")) {
			
			System.out.println(" the test case paased");
		}else {
			
			System.out.println(" thetestcase failed");
		}
		
			
		}

	}

}
