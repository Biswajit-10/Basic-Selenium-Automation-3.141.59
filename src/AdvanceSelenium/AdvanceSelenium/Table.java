package AdvanceSelenium;

import java.util.List;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table {
	static {
		
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		System.out.println("type url");
		String url=sc.nextLine();
		driver.get(url);
		List<WebElement> allchkbx = driver.findElements(By.xpath("//td"));
		for (WebElement webElement : allchkbx) {			
			System.out.println(webElement.getText());
		}
	}
}
