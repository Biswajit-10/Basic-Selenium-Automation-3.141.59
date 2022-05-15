package HomeWork;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadCV_in_Naukri {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://www.naukri.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//div[.='Login']")).click();;
		driver.findElement(By.xpath("//input[@placeholder='Enter your active Email ID / Username']")).sendKeys("samalbiswajit20@gmail.com");
		driver.findElement(By.xpath("//input[@placeholder='Enter your password']")).sendKeys("milugmail");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.findElement(By.xpath("(//div[.='UPDATE PROFILE'])[2]")).click();
//		driver.findElement(By.xpath("//span[.='Attach Resume']")).click();
		
		File f=new File("./data/resumee.docx");
		String absolutepath=f.getAbsolutePath();
		Thread.sleep(3000);
		driver.findElement(By.id("attachCV")).sendKeys(absolutepath);
//		driver.quit();
	}
}
