package UtilityLayer;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import BaseLayer.BaseClass;

public class UtilsClass extends BaseClass{

	public static void click(WebElement wb) 
	{
	if(wb.isDisplayed()&&wb.isEnabled())
	{
		wb.click();
	}
	}
	public static void sendKeys(WebElement wb, String value) 
	{
	if(wb.isDisplayed()&&wb.isEnabled())
	{
		wb.sendKeys(value);
	}
	}
	public static void Dropdown(WebElement wb, String value) 
	{
	if(wb.isDisplayed()&&wb.isEnabled())
	{
		wb.sendKeys(value);
	}

	}

	public static void DropDownList(List<WebElement>wb, String value) 
	{
		for(WebElement a:wb)
		{
			if(a.getText().equalsIgnoreCase(value))
			{
				a.click();
			}
		}
	}
	public static void mouseOverElement(WebDriver driver, WebElement wb) 
	{
		Actions act=new Actions(driver);
		act.moveToElement(wb).build().perform();
	}
	public static void alert(WebDriver driver, WebElement wb, String value) 
	{
		Alert alt=driver.switchTo().alert();
		alt.accept();
		alt.dismiss();
		alt.getText();
		alt.sendKeys(value);
	}	
	public static void selectclass(WebElement wb, String value) 
	{
		Select sell=new Select(wb);
		sell.selectByVisibleText(value);
	}

}
