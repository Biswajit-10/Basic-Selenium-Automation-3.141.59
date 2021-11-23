package Tabs;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://demo.actitime.com/login.do");
		driver.findElement(By.linkText("actiTIME Inc.")).click();
		Set<String> alltabs = driver.getWindowHandles();
		
//		List t=new ArrayList(alltabs);
//		
//		System.out.println(t.get(1));
//		System.out.println(t.get(0));
		
//		Iterator<String> tabs = alltabs.iterator();
//		while(tabs.hasNext())
//		String b = tabs.next();
//		String a = tabs.next();
//		driver.switchTo().window(a);
//		Thread.sleep(4000);
//		driver.close();
//	
//		driver.switchTo().window(b);
//		Thread.sleep(4000);
//		driver.close();
//		
}
}