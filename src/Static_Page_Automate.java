import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Static_Page_Automate {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		int count=0;
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("file:///C:/Users/Biswajit/Desktop/Demo.html");
		driver.manage().window().maximize();
//		driver.findElement(By.tagName("a")).click();;
//		count++;
//		driver.navigate().back();
//		driver.findElement(By.id("d1")).click();;
//		count++;
//		driver.navigate().back();
//		driver.findElement(By.name("n1")).click();;
//		count++;
//		driver.navigate().back();
//		driver.findElement(By.className("b")).click();;
//		count++;
//		driver.navigate().back();
		driver.findElement(By.linkText("Google")).click();;
		count++;
		driver.navigate().back();
		driver.findElement(By.linkText("Goo")).click();;
		count++;
		driver.navigate().back();
		driver.close();
		System.out.println(count);
		for(int i=0;i<10;i++)
			System.out.println(i);
	}
}
