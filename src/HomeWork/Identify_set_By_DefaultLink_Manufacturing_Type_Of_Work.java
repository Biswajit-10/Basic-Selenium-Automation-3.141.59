package HomeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Identify_set_By_DefaultLink_Manufacturing_Type_Of_Work {
static {
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe/");
}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		
//		driver.findElement(By.name("username")).sendKeys("admin");
//		driver.findElement(By.cssSelector("input[name='username']")).sendKeys("admin");
		
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
		Thread.sleep(2000);
		driver.findElement(By.name("pwd")).sendKeys("manager");
		Thread.sleep(2000);
		
//		driver.findElement(By.xpath("//a[.='testing']/../../td[2]")).click();
//		driver.findElement(By.linkText("Login ")).click(); //written inside div tag i.e not a link
		
		driver.findElement(By.id("loginButton")).click(); 
		driver.findElement(By.className("popup_menu_button popup_menu_button_settings")).click(); 
//		driver.findElement(By.className("menu_icon")).click(); 
		driver.findElement(By.linkText("Types of Work")).click(); 
		driver.findElement(By.xpath("//a[.='manufacturing']/../../td[5]")).click(); 
		
		Thread.sleep(2000);
		driver.close();
		
	}

}
