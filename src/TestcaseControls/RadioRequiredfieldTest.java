package TestcaseControls;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.junit.*;

import static org.junit.Assert.*;

import org.openqa.selenium.*;

import TestScript.RadioBoxTS;
import TestVerify.RadioBoxVerify;
import Testcase.PageTest;

import com.Core.CaptureScreenshot;
import com.Core.CommFunc;
import com.csvreader.CsvReader;


/** 
 * @author Lili.Sun  
 * @date 2015年7月23日 上午10:53:53 
 *  
 */

public class RadioRequiredfieldTest {
	
	  private static final Logger log = LoggerFactory.getLogger(RadioRequiredfieldTest.class);
	  private boolean PrintFlag = true;
	  private String ScreenShotFileName = "";
	  static WebDriver driver = RadioboxInitial.driver;

	  //必填项
	  @Test
	  public void testRadioboxRequiredfield() throws Exception {
		log.info("***Run case of testRadioboxRequiredfield.***");
		try {
			RadioBoxTS.requiredfieldRadio(driver);
			RadioBoxVerify.requiredFieldVerify(driver);
			
		} catch (Exception e) {
			log.error("testRadioboxRequiredfield is error", e);
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
