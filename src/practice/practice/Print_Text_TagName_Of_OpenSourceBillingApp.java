package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Print_Text_TagName_Of_OpenSourceBillingApp {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.opensourcebilling.org/en/users/sign_in");
		WebElement w = driver.findElement(By.id("email"));
		System.out.println("a"+w.getText());
		System.out.println("b"+w.getTagName());
		System.out.println("c"+w.getAttribute("name"));
		
		w.clear();
		driver.findElement(By.id("password")).clear();
		driver.close();
	}
}
