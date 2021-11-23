package HomeWork;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Options_In_Alphabetical_Order {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		TreeSet<String> t_set=new TreeSet<>();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("file:///C:/Users/Biswajit/Desktop/selenium/Food.html");
		WebElement mtrListBox = driver.findElement(By.id("mtr"));
		
		Select s=new Select(mtrListBox);
		List<WebElement> allOption = s.getOptions();
		for(WebElement w:allOption) {
			t_set.add(w.getText());
		}
		driver.close();
	}
}
	class Options_In_Alphabetical_Order2 {
		static {
			System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		}
		public static void main(String[] args) {
			
			WebDriver driver=new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			driver.get("file:///C:/Users/Biswajit/Desktop/selenium/Food.html");
			WebElement mtrListBox = driver.findElement(By.id("mtr"));
			
			Select s=new Select(mtrListBox);
			List<WebElement> allOption = s.getOptions();
			
	
			ArrayList<String> al = new ArrayList<>();
			
			for(WebElement w:allOption) {
				al.add(w.getText());
			}
			Collections.sort(al);
			for(String food:al) {
				System.out.println(food);
			}
		
			driver.close();
		}
	

	}
