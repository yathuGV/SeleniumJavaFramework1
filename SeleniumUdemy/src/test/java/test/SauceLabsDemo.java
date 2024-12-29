package test;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class SauceLabsDemo {
	
	public static final String USERNAME = "oauth-vadivelyathursan-a865d";
	public static final String ACCESS_KEY ="3c9bc698-d4b8-4167-8075-3d204077fa00";
	public static final String URL = "https://" + USERNAME + ":" + ACCESS_KEY + "@ondemand.saucelabs.com:443/wd/hub";
	
//	ChromeOptions options = new ChromeOptions();
//	options.setPlatformName("Windows 10");
//	options.setBrowserVersion("latest");
//
//	Map<String, Object> sauceOptions = new HashMap<>();
//	sauceOptions.put("username", System.getenv("oauth-vadivelyathursan-a865d"));
//	sauceOptions.put("accessKey", System.getenv("3c9bc698-d4b8-4167-8075-3d204077fa00"));
//	sauceOptions.put("name", testInfo.getDisplayName());
//
//	options.setCapability("sauce:options", sauceOptions);
	
	public static void main(String[] args) {
		DesiredCapabilities caps = DesiredCapabilities.chrome();
		caps.setCapability("platform", "Windows 10");
		caps.setCapability("version", "92");
//		caps.setCapability("build", myTestBuild);
//		caps.setCapability("name", myTestName);
		
//		WebDriver driver = new RemoteWebDriver(new URL(sauceUrl), caps);
	}

}
