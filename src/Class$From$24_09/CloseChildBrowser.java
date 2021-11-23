package Class$From$24_09;

import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseChildBrowser {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);

		driver.get("https://www.naukri.com/");
		String parent = driver.getTitle();

		Set<String> allwh = driver.getWindowHandles();

		for(String wh:allwh) {
			driver.switchTo().window(wh);
			String child = driver.getTitle();
			//		 if(parent==child) 
			if(!parent.equals(child)) 

			{
				driver.close();

			}
			else {
			}
		}
	}
}
