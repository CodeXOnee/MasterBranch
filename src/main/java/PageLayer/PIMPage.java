package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;
import UtilityLayer.UtilsClass;

public class PIMPage extends BaseClass{
	
	@FindBy(name="firstName")
	private WebElement fname;
	
	@FindBy(name="middleName")
	private WebElement mname;
	
	@FindBy(name="lastName")
	private WebElement lname;
	
	@FindBy(xpath="//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']")
	private WebElement savebtn;
	
	public PIMPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void ValidatePIMPageFunctionality(String Fname, String Mname,String Lname) {
		UtilsClass.sendKeys(fname,Fname);
		UtilsClass.sendKeys(mname,Mname);
		UtilsClass.sendKeys(lname,Lname);
		UtilsClass.click(savebtn);
	}

}
