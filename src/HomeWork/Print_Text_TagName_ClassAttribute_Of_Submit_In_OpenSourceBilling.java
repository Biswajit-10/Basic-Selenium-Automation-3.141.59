package HomeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Print_Text_TagName_ClassAttribute_Of_Submit_In_OpenSourceBilling {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.opensourcebilling.org/en/users/sign_in");
		String tagName=driver.findElement(By.name("btn_login")).getTagName();
		String text=driver.findElement(By.name("btn_login")).getText();
		String attribute=driver.findElement(By.name("btn_login")).getAttribute("class");
		driver.findElement(By.name("btn_login")).submit();
		System.out.println("tagname of submit button is "+tagName);
		System.out.println("text of submit button is "+text);
		System.out.println("Attribute of submit button is "+attribute);
		
		
	}
}
