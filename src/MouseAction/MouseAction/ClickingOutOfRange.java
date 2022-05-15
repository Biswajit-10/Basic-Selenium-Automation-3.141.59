package MouseAction;

import java.awt.AWTException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ClickingOutOfRange {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver","./driver/geckodriver.exe");
	}
	public static void main(String[] args) {
	
		WebDriver driver=new ChromeDriver();
//		WebDriver driver=new FirefoxDriver();
//		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.vtiger.com/");
		
		Actions a=new Actions(driver);
		WebElement target = driver.findElement(By.xpath("(//a[@id='navbarPages'])[2]"));
		a.moveToElement(target).perform();;
		driver.findElement(By.xpath("(//a[contains(.,'Customers')])[1]")).click();
		
		int y=driver.findElement(By.xpath("(//a[contains(.,'Download')])[2]")).getLocation().getY();
		JavascriptExecutor j=(JavascriptExecutor)driver;
		j.executeScript("window.scrollTo(0,"+y+")");
		
		WebDriverWait wait =new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//a[.='READ THE CASE'])[24]")));
		
		driver.findElement(By.xpath("(//a[.='READ THE CASE'])[24]")).click();
//		a.moveToElement(target).click().perform();
 		
}
}
