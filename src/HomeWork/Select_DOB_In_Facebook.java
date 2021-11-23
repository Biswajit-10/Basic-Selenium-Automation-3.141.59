package HomeWork;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Select_DOB_In_Facebook {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		driver.get("https:/en-gb.facebook.com");
		driver.findElement(By.linkText("Create New Account")).click();
		
		WebElement day= driver.findElement(By.id("day"));	
		WebElement month= driver.findElement(By.id("month"));	
		WebElement year= driver.findElement(By.id("year"));	
		
		Select s1=new Select(day);
		Select s2=new Select(month);
		Select s3=new Select(year);
		
		s1.selectByVisibleText("15");
		s2.selectByVisibleText("Jun");
		s3.selectByVisibleText("1997");
		Thread.sleep(3000);
		s2.selectByIndex(8);
		driver.close();
	}
}
