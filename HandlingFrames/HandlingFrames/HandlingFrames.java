package HandlingFrames;

import java.awt.AWTException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingFrames {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws AWTException {
	
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("file:///C:/Users/Biswajit/Desktop/selenium/page1.html");
		
		driver.findElement(By.id("t1")).sendKeys("qsp");
		driver.switchTo().frame(0);
		driver.findElement(By.id("t2")).sendKeys("jsp");;
		driver.switchTo().parentFrame();
		driver.findElement(By.id("t1")).sendKeys("q");
		
		
}
}