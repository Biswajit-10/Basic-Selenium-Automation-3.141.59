package MouseAction;

import java.awt.AWTException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick_Vtiger {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws AWTException {
	
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.vtiger.com/");
		
		Actions a=new Actions(driver);
		WebElement target = driver.findElement(By.xpath("(//a[@id='navbarPages'])[2]"));
		a.moveToElement(target).perform();;
		driver.findElement(By.xpath("(//a[contains(.,'Customers')])[1]")).click();
		
		target=driver.findElement(By.linkText("READ FULL STORY"));
		a.moveToElement(target).doubleClick().perform();
//		a.doubleClick(target).perform();
 		String title = driver.getTitle();
 		if(title.contains("HackerEarth Case Study"))
 			System.out.println("HackerEarth page is displayed");
}
}
