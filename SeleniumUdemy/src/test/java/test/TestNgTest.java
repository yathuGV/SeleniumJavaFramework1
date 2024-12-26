package test;

import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Config.PropertiesFile;
import io.github.bonigarcia.wdm.WebDriverManager;


public class TestNgTest 
{
	private static WebDriver driver = null;
	public static String browserName = null;
	
	@BeforeTest
	public void setupTest() throws IOException
	{
		PropertiesFile.getProperties();
		if(browserName.equalsIgnoreCase("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();			
		}
		else if(browserName.equalsIgnoreCase("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}

		
		
	}
	
	@Test
	public void googleSearch() throws InterruptedException
	{
		
		driver.get("https://www.google.lk/");
		driver.findElement(By.name("q")).sendKeys("Test");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("btnK")));
		driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
		

	}
	
	@AfterTest
	public void tearDown()
	{
		driver.close();
//		driver.quit();
		System.out.println("test completed");
		PropertiesFile.setProperties();
		
	}
}
