package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObject.GsdPage;
import utilities.DataProviders;

public class TC_003_DefaultLanguage extends TC_002_DefaultCountry{
	
	@Test(priority=3,dependsOnMethods= {"TestCase_002_DefaultCountry","TestCase_001_WelcomeMessage"},dataProvider= "DataLanguage",dataProviderClass=DataProviders.class,groups= {"sanity","regression"})
	public void TestCase_003_DefaultLanguage(String lang) {
		try {
		
		
		// Call the GsdPage in pageObject packages
		GsdPage page3=new GsdPage(driver);
		//Set a language in language variable by call the method defaultLanguage in GsdPage Class
		String language=page3.defaultLanguage();
	
		
		// Validation of Language
		Assert.assertEquals(language, lang);
		
		// After Succesfullt Validate the Language 
		
		
		}
		catch(Exception e) {
			Assert.fail();
			// Validation Failed
			
		}
		
		// End of the Class
	

		
	}
}
