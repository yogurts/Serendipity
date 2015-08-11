package TestcaseControls;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.junit.*;

import static org.junit.Assert.*;

import org.openqa.selenium.*;

import TestScript.RadioBoxTS;
import TestVerify.RadioBoxVerify;

import com.Core.CaptureScreenshot;


/** 
 * @author Lili.Sun  
 * @date 2015年7月23日 上午10:53:53 
 *  
 */

public class RadioSearchTest {
	
	  private static final Logger log = LoggerFactory.getLogger(RadioSearchTest.class);
	  static WebDriver driver = RadioboxInitial.driver;
	  private boolean PrintFlag = true;
	  private String ScreenShotFileName = "";

	 
	  @Test
	  public void testRadioSearch() throws Exception {
		log.info("***Run case of testRadioSearch.***");
		try {
			RadioBoxTS.searchRadio(driver);
	
		} catch (Exception e) {
			log.error("testRadioSearch is error", e);
			e.printStackTrace();
			CaptureScreenshot CSShot = new CaptureScreenshot();
		    ScreenShotFileName = CSShot.getScreenshotName(this, Thread.currentThread().getStackTrace()[1]);
		    CSShot.captureScreen(driver, ScreenShotFileName);
		    fail("failure");
			return;
		}		
			
		
		PrintFlag = false;
	  }
	  
}
