package testCases;

import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObject.GsdPage;

public class TC_004_Languagelist extends TC_003_DefaultLanguage{

	@Test(priority=4,dependsOnMethods= {"TestCase_003_DefaultLanguage"},groups= {"sanity","regression"})
	public void TestCase_004_Languagelist() {
		try {
		
		GsdPage gsd=new GsdPage(driver);
		
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
		// Getting the List of the Language from languageList in GsdPage class
		List<String> langList=gsd.languageList();
		
		// Language List
		System.out.println("---Language List---");
		for(String language:langList) {
			System.out.println(language);
		}
		// After Successfully Printed the List of Language
		Assert.assertTrue(true);
		}
		catch(Exception e) {
			// Language List Failed while Getting an Error
			
			Assert.fail();
		}
		// End of the Class
		
	}
}
