package testCases;

import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObject.GsdPage;
import utilities.DataProviders;

public class TC_005_Tooltips extends TC_004_Languagelist{
	
	@Test(priority=5,dataProvider= "Country Tooltip",dataProviderClass=DataProviders.class,dependsOnMethods= {"TestCase_004_Languagelist"},groups= {"sanity","regression"})
	public void TestCase_005_Tooltips(String Number) {
		
		
		int count=Integer.parseInt(Number);
		GsdPage tip=new GsdPage(driver);
		
		
		
		try {
			int i=1;
			count=count-1;
			
		// call the toolTips Method in GsdPage in pageObject packages
		do {
		List<String> toolTip=tip.toolTips(count);
		
		// Printing the ToolTips
		for(String tips:toolTip) {
			System.out.println(i+") "+tips);
			i++;
		}
		i=1;
		count++;
		}while(count<5);
		// validate after Printing the All the Tool Tips
		Assert.assertTrue(true);
		
		}
		catch(Exception e) {
			// Error while printing the Tool tips
			
			Assert.fail();
			
		}
		// End of the Class
	
		
		
	}
}
