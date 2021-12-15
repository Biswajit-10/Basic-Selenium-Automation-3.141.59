package Pop_Ups;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;

import net.bytebuddy.implementation.bind.annotation.RuntimeType;

public class DemoRobotClass {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws AWTException, IOException {
		Runtime.getRuntime().exec("notepad");//open stand alone application on computer
		Robot r=new Robot();
//		r.keyPress(KeyEvent.VK_Q);//all small letter
//		r.keyPress(KeyEvent.VK_S);
//		r.keyPress(KeyEvent.VK_P);

		r.keyPress(KeyEvent.VK_SHIFT);
		r.keyPress(KeyEvent.VK_Q);
		r.keyRelease(KeyEvent.VK_SHIFT);
		r.keyPress(KeyEvent.VK_S);
		r.keyPress(KeyEvent.VK_P);
		
	}
}
