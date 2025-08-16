package UtilityLayer;

import org.openqa.selenium.WebElement;

import BaseLayer.BaseClass;

public class UtilsClass extends BaseClass{

	public static void SendKeys(WebElement wb, String value) {
		if(wb.isDisplayed() && wb.isEnabled()) {
			wb.sendKeys(value);
		}
	}
	
	public static void Click(WebElement wb) {
		if(wb.isDisplayed() && wb.isEnabled()) {
			wb.click();
		}
	}
}
