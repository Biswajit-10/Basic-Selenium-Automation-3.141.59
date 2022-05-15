package HomeWork;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CaptureUrl_of_WiproJobs {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
	    driver.findElement(By.name("q")).sendKeys("wipro jobs"+Keys.ENTER);
		List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		System.out.println("number of links present are "+allLinks.size());
		for(WebElement link:allLinks) {
			
			System.out.println(link.getAttribute("href"));
		}
		driver.close();
}
}
