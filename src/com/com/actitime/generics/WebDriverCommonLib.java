package com.actitime.generics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
/**
 * Generic class for WebDriver methods
 * @author Biswajit
 */
public class WebDriverCommonLib {
	/**
	 * Generic method for implicit wait
	 * @param driver
	 * @param time
	 */
	public void waitForElementToLoad(WebDriver driver,int time) {
		driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);
	}
	/**
	 * generic method for explicit wait
	 * @param driver
	 * @param element
	 */
	public void waitForElementGui(WebDriver driver,WebElement element) {
		WebDriverWait wait =new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	/**
	 * generic method for custom wait
	 * @param element
	 */
	public void customWaitForElement(WebElement element) {
		int i=0;
		while(i<100) {
			try {
				element.isDisplayed();
				break;
			}
			catch(Exception e) {
				i++;
			}
		}
	}
	/**
	 * generic method for LIst Box based on text
	 * @param element
	 * @param text
	 */
	public void select(WebElement element,String text) {
		Select s =new Select(element);
		s.deselectByVisibleText(text);
	}
	/**
	 * select the value from the List box based on index
	 * @param element
	 * @param i
	 */
	public void select(WebElement element ,int i) {
		Select s =new Select(element);
		s.selectByIndex(i);
	}
}