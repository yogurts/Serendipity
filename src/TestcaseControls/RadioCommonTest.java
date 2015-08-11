package TestcaseControls;

import java.nio.charset.Charset;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.junit.*;

import static org.junit.Assert.*;

import org.openqa.selenium.*;

import TestScript.RadioBoxTS;
import TestVerify.RadioBoxVerify;

import com.Core.CaptureScreenshot;
import com.Core.CommFunc;
import com.csvreader.CsvReader;


/** 
 * @author Lili.Sun  
 * @date 2015年7月23日 上午10:53:53 
 *  
 */

public class RadioCommonTest {
	
	  private static final Logger log = LoggerFactory.getLogger(RadioCommonTest.class);
	  private boolean PrintFlag = true;
	  private String ScreenShotFileName = "";
	  WebDriver driver = RadioboxInitial.driver;
	  
	  //基础选项
	  @Test
	  public void testRadioboxCommon() throws Exception {
		log.info("***Run case of testRadioboxCommon.***");
		try {
			RadioBoxTS.commonRadio(driver);
			RadioBoxVerify.commonVerify(driver);
			
		} catch (Exception e) {
			log.error("testRadioboxCommon is error", e);
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
