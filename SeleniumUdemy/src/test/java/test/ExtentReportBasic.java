package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExtentReportBasic {
	static WebDriver driver =null;
	public static void main(String[] args) {
		
		ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("extentReport.html");
		
		ExtentReports extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
		
		ExtentTest test = extent.createTest("Google search test", "validate google search");
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		test.log(Status.INFO, "starting browser");
		driver.get("https://www.google.lk/");
		test.pass("navigated to google");
		
		driver.findElement(By.name("q")).sendKeys("Test automation");
		test.pass("entered text into search box");
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS); 
		
		
		driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
		test.pass("entered keyboard enter key");
		
		driver.close();
		test.info("test completed");
		
		//2n test
		ExtentTest test2 = extent.createTest("Google search test 2", "validate google search 2");
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		test2.log(Status.INFO, "starting browser");
		driver.get("https://www.google.lk/");
		test2.pass("navigated to google");
		
		driver.findElement(By.name("q")).sendKeys("Test automation");
		test2.fail("entered text into search box");
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS); 
		
		
		driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
		test2.pass("entered keyboard enter key");
		
		driver.close();
		test2.info("test completed");
		
		extent.flush();
	}

}
