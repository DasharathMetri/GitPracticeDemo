package pageRepository;





import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseClass.basicmethods;


;

public class FacebookLoginPage {
	WebDriver driver;
	basicmethods bs = new basicmethods();
public FacebookLoginPage(WebDriver driver) 
{
	this.driver=driver;
	PageFactory.initElements(driver,this);
}



@FindBy(id="email")
WebElement username;
@FindBy(id="pass")
WebElement pwd;


public void signin() {
	username.sendKeys("dasassdsdfs");
	pwd.sendKeys("1324335");
}



}
