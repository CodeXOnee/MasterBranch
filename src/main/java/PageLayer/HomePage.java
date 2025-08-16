package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;
import UtilityLayer.UtilsClass;

public class HomePage extends BaseClass{

	@FindBy(name="username")
	private WebElement uname;
	
	@FindBy(name="password")
	private WebElement pass;
	
	@FindBy(xpath="//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")
	private WebElement btn;
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	public void working(String name, String password) {
		UtilsClass.SendKeys(uname,name);
		UtilsClass.SendKeys(pass,password);
	}
	
	public void login() {
		UtilsClass.Click(btn);
	}
}
