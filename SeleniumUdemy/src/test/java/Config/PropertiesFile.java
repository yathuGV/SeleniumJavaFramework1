package Config;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

import test.TestNgTest;

public class PropertiesFile {

	static Properties prop = new Properties();
	static String projectpath = System.getProperty("user.dir");

	public static void main(String[] args) throws IOException {
		getProperties();
		setProperties();
		getProperties();
	}

	public static void getProperties() throws IOException
	{


		try {

			InputStream input = new FileInputStream(projectpath + "/src/test/java/Config/Config.properties");

			prop.load(input);
			String browser = prop.getProperty("browser");
			System.out.println(browser);
			TestNgTest.browserName = browser;

		} 
		catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("e.getMessage()");
			System.out.println("e.getCause()");
			System.out.println("e.printStackTrace()");
		}
	}
	public static void setProperties()
	{
		try {
			OutputStream output = new FileOutputStream(projectpath + "/src/test/java/Config/Config.properties");
			prop.setProperty("result", "pass");
			prop.store(output, null);
		}

		catch(Exception e)
		{
			System.out.println("e.getMessage()");
			System.out.println("e.getCause()");
			System.out.println("e.printStackTrace()");
		}

	}

}
