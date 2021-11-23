package HomeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Check_LogIn_In_Facebook_isEnabled_or_Not {
static {
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
}
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	boolean login=driver.findElement(By.name("login")).isEnabled();
	if(login)
		System.out.println("login key is enabled");
	else
		System.out.println("login key is not enabled");
	driver.close();
	
}
}
