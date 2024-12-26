package test;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutoItDemo {
	public static void main(String[] args) throws IOException {
		
		test();
	}
	
	public static void test() throws IOException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://ps.uci.edu/~franklin/doc/file_upload.html");
		driver.findElement(By.xpath("//input[@name='userfile']")).click();
		
		Runtime.getRuntime().exec("D:\\automation\\autoit\\testDoc.txt\\FileUploadTest.exe");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		driver.close();
	}

}
