package HomeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Status_of_AptiTime_CheckBox {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		boolean selected=driver.findElement(By.id("keepLoggedInCheckBox")).isSelected();
		if(selected)
			System.out.println("checkbox is selected");
		else
			System.out.println("check box is not selected");
		driver.close();
		
	}
}
