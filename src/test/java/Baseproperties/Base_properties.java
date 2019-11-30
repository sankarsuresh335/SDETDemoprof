package Baseproperties;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class Base_properties {

	public ExtentReports extent;

	public ExtentHtmlReporter htmlreport;

	public ExtentTest test;

	@BeforeClass
	public void beforeclass() {

		extent = new ExtentReports();

		htmlreport = new ExtentHtmlReporter("F:Extendreport.html");

		extent.attachReporter(htmlreport);

	}

	@AfterClass
	public void afterclass() {

		extent.flush();

	}

}
