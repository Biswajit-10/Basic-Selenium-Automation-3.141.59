package Pop_Ups;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadPopUp {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Biswajit/Desktop/Naukri.html");
		Thread.sleep(2000);
//		driver.findElement(By.id("cv")).click(); 
//		driver.findElement(By.id("cv")).sendKeys("C:\\Users\\Biswajit\\Desktop\\resumee.docx.txt");
//		driver.findElement(By.id("cv")).sendKeys("./data/resumee.docx.txt"); //ERROR only takes absolute path
		
		File f=new File("./data/resumee.docx.txt");
		String absolutepath=f.getAbsolutePath();
		
		driver.findElement(By.id("cv")).sendKeys(absolutepath);
		Thread.sleep(2000);
		
		driver.close();
}
}
