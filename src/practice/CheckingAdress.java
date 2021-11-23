package practice;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckingAdress {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		System.out.println(driver);
		driver.get("https://demo.actitime.com/login.do");
		System.out.println(driver);
		driver.close();
		
		
		
}
}
