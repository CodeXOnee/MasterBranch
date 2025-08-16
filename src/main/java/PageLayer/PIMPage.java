package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;
import UtilityLayer.UtilsClass;

public class PIMPage extends BaseClass{
	
	@FindBy(name="")
	private WebElement fname;
	
	@FindBy(name="")
	private WebElement mname;
	
	@FindBy(name="")
	private WebElement lname;
	
	@FindBy(xpath="")
	private WebElement savebtn;
	
	public PIMPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void working(String Fname, String Mname,String Lname) {
		UtilsClass.sendKeys(fname,Fname);
		UtilsClass.sendKeys(mname,Mname);
		UtilsClass.sendKeys(lname,Lname);
		UtilsClass.click(savebtn);
	}

}
