import java.util.HashSet;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Select_AllOption_DeselectBy_Reverse_Order {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("file:///C:/Users/Biswajit/Desktop/selenium/Food.html");
		WebElement mtrListBox = driver.findElement(By.id("mtr"));
		
		Select s=new Select(mtrListBox);
		List<WebElement> allOption = s.getOptions();
		
		int count=allOption.size();
		
		for(int i=0;i<count;i++) {
			s.selectByIndex(i);
			Thread.sleep(1000);
			}
		for(int i=count-1;i>=0;i--) {
			s.deselectByIndex(i);
			Thread.sleep(1000);
		}
	
		driver.close();
	}


}
