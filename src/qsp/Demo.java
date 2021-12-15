package qsp;

import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {
public static void main(String[] args) {
	//green color means public class
	//by writing code or setting environment variable manually
	//temporarily select path set property 
	//if we do it in environment variable we can't run it in every pc then we have to do it in client pc also instead do it by code
	//why jar file added to build path
//	System.setProperty("webdriver.chrome.driver","C:\\Users\\Biswajit\\eclipse-workspace\\Automation\\driver\\chromedriver.exe");
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");//generic way to create path works in every system

	ChromeDriver c=new ChromeDriver();//write driver instead c
	c.get("https://google.com");
	c.get("https://facebook.com");
	c.get("https://umesh.com");
	c.close();
	ChromeDriver c1=new ChromeDriver();
	c1.get("https://pavan.com");
	
	
}
}
