package Size;

import java.time.Duration;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserDimension {
	  public static void main(String[] args) {
	      System.setProperty("webdriver.chrome.driver", "C:\\Users\\ghs6kor\\Desktop\\Java\\chromedriver.exe");
	      WebDriver driver = new ChromeDriver();
	      String url = "https://www.tutorialspoint.com/index.htm";
	      driver.get(url);
	      // maximize the browser
	      driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
	      // fetching the current window size with getSize()
	      System.out.println(driver.manage().window().getSize());
	      //Create object of Dimensions class
	      Dimension dm = new Dimension(450,630);
	      //Setting the current window to that dimension
	      driver.manage().window().setSize(dm);
	      driver.close();
	      }
}
