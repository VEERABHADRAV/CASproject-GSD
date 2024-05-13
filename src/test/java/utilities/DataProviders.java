package utilities;

import java.io.IOException;

import org.testng.annotations.DataProvider;

public class DataProviders {

	//DataProvider 1
	
	@DataProvider(name="WelcomeMessage")
	public String [][] getData1() throws IOException
	{
		//taking xl file from testData
		String path=".\\testData\\Excelinput.xlsx";
		
		//creating an object for XLUtility
		ExcelUtility xlutil=new ExcelUtility(path);
			
		//created for two dimension array which can store the data
		String Messagedata[][]=new String[1][1];
		
		 //read the data from xl storing in two deminsional array
		for(int i=1;i<=1;i++)    
		{		
			for(int j=0;j<1;j++)      //i is rows j is col
			{
				Messagedata[0][j]= xlutil.getCellData("Sheet1",i, j); 
			}
		}
		//returning two dimension array
	return Messagedata;
				
	}
	
	@DataProvider(name="DataCountry")
	public String [][] getData2() throws IOException
	{
		//taking xl file from testData
		String path=".\\testData\\Excelinput.xlsx";
		//creating an object for XLUtility
		ExcelUtility xlutil=new ExcelUtility(path);
				
		//created for two dimension array which can store the data
		String CountryData[][]=new String[1][1];
		
		 //read the data from xl storing in two deminsional array
		{		
		for(int i=4;i<=4;i++)    
			for(int j=0;j<1;j++)    //  i is rows j is col
			{
				CountryData[0][j]= xlutil.getCellData("Sheet1",i, j);
			}
		}
		//returning two dimension array
	return CountryData;
				
	}
	
	@DataProvider(name="DataLanguage")
	public String [][] getData3() throws IOException
	{
		//taking xl file from testData
		String path=".\\testData\\Excelinput.xlsx";
		
		//creating an object for XLUtility
		ExcelUtility xlutil=new ExcelUtility(path);
				
		//created for two dimension array which can store the data
		String LanguageData[][]=new String[1][1];
		
		 //read the data from xl storing in two deminsional array
		for(int i=7;i<=7;i++) 
		{		
			for(int j=0;j<1;j++)  //   i is rows j is col
			{
				LanguageData[0][j]= xlutil.getCellData("Sheet1",i, j);
			}
		}
		//returning two dimension array
	return LanguageData;
				
	}
	
	@DataProvider(name="Country Tooltip")
	public String [][] getData4() throws IOException
	{
		//taking xl file from testData
		String path=".\\testData\\Excelinput.xlsx";
		
		//creating an object for XLUtility
		ExcelUtility xlutil=new ExcelUtility(path);
		
		//created for two dimension array which can store the data
		String ToolTip[][]=new String[1][1];
		
		//read the data from xl storing in two deminsional array
		for(int i=10;i<=10;i++)   
		{		
			for(int j=0;j<1;j++)  //   i is rows j is col
			{
				ToolTip[0][j]= xlutil.getCellData("Sheet1",i, j); 
			}
		}
		//returning two dimension array
	return ToolTip;
				
	}
	
	
	
}
