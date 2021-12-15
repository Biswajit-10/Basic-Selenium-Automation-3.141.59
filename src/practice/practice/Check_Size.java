package practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Check_Size {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://en-gb.facebook.com/");
		WebElement a = driver.findElement(By.xpath("(//div[@class='_6lux'])[1]"));
		WebElement b = driver.findElement(By.xpath("(//div[@class='_6lux'])[2]"));
		
		if(a.getLocation().getX()==b.getLocation().getX()) {
			System.out.println("properly aligned");
		}
		int hgt=a.getSize().getHeight();
		int wdt=a.getSize().getWidth();
		int ht =b.getSize().getHeight();
		int wt =b.getSize().getWidth();
		if(hgt==ht && wt==wdt ) {
			System.out.println("equal size box");
		}
		driver.close();
	}

}
