import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class windoehandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shree\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		String MinsWindow=driver.getWindowHandle();
		
		Set<String> childwindows=driver.getWindowHandles();
		
		Iterator<String> itr=childwindows.iterator();
		
		while(itr.hasNext()) {
			
			String childwindow=itr.next();
			if(!MinsWindow.equalsIgnoreCase(childwindow)) {
				driver.switchTo().window(childwindow);
				System.out.println(driver.getTitle());
				//driver.close();
				
			}
			driver.switchTo().window(MinsWindow);
			driver.close();
			
		}
	}

}
