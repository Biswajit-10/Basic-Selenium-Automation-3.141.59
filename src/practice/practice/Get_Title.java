package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_Title {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://stackoverflow.com/questions/17877615/how-many-objects-are-created-due-to-inheritance-in-java");
		String s=driver.getTitle();
		
		System.out.println(s);
	
}
}
