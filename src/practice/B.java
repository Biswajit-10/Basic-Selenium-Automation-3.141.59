package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class B {
		static {
			System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		}
			public static void main(String[] args) {
				WebDriver driver=new ChromeDriver();
				driver.get("https://www.airtel.in/");
				WebElement a= driver.findElement(By.xpath("(//a)[1]"));
				WebElement b= driver.findElement(By.xpath("(//a)[2]"));
				System.out.println(a);
				System.out.println(b);
				driver.close();
			
	}

}
