package HomeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PriceOf_MiBand5_Present_In_Flipkart {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/search?q=mi%20band%205");
		
		WebElement w=driver.findElement(By.xpath("//div[.='Mi Smart Band 5']/../../div[2]/div/div/div[1]"));
		String price=w.getText();
		System.out.println("price of mi band 5 is: "+price);
		driver.close();
	}
}
