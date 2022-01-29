import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;


public class launchedgw {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.edge.driver", "C:\\Users\\Shree\\Downloads\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		
/*		WebElement username=driver.findElement(By.name("email"));
		username.sendKeys("mandarsrk@gmail.com");
		
		WebElement passwd=driver.findElement(By.id("pass"));
		passwd.sendKeys("snake$123");
		
		WebElement Btn=driver.findElement(By.name("login"));
		Btn.click();  */
		
		WebElement Forgot=driver.findElement(By.className("_8esh"));
		Forgot.click();
	}

}
