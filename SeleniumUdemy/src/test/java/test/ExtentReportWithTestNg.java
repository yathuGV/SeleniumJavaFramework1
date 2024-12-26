package test;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExtentReportWithTestNg {
	ExtentHtmlReporter htmlReporter;
	ExtentReports extent;
	WebDriver driver;

	@BeforeSuite
	public void setUp()
	{
		htmlReporter = new ExtentHtmlReporter("extent.html");

		extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
		

	}
	@BeforeTest
	public void setupTest()
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		
	}

	@Test
	public void test1() throws IOException 
	{
		ExtentTest test = extent.createTest("Google search test", "validate google search");	
		
		driver.get("https://www.google.lk/");
		test.pass("naviagted \to google");
		
		test.log(Status.INFO, "starting browser");
		test.info("infor");
		test.fail("fail test");
		test.addScreenCaptureFromPath("screenshot.png");
	}
	
	@Test
	public void tes2() throws IOException 
	{
		ExtentTest test2 = extent.createTest("Google search test 2", "validate google search 2");	
		test2.log(Status.INFO, "starting browser");
		test2.info("infor");
		test2.pass("fail test");
		test2.addScreenCaptureFromPath("screenshot.png");
	}
	@AfterTest
	public void tearDown()
	{
		driver.close();
		driver.quit();
		System.out.println("test completed");
	}
	@AfterSuite	
	public void terDown()
	{
		extent.flush();
	}
}
