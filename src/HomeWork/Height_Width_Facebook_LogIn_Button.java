package HomeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Height_Width_Facebook_LogIn_Button{
static {
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
}
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	System.out.println(driver.getTitle());
	WebElement loginbtn=driver.findElement(By.name("login"));
	int height = loginbtn.getSize().getHeight();
	int width= loginbtn.getSize().getWidth();
	
	System.out.println("height is "+height+" pixel");
	System.out.println("width is "+width+" pixel");
	
	driver.close();
}
}
