package HomeWork;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Top_Latest_News {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.bbc.com/");
		List<WebElement> topNews = driver.findElements(By.xpath("//span[@class='top-list-item__bullet']/../../..//h3"));
		for(WebElement news:topNews) {
			System.out.println(news.getText());
		}
			driver.close();
	}
}
