package HandlingDisabledElementsAndScrollBar;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingScrollBars {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws AWTException, InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bbc.com/");
//		JavascriptExecutor j= (JavascriptExecutor) driver;
//		j.executeScript("window.scrollBy(0,4000)");
//		Thread.sleep(4000);
		int y=driver.findElement(By.xpath("//span[.='Future Planet']")).getLocation().getY();
		JavascriptExecutor j= (JavascriptExecutor) driver;
		j.executeScript("window.scrollBy(0,"+y+")");
		
//		driver.close();
}
}