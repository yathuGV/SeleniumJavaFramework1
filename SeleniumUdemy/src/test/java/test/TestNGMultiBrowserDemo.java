package test;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNGMultiBrowserDemo {
	WebDriver driver = null;
	
	@Parameters("BrowserName")
	@BeforeTest
	
	public void setup(String BrowserName)
	{
		System.out.println("browser name is: "+ BrowserName);
		if(BrowserName.equalsIgnoreCase("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		else
			if(BrowserName.equalsIgnoreCase("firefox"))
			{
				WebDriverManager.firefoxdriver().setup();
				driver = new FirefoxDriver();
			}
			else
				if(BrowserName.equalsIgnoreCase("edge"))
				{
					WebDriverManager.edgedriver().setup();
					driver = new EdgeDriver();
				}

	}
	
	@Test
	public void test1() throws InterruptedException
	{
		driver.get("https://google.com");
		Thread.sleep(3000);
	}
	
	@AfterTest
	public void tearDown()
	{
        if (driver != null) {
            driver.close();
            driver.quit();
        }
	}

}
