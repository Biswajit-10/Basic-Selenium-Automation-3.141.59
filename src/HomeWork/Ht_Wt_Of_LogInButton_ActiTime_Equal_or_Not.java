package HomeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.cache.Weigher;

public class Ht_Wt_Of_LogInButton_ActiTime_Equal_or_Not {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		WebElement un=driver.findElement(By.name("username"));
		WebElement pwd=driver.findElement(By.name("pwd"));
		int height1= un.getSize().getHeight();
		int width1= un.getSize().getWidth();
		int height2= pwd.getSize().getHeight();
		int width2= pwd.getSize().getWidth();
		if(height1==height2)
		System.out.println("height is same");
		if(width1==width2)
		System.out.println("width is same");
		
		driver.close();
	}
}
