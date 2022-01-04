import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseActionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shree\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		Actions actions=new Actions(driver);
		WebElement movetoelement=driver.findElement(By.xpath("//div[contains(text(),'Recruiters')]"));
		actions.moveToElement(movetoelement).perform();
		
		driver.navigate().to("https://demoqa.com/buttons");
		WebElement Doubleclick=driver.findElement(By.xpath("//button[@id='doubleClickBtn']"));
		WebElement rightclick=driver.findElement(By.xpath("//button[@id='rightClickBtn']"));
		WebElement clickme=driver.findElement(By.xpath("//button[text()='Click Me']"));
		actions.doubleClick(Doubleclick).perform();
		actions.contextClick(rightclick).perform();
		actions.click(clickme).perform();
		
		driver.navigate().to("https://demoqa.com/droppable");
		WebElement DragMeBtn=driver.findElement(By.xpath("//*[@id='draggable']"));
		WebElement DropHereBtn=driver.findElement(By.xpath("//*[@id='draggable']//following-sibling::div[@id='droppable']"));
		
		actions.dragAndDrop(DragMeBtn, DropHereBtn).perform();
		
		driver.navigate().to("https://demoqa.com/tool-tips");
		WebElement HoverMeToSee=driver.findElement(By.xpath("//button[@id='toolTipButton']"));
		actions.moveToElement(HoverMeToSee).perform();
		System.out.println(driver.findElement(By.xpath("//div[@id='buttonToolTip']")).getText());
	}

}
