import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Automate_Google_AutoSuggestion {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		//open the browser
		WebDriver driver=new ChromeDriver();
		//go to google.com
		driver.get("https://www.google.com/");
		//type java in search textbox
		driver.manage().window().maximize();
		driver.findElement(By.name("q")).sendKeys("java");
		Thread.sleep(4000);
		//find all the autosuggestions and print the count
		List<WebElement> allAutoSuggestion = driver.findElements(By.xpath("//span[contains(text(),'java')]"));		
		Thread.sleep(2000);
		int count=allAutoSuggestion.size();
		System.out.println(count);
		//print all the suggestion
		/*
		 * for(int i=0;i<count;i++) { String text = allAutoSuggestion.get(i).getText();
		 * System.out.println(text); }
		 */
		for( WebElement sugg:allAutoSuggestion) {
			System.out.println(sugg.getText());
		}
		//select the first auto suggestion
		allAutoSuggestion.get(0).click();
		driver.close();
}
}