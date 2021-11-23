import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Print_All_Selected_Option {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
//		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("file:///C:/Users/Biswajit/Desktop/selenium/Food.html");
		WebElement slvListBox = driver.findElement(By.id("slv"));
		
		Select s=new Select(slvListBox);
		
		List<WebElement> allOption = s.getAllSelectedOptions();
		System.out.println("no of selected element:"+allOption.size());

		for(WebElement w:allOption) {
			System.out.println(w.getText());
		}
		driver.close();
}
}
