import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Biswajit/Desktop/Demo.html");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("/html/body/a")).click();;
		driver.close();
}
}
