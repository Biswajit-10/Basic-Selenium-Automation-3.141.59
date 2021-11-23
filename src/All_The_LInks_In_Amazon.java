import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class All_The_LInks_In_Amazon {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
		public static void main(String[] args) {
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.amazon.in/");
			List<WebElement> allLinks = driver.findElements(By.tagName("a"));
			
			int count=allLinks.size();
			System.out.println(count);
			for(int i=0;i<count;i++) {
			WebElement link1 = allLinks.get(i);
			
			System.out.println(link1);
			}
			driver.close();
		}
}
