import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Copy_Paste {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.opensourcebilling.org/en/users/sign_in");

		driver.findElement(By.id("email")).sendKeys(Keys.CONTROL+"ac"); //"a"+"c"
		Thread.sleep(4000);
		driver.findElement(By.id("password")).sendKeys(Keys.CONTROL+"av");
	}
	
}
