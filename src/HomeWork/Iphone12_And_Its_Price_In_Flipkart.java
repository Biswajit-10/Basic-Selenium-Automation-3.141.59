package HomeWork;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iphone12_And_Its_Price_In_Flipkart {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.name("q")).sendKeys("iphone 12"+Keys.ENTER);
//		List<WebElement> product= driver.findElements(By.xpath("//div/div/div[3]/div/div[2]/div[contains(.,'APPLE iPhone 12')]//div[@class='_4rR01T']"));
		List<WebElement> product= driver.findElements(By.className("_4rR01T"));
//		List<WebElement> price  = driver.findElements(By.xpath("//div/div/div[3]/div/div[2]/div[contains(.,'APPLE iPhone 12')]//div[@class='_30jeq3 _1_WHN1']"));
//		List<WebElement> price  = driver.findElements(By.className("_30jeq3 _1_WHN1"));//not working
		List<WebElement> price  = driver.findElements(By.xpath("//div[@class='_30jeq3 _1_WHN1']"));
		
		int count=product.size();
		System.out.println(count);
		System.out.println(price.size());
		
		for(int i=0;i<count;i++) {
			System.out.println(product.get(i).getText() + "==>" +price.get(i).getText());
			
		}
		driver.close();
	}

}
