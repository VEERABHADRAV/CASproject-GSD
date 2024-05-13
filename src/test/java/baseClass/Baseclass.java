package baseClass;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.Properties;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.*;

public class Baseclass {
	    public WebDriver driver;
		
		public Properties p;
		public static TakesScreenshot takesScreenshot;
		
		
		@BeforeClass(groups= {"sanity","regression","master"})
		@Parameters({"browser","os"})
		public void setup(String br,String os) throws IOException
		
		{
			
			
		
			FileReader file=new FileReader(".//src/test//resources//properties.properties");
			p=new Properties();
			p.load(file);
			
		
				driver=new ChromeDriver();
		
			takesScreenshot = (TakesScreenshot) driver;
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get(p.getProperty("url"));
			driver.manage().window().maximize();
			
			
		}
		
		@AfterClass(groups= {"sanity","regression","master"})
		public void tearDown()
		{
			// Quit the window
			driver.quit();
			
			
		}
		
		// Screenshot Method
		
		public static String captureScreen(String tname) throws IOException {
			
			// Current Date and Time
			String timeStamp = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
			
			File sourceFile = takesScreenshot.getScreenshotAs(OutputType.FILE);
			
			String targetFilePath=System.getProperty("user.dir")+"\\screenshots\\" + tname + "_" + timeStamp + ".png";
			File targetFile=new File(targetFilePath);
			
			sourceFile.renameTo(targetFile);
				
			return targetFilePath;

		}
		

		
}

