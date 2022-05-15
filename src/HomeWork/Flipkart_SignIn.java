package HomeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart_SignIn {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//a[.='Login']")).click(); 
		driver.findElement(By.className("_2IX_2- VJZDxU")).sendKeys("samalbiswajit20@gmail.com"); 
		driver.findElement(By.className("_2IX_2- _3mctLh VJZDxU")).sendKeys("miluflipkart");
		driver.findElement(By.className("_2KpZ6l _2HKlqd _3AWRsL")).click(); 
		
		
	}
}
