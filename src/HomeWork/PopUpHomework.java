package HomeWork;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PopUpHomework {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.careinsurance.com/rhicl/proposalcp/renew/index-care");
		driver.findElement(By.xpath("//input[@id='policynumber']")).sendKeys("123");
		driver.findElement(By.xpath("//input[@id='dob']")).click();
		WebElement year = driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
		Select s2=new Select(year);
		s2.selectByValue("1997");
		
		WebElement month = driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
		Select s1=new Select(month);
		s1.selectByIndex(5);
		
		driver.findElement(By.xpath("//a[.=15]")).click();
//		s2.selectByVisibleText("1997");
		driver.findElement(By.xpath("//input[@id='alternative_number']")).sendKeys("9845798457");
		
//		Thread.sleep(3000);
//		driver.close();
	}
}
