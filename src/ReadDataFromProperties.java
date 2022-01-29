import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadDataFromProperties {

	public static void main(String[] args) throws IOException {
		
		FileInputStream file=new FileInputStream("C:\\Users\\Shree\\eclipse-workspace\\Selenium_Java_Sep_21\\File.properties");
		Properties prop = new Properties();
		prop.load(file);
		
		System.setProperty("webdriver.chrome.driver", prop.getProperty("driverpath"));
		WebDriver driver=new ChromeDriver();
		driver.get(prop.getProperty("url"));

	}

}
