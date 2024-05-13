package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
	public WebDriver driver;

	// initialize the Driver setup
		public BasePage(WebDriver driver)
		{
			this.driver=driver;
			
			//intialize the PageFactory Class
			PageFactory.initElements(driver,this);
		}

}
