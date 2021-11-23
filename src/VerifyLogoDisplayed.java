import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyLogoDisplayed {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		boolean logo=driver.findElement(By.xpath("//img[@alt='Facebook']")).isDisplayed();
		if(logo)
			System.out.println("logo is displayed");
		else
			System.out.println("logo is not displayed");
		
	}

}
