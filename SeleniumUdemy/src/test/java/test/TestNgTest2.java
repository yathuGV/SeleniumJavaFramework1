package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


public class TestNgTest2 
{
	private static WebDriver driver = null;
	
	@BeforeTest
	public void setupTest()
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();		
	}
	
	@Test
	public void googleSearch2()
	{	
		driver.get("https://www.google.lk/");
		driver.findElement(By.name("q")).sendKeys("Test");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS); 
		driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
	}
	@Test
	public void googleSearch3()
	{	
		driver.get("https://www.google.lk/");
		driver.findElement(By.name("q")).sendKeys("Test");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS); 
		driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
	}
	@AfterTest
	public void tearDown()
	{
		driver.close();
		driver.quit();
		System.out.println("test completed");
	}
}
