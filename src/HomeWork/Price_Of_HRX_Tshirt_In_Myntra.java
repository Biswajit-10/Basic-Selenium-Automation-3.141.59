package HomeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Price_Of_HRX_Tshirt_In_Myntra {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.myntra.com/hrx?f=Gender%3Amen%2Cmen%20women&plaEnabled=false");
		
		WebElement w=driver.findElement(By.xpath("(//h3[.='HRX by Hrithik Roshan'])[2]/../div/span[1]/span[1]"));
		String price=w.getText();
		System.out.println("price of HRX T shirt is: "+price);
		driver.close();
		
	}

}
