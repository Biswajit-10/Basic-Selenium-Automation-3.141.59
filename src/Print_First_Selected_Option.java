import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Print_First_Selected_Option {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("file:///C:/Users/Biswajit/Desktop/selenium/Food.html");
		WebElement slvListBox = driver.findElement(By.id("slv"));
		
		Select s=new Select(slvListBox);
		s.selectByIndex(5);
		System.out.println(s.getFirstSelectedOption().getText());//printing the element which is already selected
		List<WebElement> a = s.getAllSelectedOptions();
		System.out.println("no of selected element:"+a.size());
		for(WebElement w:a) {
			System.out.println(w.getText());
		}
		System.out.println();
//		driver.close();
}
}