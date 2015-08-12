package TestcaseControls;

import static org.junit.Assert.fail;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;

import com.Core.CaptureScreenshot;

import TestScript.RadioBoxTS;
import TestSuite.RadioBoxTest;
import TestVerify.StockVerify;
import Testcase.PageTest;

/** 
 * @author Lili.Sun  
 * @date 2015年6月19日 上午11:01:54 
 *  
 */

public class RadioLogoutTest{
	
	private String ScreenShotFileName = "";
	private static final Logger log = LoggerFactory.getLogger(RadioLogoutTest.class);
	private StringBuffer verificationErrors = new StringBuffer();
	WebDriver driver = RadioboxInitial.driver;
		
	@Test
	public void testLogoutRadio() throws Exception {
		log.info("***Run case of testLogoutRadio.***");
		
		try {			
			RadioBoxTS.outRadio(driver);
			StockVerify.logoutStockVerify(driver);		
		
		} catch (Exception e) {
			log.error("LogoutStock is error", e);
			e.printStackTrace();
			CaptureScreenshot CSShot = new CaptureScreenshot();
		    ScreenShotFileName = CSShot.getScreenshotName(this, Thread.currentThread().getStackTrace()[1]);
		    CSShot.captureScreen(driver, ScreenShotFileName);
		    fail("failure");
			return;
		}	 
	}
	
}
