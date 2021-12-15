package qsp;

import org.openqa.selenium.chrome.ChromeDriver;
public class NavigateCls {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromdriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.navigate().to("https:/www.google.com/");
		Thread.sleep(5000);
		driver.navigate().to("https:/www.gmail.com/");
		Thread.sleep(5000);
		driver.navigate().back();
		Thread.sleep(5000);
		driver.navigate().forward();
		Thread.sleep(5000);
		driver.navigate().refresh();
		Thread.sleep(5000);
		driver.close();
//		driver.navigate().to(arg0);
	}
	}
