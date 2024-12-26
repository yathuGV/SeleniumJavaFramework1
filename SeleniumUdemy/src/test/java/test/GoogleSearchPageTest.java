package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.GoogleSearchPageObject;

public class GoogleSearchPageTest {
	private static WebDriver driver = null;
	
	public static void main(String[] args) 
	{
		googleSearchTest();
	}
	
	public static void googleSearchTest() 
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		GoogleSearchPageObject obj = new GoogleSearchPageObject(driver);
		
		driver.get("https://google.com");
		
		obj.setTextInSearchBox("test automation");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS); 
		
		obj.clickSearchButton();
		
		driver.close();
		
	}
}
