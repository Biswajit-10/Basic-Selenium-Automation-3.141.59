package HomeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Milu {
		static {
			System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		}
		public static void main(String[] args) throws InterruptedException {
			WebDriver driver=new ChromeDriver();
			driver.get("https://en-gb.facebook.com/");
//			driver.findElement(By.className("_8esk")).click();
			Thread.sleep(4000);
			driver.findElement(By.cssSelector("a[id='u_0_2_rQ']")).click();
			
			
		}
	}
