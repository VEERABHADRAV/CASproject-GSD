package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObject.GsdPage;
import utilities.DataProviders;

public class TC_002_DefaultCountry extends TC_001_WelcomeMessage{
	
	
	@Test(priority=2,dependsOnMethods= {"TestCase_001_WelcomeMessage"},dataProvider= "DataCountry",dataProviderClass=DataProviders.class,groups= {"sanity","regression"})
	public void TestCase_002_DefaultCountry(String count) {
		
		try {
			
		
		// Call the GsdPage in pageObject Package
		GsdPage page3=new GsdPage(driver);
		
		// Set an country name in the country By call the method in GsdPage Class
		String country=page3.defaultCountry();
		
		
		// Validate the Country Name from Expected
		Assert.assertEquals(country, count);
		
		// After Successfully Validate the Country Name
		
		}
		catch(Exception e) {
			Assert.fail();
			
			// Validation failed
			
			
		}
		
		// End of the Class
	
		
	}

}
