package pageObject;

import java.util.*;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;

public class OneCognizant extends BasePage{

	public OneCognizant(WebDriver driver) {
		super(driver);
		
	}
	
	// This Method Handle the Window
	public void windowHandle() {
		// Getting an Window Id's
		Set<String> windowIds=driver.getWindowHandles();
		List<String> windowId = new ArrayList<String>(windowIds);
		
		// Child Window Id
		String child_id=windowId.get(1);
		driver.switchTo().window(child_id);
	}
	
	// Search Button
	@FindBy(xpath="//div[@class='nav-wrapper']/child::ul[@class='searchBasedTopBar']/li")
	WebElement search_click;
	
	// Search Input
	@FindBy(xpath="//*[@id='oneCSearchTop']")
	WebElement search_input;
	
	// Click an GSD Button
	@FindBy(xpath="//*[@id='newSearchAppsLST']/div/div/div[2]")
	WebElement Gsd;
	
	// This method click the serach button
	public void searchClick() {
		
		// Click an Search Button
		 JavascriptExecutor js=(JavascriptExecutor)driver;
		 js.executeScript("arguments[0].click();",search_click);
	}
	
	//This Method give the input in the Search
	public void searchInput(String input) {
		// Giving an Search Input
		search_input.sendKeys(input);
	}
	
	// Input method to give the GSD
	public void gsdButton() {
		// Click an GSD Button
		Gsd.click();
	}
	
	
	
		
}
