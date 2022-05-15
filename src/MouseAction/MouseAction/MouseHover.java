package MouseAction;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
	
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.vtiger.com/");
		driver.manage().window().maximize();
		Actions a=new Actions(driver);
		WebElement target = driver.findElement(By.xpath("(//a[@id='navbarPages'])[2]"));
		a.moveToElement(target).perform();
		driver.findElement(By.xpath("(//a[contains(.,'Contact Us')])[1]")).click();
		WebElement e = driver.findElement(By.xpath("//p[contains(.,'Bengaluru')]/..//p[2]"));
		System.out.println(e.getText());
		driver.close();
}
}