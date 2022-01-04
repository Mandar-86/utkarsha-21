import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class launchchrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shree\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		
		WebElement username=driver.findElement(By.xpath("//*[@class='_6lux'][1]//child::input"));
		username.sendKeys("mandarsrk@gmail.com");
		WebElement password=driver.findElement(By.xpath("//*[@class='_6lux'][2]//child::input"));
		password.sendKeys("Snake$123");
		
	}

}
