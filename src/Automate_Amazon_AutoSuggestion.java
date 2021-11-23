import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.GeckoDriverInfo;

public class Automate_Amazon_AutoSuggestion {
	static {
//		System.setProperty("webdriver.chrome.driver","./Automation/driver/chromedriver.exe"); will not work 
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver","./driver/geckodriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
//		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://www.amazon.in/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("redmi");	

//		List<WebElement> allAutoSuggestion = driver.findElements(By.xpath("//div[contains(@id='issDiv']"));		
//		List<WebElement> allAutoSuggestion = driver.findElements(By.xpath("//div[contains(@class='suggestion']"));		
		List<WebElement> allAutoSuggestion = driver.findElements(By.xpath("//div[@id='suggestions']/div"));	

		int count=allAutoSuggestion.size();
		System.out.println(count);		
		
		for( WebElement sugg:allAutoSuggestion) {
			System.out.println(sugg.getText());
		}
		
		driver.close();
}
}
