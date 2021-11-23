package practice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopUps_Practice {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.seleniumeasy.com/test/javascript-alert-box-demo.html");
		driver.findElement(By.xpath("(//button[.='Click me!'])[1]")).click();
		Alert a = driver.switchTo().alert() ;
		System.out.println(a.getText());
		Thread.sleep(2000);
		a.dismiss();
		driver.findElement(By.xpath("(//button[.='Click me!'])[2]")).click();
		Alert b = driver.switchTo().alert() ;
		System.out.println(b.getText());
		Thread.sleep(2000);
		b.dismiss();
		driver.findElement(By.xpath("//button[.='Click for Prompt Box']")).click();
		Alert c = driver.switchTo().alert() ;
		c.sendKeys("hello");
		System.out.println(c.getText());
		Thread.sleep(2000);
		c.accept();
		
		
}
}