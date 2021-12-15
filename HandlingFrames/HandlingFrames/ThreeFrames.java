package HandlingFrames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ThreeFrames {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Biswajit/Desktop/selenium/page1.html");
		driver.switchTo().frame(0);
		driver.findElement(By.id("t2")).sendKeys("a");
		driver.switchTo().frame(0);
		driver.findElement(By.id("t3")).sendKeys("b");
		driver.switchTo().defaultContent().findElement(By.id("t1")).sendKeys("c");
		driver.switchTo().frame(0).findElement(By.id("t2")).sendKeys("d");
		driver.switchTo().defaultContent().findElement(By.id("t1")).sendKeys("e");
		
//		driver.close();
	}
}
