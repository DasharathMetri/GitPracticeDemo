package testCases;

import org.testng.annotations.Test;

import baseClass.basicmethods;
import pageRepository.AmazonLoginPage;
import pageRepository.FacebookLoginPage;

public class AmazonLogin extends basicmethods{
	@Test
	public void Login() throws InterruptedException {
		
		String browser= "Chrome";
		String url="https://www.facebook.com/campaign/landing.php?campaign_id=14884913640&extra_1=s%7Cc%7C589460569891%7Cb%7Cfacebook%20signin%7C&placement=&creative=589460569891&keyword=facebook%20signin&partner_id=googlesem&extra_2=campaignid%3D14884913640%26adgroupid%3D128696221832%26matchtype%3Db%26network%3Dg%26source%3Dnotmobile%26search_or_content%3Ds%26device%3Dc%26devicemodel%3D%26adposition%3D%26target%3D%26targetid%3Dkwd-3821998899%26loc_physical_ms%3D9062046%26loc_interest_ms%3D%26feeditemid%3D%26param1%3D%26param2%3D&gclid=CjwKCAiA7vWcBhBUEiwAXieItuoF-TzzUIQIurIWQRI73Tg2w-sdv01OCRlicOS2Op2t5jffLjfHahoC-QcQAvD_BwE";
		openBrowser(browser,url);
		AmazonLoginPage lp = new AmazonLoginPage(driver);
		lp.login();
		FacebookLoginPage fb= new FacebookLoginPage(driver);
		fb.signin();
		
		
	}

}
