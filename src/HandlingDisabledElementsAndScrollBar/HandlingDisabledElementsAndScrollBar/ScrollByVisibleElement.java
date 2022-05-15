package HandlingDisabledElementsAndScrollBar;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ScrollByVisibleElement {
	 WebDriver driver;
	    @Test
	    public void ByVisibleElement() {
	        System.setProperty("webdriver.chrome.driver", "G://chromedriver.exe");
	        driver = new ChromeDriver();
	        JavascriptExecutor js = (JavascriptExecutor) driver;

	        //Launch the application		
	        driver.get("http://demo.guru99.com/test/guru99home/");

	        //Find element by link text and store in variable "Element"        		
	        WebElement Element = driver.findElement(By.linkText("Linux"));

	        //This will scroll the page till the element is found		
	        js.executeScript("arguments[0].scrollIntoView();", Element); 
	        
//	        try this in console document.getElementById('the_javascript_debugger').scrollIntoView()
//	        it can scroll up and down , left and right
	        
	    }
}
