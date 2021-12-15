package From_23_09;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class YatraFlight {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver","./driver/geckodriver.exe");
	}
	public static void main(String[] args) {
//		WebDriver driver=new ChromeDriver();
		FirefoxOptions option=new FirefoxOptions();
		option.addArguments("--disable-notifications");
		WebDriver driver=new FirefoxDriver(option);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.yatra.com/");
		driver.findElement(By.id("BE_flight_origin_city")).click();
		driver.findElement(By.xpath("//p[.='Bangalore (BLR)']")).click();
		
		driver.findElement(By.id("allow")).click();
		driver.findElement(By.xpath("//p[.='Goa (GOI)']")).click();
		driver.findElement(By.id("BE_flight_origin_date")).click();
		driver.findElement(By.id("30/09/2021")).click();
		driver.findElement(By.id("BE_flight_flsearch_btn")).click();
		List<WebElement> name = driver.findElements(By.xpath("//span[@class='i-b text ellipsis']"));
		List<WebElement> dtime = driver.findElements(By.xpath("//div[@class='i-b pr']"));
		for(int i=0;i<name.size();i++) {
			System.out.println(name.get(i).getText()+"=>"+dtime.get(i).getText());
		}
		driver.close();
	}
}
