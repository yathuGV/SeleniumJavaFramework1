package test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HeadlessChromeDemo {
	public static void main(String[] args) {
		test();
	}
	
	public static void test()
	{
		ChromeOptions cp = new ChromeOptions();
		cp.addArguments("--headless");
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(cp);
		
		driver.get("https://www.google.com/");
		System.out.println(driver.getTitle());
		
		driver.findElement(By.name("q")).sendKeys("test autiomation");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
		
		driver.close();
		System.out.println("completed the test");
		
	}

}
