package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;

public class AdminPage extends BaseClass{
	@FindBy(name="")
	private WebElement addbtn;
	
	@FindBy(name="")
	private WebElement userroles;
	
	@FindBy(xpath="")
	private WebElement empname;
	
	@FindBy(name="")
	private WebElement status;
	
	@FindBy(name="")
	private WebElement uname;
	
	@FindBy(xpath="")
	private WebElement pass;
	
	@FindBy(name="")
	private WebElement cpass;
	
	@FindBy(xpath="")
	private WebElement btn;
	
	@FindBy(xpath="")
	private WebElement cancelbtn;
	
	public AdminPage() {
		PageFactory.initElements(driver, this);
	}
}
