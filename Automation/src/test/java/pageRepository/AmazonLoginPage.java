package pageRepository;




import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseClass.basicmethods;


public class AmazonLoginPage  {
	
	  WebDriver driver; 
	  basicmethods bs = new basicmethods();
	 
public AmazonLoginPage(WebDriver driver) 
{
	this.driver= driver;
	PageFactory.initElements(driver,this);
}

@FindBy(xpath="(//*[.='Already have an account?'])[1]")
WebElement haveAccount;;



public void login() {
	haveAccount.click();
}





}
