package TestcaseControls;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.junit.*;

import static org.junit.Assert.*;

import org.openqa.selenium.*;

import TestVerify.RadioBoxVerify;

import com.Core.CaptureScreenshot;


/** 
 * @author Lili.Sun  
 * @date 2015年7月23日 上午10:53:53 
 *  
 */

public class RadioCommonTest {
	
	  private static final Logger log = LoggerFactory.getLogger(RadioCommonTest.class);
	  private String baseUrl;
	  private StringBuffer verificationErrors = new StringBuffer();
	  private boolean PrintFlag = true;
	  private String ScreenShotFileName = "";
	  static WebDriver driver = RadioboxInitial.driver;
	  
	  //基础选项
	  @Test
	  public void testRadioboxCommon() throws Exception {
		log.info("***Run case of testRadioboxCommon.***");
		try {
			
			driver.findElement(By.xpath("//form[@id='commonForm']/table/tbody/tr/td/div/ul/li/span[2]/span/span/a"))
					.click();
			driver.findElement(By.xpath("//div[@id='_easyui_combobox_i1_1']")).click();
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
