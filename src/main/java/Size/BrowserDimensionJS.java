package Size;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserDimensionJS {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ghs6kor\\Desktop\\Java\\chromedriver.exe");
	      WebDriver driver = new ChromeDriver();
	      String url = "https://www.tutorialspoint.com/index.htm";
	      driver.get(url);
	      // maximize the browser
	      driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(1));
	      JavascriptExecutor js = (JavascriptExecutor) driver;
	      // set size with window.resizeTo() method
	      js.executeScript("window.resizeTo(450,630);");
	      driver.close();
	}

}
