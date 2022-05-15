package practice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class No_Of_Links_In_Flipkart {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver","./driver/geckodriver.exe");
	}
		public static void main(String[] args) {
			ChromeDriver driver=new ChromeDriver();
			driver.get("https://www.flipkart.com/");
			List<WebElement> allLinks = driver.findElements(By.tagName("a"));
			
			System.out.println(driver);
//			System.out.println(allLinks);
			WebElement link1 = allLinks.get(0);
			WebElement link2 = allLinks.get(1);
			System.out.println(link1);
			System.out.println(link2);
//			ArrayList a=(ArrayList)allLinks;
//			int count=a.size();
//		int count=allLinks.size();
//		System.out.println(count);
			
		
//		  for(WebElement w:allLinks) {
//		  String x = w.getText(); System.out.println(x); 
//		  }
//		  Iterator<WebElement> i=allLinks.iterator(); 
//		  while	(i.hasNext()) {
//			  System.out.println(i.next().getText());
//			  
//		  }
		  			
//			Object b = a.get(0);
//			 System.out.println(b);
//			String text1=b.getText();

			driver.close();
		}
}
