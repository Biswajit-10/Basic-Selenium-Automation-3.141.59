package From_23_09;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ClearTripFlights {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.cleartrip.com/flights");
		driver.findElement(By.xpath("//input[@placeholder='Any worldwide city or airport']")).sendKeys("bangalore");
		driver.findElement(By.xpath("//p[.='Bangalore, IN - Kempegowda International Airport (BLR)']")).click();;
	
		driver.findElement(By.xpath("(//input[@placeholder='Any worldwide city or airport'])[2]")).sendKeys("goa");
//		Actions a=new Actions(driver);
//
//		WebElement target=driver.findElement(By.xpath("//p[.='Goa, IN - Dabolim Airport (GOI)']"));
//		a.moveToElement(target).click().perform();
//		
//		target = driver.findElement(By.xpath("(//div[@class='col flex flex-middle'])[5]/button"));
//		a.moveToElement(target).click().perform();
		
//		WebDriverWait wait =new WebDriverWait(driver,10);
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[.='Goa, IN - Dabolim Airport (GOI)']")));
//		
//		driver.findElement(By.xpath("//p[.='Goa, IN - Dabolim Airport (GOI)']")).click();
//		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[.='Search flights']")));
//		driver.findElement(By.xpath("//button[.='Search flights']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//p[.='Goa, IN - Dabolim Airport (GOI)']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='flex flex-middle p-relative homeCalender']")).click();
		
//		Actions a=new Actions(driver);
//		a.moveToElement(target).click().perform(); outside view that's why MoveTargetOutOfBoundException
		
		int y=driver.findElement(By.xpath("(//div[@class='DayPicker-Day'])[1]/div/div")).getLocation().getY();
		JavascriptExecutor j= (JavascriptExecutor) driver;
		j.executeScript("window.scrollBy(0,"+y+")");
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//div[@class='DayPicker-Day'])[1]/div/div")).click();;
		
		
		
//		for(int i=0;i<10;i++) {
//			try {
//				driver.findElement(By.xpath("//p[.='Goa, IN - Dabolim Airport (GOI)']")).click();
//				break;
//			}
//			catch(Exception e){
//			}
//		}
//		for(int i=0;i<10;i++) {
//			try {
//				driver.findElement(By.xpath("//div[@class='flex flex-middle p-relative homeCalender']")).click();
//				break;
//			}
//			catch(Exception e){
//			}
//		}
//		for(int i=0;i<10;i++) {
//			try {
//				driver.findElement(By.xpath("//div[.='30']")).click();
//				break;
//			}
//			catch(Exception e){
//			}
//		}
//		
//		for(int i=0;i<10;i++) {
//			try {
//				driver.findElement(By.xpath("//button[.='Search flights']")).click();
//				break;
//			}
//			catch(Exception e){
//			}
//		}
		
//		JavascriptExecutor j= (JavascriptExecutor) driver;
//		j.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		
		List<WebElement> flight = driver.findElements(By.xpath("//img[@class]"));
		List<WebElement> dtime = driver.findElements(By.xpath("//div[@data-testid='tupple']/div[2]/div[2]/div/div[1]/p"));

		int count=flight.size();
		for(int i=0;i<count;i++) {
			System.out.println(flight.get(i).getAttribute("alt") + "==>" +dtime.get(i).getText());

		}



		//			String[] s1=new String[flight.size()];//50
		//			int i=0;
		//			for ( WebElement w: flight) {
		//				s1[i]=w.getAttribute("alt");
		//				i++;
		//			}
		//			List<WebElement> dtime = driver.findElements(By.xpath("//div[@data-testid='tupple']/div[2]/div[2]/div/div[1]/p"));
		//			String[] s2=new String[dtime.size()];//50
		//			int j=0;
		//			for ( WebElement w: dtime) {
		//				s2[j]=w.getText();
		//				System.out.println(s1[j]+"=>"+s2[j]);
		//				j++;
		//			}
		
		driver.close();
	}
}
