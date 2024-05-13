package testCases;

import org.testng.Assert;
import org.testng.annotations.*;
import baseClass.Baseclass;
import pageObject.*;
import utilities.DataProviders;

public class TC_001_WelcomeMessage extends Baseclass{
	
	@Test(priority=1,dataProvider= "WelcomeMessage",dataProviderClass=DataProviders.class,groups= {"sanity"})
	
	public void TestCase_001_WelcomeMessage(String message) {
		try {
			
		// BE COGNIZANT Page
			
		
		BeCognizantPage page1=new BeCognizantPage(driver);
		page1.goTo();
		// Call UserButton in BE Cognizant Page
		page1.userButton();
		
		// Store the Username in user_Name
		String user_Name=page1.userName();
		
		// Store the Usermail in user_Mail
		String user_Mail=page1.userMail();
		
		//User Details Print in the console
		
		System.out.println("-----User Details-----");
		System.out.println("Name: "+user_Name);
		System.out.println("MailId: "+user_Mail);
		
		//Call the Onecognizantclick method in BECognizant class
		
		page1.oneCognizantClick();
		
		//OneC_potal page
		
		
		OneCognizant page2=new OneCognizant(driver);
		
	
		// Handle the Windows Page BY window Id's
		page2.windowHandle();
		page2.searchClick();
		
		// Get an Input by properties.properties File By name of "Topic"
		page2.searchInput(p.getProperty("Topic"));
		
		// Get an Method gsdButton in OneCognizant Class
		page2.gsdButton();
		
		//GSD Page
		
		GsdPage page3=new GsdPage(driver);
		
		// Switch the frame by call the Method switchFrame in GSDPage Class
		page3.switchFrame();
	
		String actual_mssg=page3.sucessMssg();
		
		// Validate the Success Message
		
		Assert.assertEquals(actual_mssg,message);
		
		// After Succesfully Validated
	
		Thread.sleep(3000);
		
		}
		catch(Exception e) {
			// Validates is Failed
			Assert.fail();
			
			
		}
		// End of the Class
		
		
	}
	
}
