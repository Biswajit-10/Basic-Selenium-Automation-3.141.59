package HandlingDisabledElementsAndScrollBar;

import java.awt.AWTException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class HandlingDisabledElements {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws AWTException, InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Biswajit/Desktop/selenium/disabled.html");
		driver.findElement(By.id("t1")).sendKeys("admin");
		RemoteWebDriver rwd =(RemoteWebDriver) driver;
		rwd.executeScript("document.getElementById('t2').value='manager'");
//		Thread.sleep(3000);
//		rwd.executeScript("document.getElementById('t2').value=''");
		rwd.executeScript("document.getElementById('t3').click()");
	}
}
