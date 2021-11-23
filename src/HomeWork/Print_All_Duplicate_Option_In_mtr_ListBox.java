package HomeWork;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Print_All_Duplicate_Option_In_mtr_ListBox {

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
		for(int i=0;i<allOption.size();i++) {
			for(int j=0;j<allOption.size();j++) {
				if(allOption.get(i).getText().equals(allOption.get(j).getText()) && (i!=j)) {
					  System.out.println(allOption.get(i).getText());
				}
			}
		}
		driver.close();
	}
}

//if(allOption.get(i).getText()==allOption.get(j).getText()) not working






