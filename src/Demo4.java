package qsp;

import org.openqa.selenium.chrome.ChromeDriver;

public class Demo4 {
public static void main(String[] args) {
	ChromeDriver driver=new ChromeDriver();
//	driver.get("www.google.com");//not manually go to browser and copy paste
	driver.get("https://www.google.com/");
	driver.get("https://www.google.com/");
	
	driver.close();
}
}
