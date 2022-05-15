package HomeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Apple_Iphone12_Pro_Amazon_in {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe/");
	}
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.amazon.in/s?k=iphone+12+pro&crid=2NXWHKPQ1KFXX&sprefix=iphone+12%2Caps%2C369&ref=nb_sb_noss_2");
	
	WebElement w=driver.findElement(By.xpath("//span[.='New Apple iPhone 12 Pro (128GB) - Pacific Blue']/../../../../div[3]/div[1]/div/div[1]/div[2]/a[1]/span[1]/span[2]/span[2]"));
//  //span[.='New Apple iPhone 12 Pro (128GB) - Pacific Blue']/../../../..//span[@class='a-price-whole']
	String price=w.getText();
	System.out.println("price of apple iphone is: "+price);
	driver.close();
}
}
