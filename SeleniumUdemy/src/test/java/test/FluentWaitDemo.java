package test;

import java.time.Duration;
import java.util.NoSuchElementException;

import javax.swing.text.Element;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import com.google.common.base.Function; // Import for FluentWait Function
import io.github.bonigarcia.wdm.WebDriverManager;

public class FluentWaitDemo {

    public static void main(String[] args) throws InterruptedException {
        test();
    }

    public static void test() throws InterruptedException {
        // Setting up ChromeDriver
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        // Navigate to Google
        driver.get("https://www.google.com/");

        // Perform a search
        driver.findElement(By.name("q")).sendKeys("abcd");
        Thread.sleep(3000);
        driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);

        // Click a link
//        driver.findElement(By.linkText("ABCD cats & vets Europe")).click();

        // Implement FluentWait
        Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(60)) // Maximum wait time
                .pollingEvery(Duration.ofSeconds(2)) // Polling frequency
                .ignoring(NoSuchElementException.class); // Ignore exceptions

        // Wait for the element with ID "foo"
        WebElement foo = wait.until(new Function<WebDriver, WebElement>() {
            public WebElement apply(WebDriver driver) {
                WebElement element = driver.findElement(By.xpath("(//h3[@class='LC20lb MBeuO DKV0Md'])[1]"));
                if (element.isDisplayed()) {
                    return element;
                } else {
                    return null;
                }
            }
        });

        // Perform actions on the found element (if needed)
        System.out.println("Element found: " + foo.getText());
        foo.click();
        Thread.sleep(3000);

        // Close the browser
        driver.close();
    }
}
