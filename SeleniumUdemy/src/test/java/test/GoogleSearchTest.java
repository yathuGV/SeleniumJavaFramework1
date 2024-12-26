package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

import pages.GoogleSearchPage;

public class GoogleSearchTest {
	private static WebDriver driver = null;
	public static void main(String[] args) 
	{
		googleSearch();
	}
	
	public static void googleSearch()
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");

		GoogleSearchPage.textbox_search(driver).sendKeys("Test Automation step by step");
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS); 
		
		GoogleSearchPage.button_search(driver).sendKeys(Keys.RETURN);
		
		
		driver.close();
		System.out.println("test completed");
	}
}
