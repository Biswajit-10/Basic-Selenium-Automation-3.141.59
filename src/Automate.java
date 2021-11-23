import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Automate {
static {
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
}
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	Thread.sleep(4000);
	driver.get("https://en-gb.facebook.com/");
	System.out.println(driver.getTitle());
//	List<WebElement> allLinks = driver.findElements(By.tagName("img"));
	List<WebElement> allLinks = driver.findElements(By.xpath("//a|//img"));
	Thread.sleep(4000);
	System.out.println(allLinks.size());
//	WebElement w;  // we have to create variable inside loop
	for(WebElement w:allLinks) {
		System.out.println(w.getText());
	}
	driver.close();
	
}
}
