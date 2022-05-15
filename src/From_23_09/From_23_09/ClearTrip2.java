package From_23_09;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClearTrip2 {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.cleartrip.com/flights");
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("BLR - Bangalore, IN"+Keys.ENTER);
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("GOI - Goa, IN"+Keys.ENTER);
		
		JavascriptExecutor j=(JavascriptExecutor) driver;
		
		driver.findElement(By.xpath("(//button)[4]")).click();
		j.executeAsyncScript("window.scrollBy(0,100)");
		
		driver.findElement(By.xpath("//div[.='30']")).click();
		driver.findElement(By.xpath("//button[.='Search flights']")).click();
		List<WebElement> allflightnames = driver.findElements(By.xpath("//img[@class]"));
		List<WebElement> depttime = driver.findElements(By.xpath("//div[@class='ms-grid-column-1 ms-grid-row-1']"));
		
		for(int i=0;i<allflightnames.size();i++) {
			System.out.println(allflightnames.get(i).getAttribute("alt") + "==>" +depttime.get(i).getText());

		}
}
}