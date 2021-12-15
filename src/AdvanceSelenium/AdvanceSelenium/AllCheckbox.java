package AdvanceSelenium;

import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.Scanner;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllCheckbox {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		Scanner sc=new Scanner(System.in);
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		System.out.println("type url");
		String url=sc.nextLine();
//		String url="https://en-gb.facebook.com/";
		driver.get(url);
		driver.findElement(By.linkText("Create New Account")).click();
		List<WebElement> allchkbx = driver.findElements(By.xpath("//input[@type='checkbox']"));
//		List<WebElement> allradbx = driver.findElements(By.xpath("//input[@type='radio']"));
		for (WebElement webElement : allchkbx) {
			Thread.sleep(2000);
			webElement.click();
		}
		Collections.reverse(allchkbx);
		for (WebElement webElement : allchkbx) {
			Thread.sleep(2000);
			webElement.click();			
		}
		driver.close();
}
}