package ChromeOption;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChrOptions {
	
	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();
				options.addArguments("start-maximized");
				ChromeDriver driver = new ChromeDriver(options);
	}
	
}
