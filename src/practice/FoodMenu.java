package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FoodMenu {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Biswajit/Desktop/selenium/foodmenu.html");
		driver.findElement(By.linkText("FirstMenu")).click();
		driver.findElement(By.xpath("//span[.='BUY NOW']")).click();
		Thread.sleep(15000);
		driver.findElement(By.xpath("(//input[@type='tel'])[2]")).sendKeys("7077276850");
		Thread.sleep(15000);
		driver.findElement(By.xpath("(//span[.=' GET OTP '])[2]")).click();
		
}
	}
