package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;
import UtilityLayer.UtilsClass;

public class HomePage extends BaseClass{
	
	@FindBy(name="username")
	private WebElement user;
	
	@FindBy(name="password")
	private WebElement password;
	
	@FindBy(xpath="//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']")
	private WebElement loginbtn;
	
	public HomePage()
	{
		PageFactory.initElements(driver,this);
	}
	
	public void loginPageFunctionality(String User, String Password)
	{
		UtilsClass.sendKeys(user, User);
		UtilsClass.sendKeys(password, Password);
		UtilsClass.click(loginbtn);
	}

}
