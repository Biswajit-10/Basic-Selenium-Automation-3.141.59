package practice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Automate_Flipkart_AutoSuggestion {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");
		try {
			driver.findElement(By.xpath("(//div/div)[1]")).click();
		}
		catch (Exception e) {
			System.out.println("not found");
		}
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("iphone");	

		List<WebElement> allAutoSugg1 = driver.findElements(By.xpath("//ul/li/div[contains(.,'iphone')]/a/div[2]/span"));	
		List<WebElement> allAutoSugg2 = driver.findElements(By.xpath("//ul/li/div[contains(.,'iphone')]/a/div[2]"));	
		Thread.sleep(8000);

		int count=allAutoSugg1.size();
		System.out.println(count);		
		
		for( WebElement sugg:allAutoSugg2) {
			System.out.println(/* "iphone"+ */sugg.getText());
		}
		
		driver.close();
}
}
