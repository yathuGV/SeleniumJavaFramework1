package Selpack;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserTest {
	public static void main(String[] args) {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		
//		try
//		{
//			  driver.get("https://www.google.lk/");
//			  WebElement textBox = driver.findElement(By.id("APjFqb"));
//			  textBox.sendKeys("Test Automation");
////			 System.out.println("Page Title: " + driver.getTitle());
//			  Thread.sleep(3000);
//		}
//		catch(Exception e)
//		{
//			System.out.println("An error occured : " +  e.getMessage());
//		}
//		finally
//		{
//			driver.quit();
//		}
//		 
		driver.get("https://www.google.lk/");
		driver.findElement(By.xpath("//textarea[@name='q']")).sendKeys("Test");
		
		List<WebElement> listOfWebEle =  driver.findElements(By.xpath("input"));
		int count = listOfWebEle.size();
		System.out.println("co8nt of input elements are: " + count);
	}

}
