import java.util.Collection;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_Multiple_Element {
static {
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();//upcasted and implementation in chromedriver class
		driver.get("file:///C:/Users/Biswajit/Desktop/selenium/demo4.html");
		List<WebElement> allLinks = driver.findElements(By.tagName("a"));//upcasted internally ArrayList to List
		
		int count=allLinks.size();
		System.out.println(count);
		WebElement link1 = allLinks.get(0);//return adreess of webelement[0] which is adress of Qspiders
		String text1=link1.getText();

		WebElement link2 = allLinks.get(1);
		String text2=link2.getText();
		System.out.println(text1+"\n"+text2);
		driver.close();
	}

}
