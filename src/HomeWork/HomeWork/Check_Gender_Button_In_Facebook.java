package HomeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Check_Gender_Button_In_Facebook {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
//		driver.get("https://en-gb.facebook.com/r.php?locale=en_GB");//https://en-gb.facebook.com/r.php?locale=en_GB
		driver.get("https://en-gb.facebook.com/");
		driver.findElement(By.xpath("//a[.='Create New Account']")).click();
		
		int y1=driver.findElement(By.xpath("(//input[@type='radio'])[1]")).getLocation().getY();
		int y2=driver.findElement(By.xpath("(//input[@type='radio'])[2]")).getLocation().getY();
		
//		int y3=driver.findElement(By.id("u_2_6_rm")).getLocation().getY();  //u_2_6_rm this no. will change that's why not working
		
		int y3=driver.findElement(By.xpath("(//input[@type='radio'])[3]")).getLocation().getY();
		
//		if(y1==y2?y2==y3?true:false:false)
			
		if(y1==y2&&y2==y3)
			System.out.println("Gender Radio Button are properly alligned");
		driver.close();
	}
}
