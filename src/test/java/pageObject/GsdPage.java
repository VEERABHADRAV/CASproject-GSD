package pageObject;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class GsdPage extends BasePage{

	public GsdPage(WebDriver driver) {
		super(driver);
	}
	
	// Intialize the Explicitly Wait
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
	
	// iframe Element
	@FindBy(xpath="//iframe[@id='appFrame']")
	WebElement iframe;
	
	// Success Message Element
	@FindBy(xpath="//*[@id=\"ui-view\"]/div/div[3]/p[1]")
	WebElement success_msg;

	// Default Language
	@FindBy(xpath="//span[@class=\"optionLangSelected\"]")
	WebElement default_Lang;
	
	// Default Country
	@FindBy(xpath="//span[@class=\"optionCountrySelected\"]")
	WebElement default_Country;
	
	// Language Button
	@FindBy(id="menu1")
	WebElement language_list_btn;
	
	// Country Button
	@FindBy(xpath="//a[@id='menu2'][@aria-expanded='false']")
	WebElement country_list_btn;
	
	// Language Drop Down List
	@FindBy(xpath="/html/body/nav[1]/div/form/div[1]/ul/li/a")
	List<WebElement> language_dropDown_list;
	
	// Tool Tip List
	@FindBy(xpath="//*[@id=\"ui-view\"]/div/div[5]/div/div/div/div/div[2]/div/div")
	List<WebElement> toolTip;
	
	// Method for switching a frame
	
	public void switchFrame() {
		
		// Switch an iframe
		driver.switchTo().frame(iframe);
	}
	
	
	// This method return a success Message
	public String sucessMssg() {
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		// Success Message is Displayed
		wait.until(ExpectedConditions.visibilityOf(success_msg));
		String success_mssg=success_msg.getText();
		return success_mssg;
	}
	
	// This method return a Default Language
	
	public String defaultLanguage() {
		// Return the Default Language
		return default_Lang.getText();
	}
	
	// This method return a Default Country
	public String defaultCountry() {
		// Return the Default Country
		return default_Country.getText();
	}
	
	// This Method return a List of Languages
	public List<String> languageList(){
		
		try {
		// Click an language Button
			
		language_list_btn.click();
		
		//Getting an Language List
		List<String> language_list=new ArrayList<String>();
		wait.until(ExpectedConditions.visibilityOfAllElements(language_dropDown_list));
		for(WebElement languagedrop:language_dropDown_list) {
			language_list.add(languagedrop.getText());
		}
		// Return an Language List
		return language_list;
		}
		catch(Exception e) {
			return null;
		}		
		
	}
	
	// This Method return a Tool tips of the Country
	public List<String> toolTips(int count){
		
		
		// Click an Country Button
		country_list_btn.click();
		
		// Click an City of in Country Drop Down Button
		WebElement country=driver.findElement(By.xpath("/html/body/nav[1]/div/form/div[2]/ul/li["+count+"]/a"));
		wait.until(ExpectedConditions.visibilityOf(country));
		country.click();
		
		
		
		System.out.println("----**"+country.getAttribute("innerHTML")+" Tooltip**----");
		wait.until(ExpectedConditions.visibilityOfAllElements(toolTip));
		// Getting an Tool Tips
		List<String> toolTips=new ArrayList<String>();
		
		for(WebElement tool:toolTip) {
			
			if((tool.getAttribute("data-bs-original-title")).isEmpty()) {}
			else {
				toolTips.add(tool.getAttribute("data-bs-original-title"));
				
			}
		}
		// Return a ToolTips
		return toolTips;

		
	}


}