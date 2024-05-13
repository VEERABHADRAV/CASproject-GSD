package pageObject;

import java.util.List;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;

public class BeCognizantPage extends BasePage{

	public BeCognizantPage(WebDriver driver) {
		super(driver);
		
	}
	
	// User Button
	
	@FindBy(xpath="//div[@id='O365_MainLink_MePhoto']")
	WebElement user_details_btn;
	
	@FindBy(id="mectrl_currentAccount_primary")
	WebElement UserName;
	// User Details
	@FindBy(id="mectrl_currentAccount_secondary")
	 WebElement UserMail;
	
	
	// User Button Method
	public void userButton()  {
		
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		// Click the User Button
		user_details_btn.click();
	}
	
	// User Name Method
	
	public String userName() {
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		// Getting an User Name
		String userName=UserName.getText();
		return userName;
		
	}
	//user Mail Method
		public String userMail() {
			
			// Getting an User Mail Id
			String userMail=UserMail.getText();
			return userMail;
			
		}
		
	
	// OneCognizant Button 
	 @FindBy(css="a[href=\"https://onecognizant.cognizant.com/Home\"]")
	 WebElement oneCognizant;
	 
	 public void oneCognizantClick() {
		 // Scroll and Click an One cognizant 
		 JavascriptExecutor js=(JavascriptExecutor)driver;
		 js.executeScript("arguments[0].scrollIntoView();",oneCognizant);
		 js.executeScript("arguments[0].click()", oneCognizant);
	 }
	 
	 public void goTo()
	 {
		 driver.get("https://be.cognizant.com/");
	 }
	 
	 
	
}
