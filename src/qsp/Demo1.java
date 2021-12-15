package qsp;

import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	//C:\Users\Biswajit\eclipse-workspace\Automation\ automatically before dot
public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver=new ChromeDriver();
	driver.get("https:/www.google.com/");
	String title=driver.getTitle();
	Thread.sleep(5000);
	System.out.println(title);
	driver.close();
}
}
