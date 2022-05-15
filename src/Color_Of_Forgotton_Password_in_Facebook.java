import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.logging.LogEntry;

public class Color_Of_Forgotton_Password_in_Facebook {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		List<LogEntry> logEntries = driver.manage().logs().get("logcat").getAll();
		for (LogEntry logEntry : logEntries) {
		        System.out.println(logEntry);
		}
		
//		driver.findElement(By.xpath("//font[text()='Forgot password?']"));
		WebElement link =driver.findElement(By.linkText("Forgotten password?"));
		String color=link.getCssValue("color");	
		String fontSize=link.getCssValue("font-size");	
		String fontFamily=link.getCssValue("font-family");	
		System.out.println("color is:"+color+"\nfont size is:font size "+fontSize+"\nfont type is :"+fontFamily);
		driver.close();
	}

}
