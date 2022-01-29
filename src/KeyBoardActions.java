import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBoardActions {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shree\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/text-box");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		Actions actions=new Actions(driver);
		
		//driver.findElement(By.xpath("//a[@id='close-fixban']")).click();
		
		
		WebElement FullName=driver.findElement(By.xpath("//*[@type='text']"));
		WebElement Email=driver.findElement(By.xpath("//*[@type='email']"));
		WebElement CurrAddress=driver.findElement(By.xpath("//*[@id='currentAddress']"));
		WebElement Peraddress=driver.findElement(By.xpath("//textarea[@id='permanentAddress']"));
		WebElement Submit=driver.findElement(By.xpath("//button[@id='submit']"));
		
		actions.sendKeys(FullName, "Mandar Deshpande").perform();
		actions.sendKeys(Email, "dmandar86@gmail.com").perform();
		actions.sendKeys(CurrAddress, "At Ambajogai Tal Ambajogai Dist Beed 431517").perform();
		
		//select current address using ctrl-a
		actions.keyDown(Keys.CONTROL);
		actions.sendKeys("a");
		actions.keyUp(Keys.CONTROL);
		actions.build().perform();
		
		//select copy using ctrl-c
		actions.keyDown(Keys.CONTROL);
		actions.sendKeys("c");
		actions.keyUp(Keys.CONTROL);
		actions.build().perform();
		
		//move tab to permanant address
		actions.sendKeys(Keys.TAB);
		actions.perform();
		
		//paste in permananat address
		actions.keyDown(Keys.CONTROL);
		actions.sendKeys("v");
		actions.keyUp(Keys.CONTROL);
		actions.build().perform();
		
		//move to click submit
		actions.sendKeys(Keys.TAB);
		actions.build().perform();
		actions.click(Submit).build().perform();
		
	}

}
