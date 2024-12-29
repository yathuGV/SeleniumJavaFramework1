package test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DesiredCapabilities 
{
	public static void main(String[] args) 
	{
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		
//		DesiredCapabilities cap = new DesiredCapabilities();
//		cap.setCa
		
		driver.get("https://google.com");
		driver.findElement(By.name("q")).sendKeys("abc");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
		
		driver.close();
		driver.quit();
		System.out.println("test completed");
		
		
	}

	public static DesiredCapabilities chrome() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setCapability(String string, String string2) {
		// TODO Auto-generated method stub
		
	}

}
