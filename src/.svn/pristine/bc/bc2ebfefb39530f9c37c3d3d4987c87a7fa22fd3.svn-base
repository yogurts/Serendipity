package Testcase;

import static org.junit.Assert.fail;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;

import com.Core.CaptureScreenshot;

import TestVerify.StockVerify;
import Testcase.PageTest;

/** 
 * @author Lili.Sun  
 * @date 2015年6月19日 上午11:01:54 
 *  
 */

public class LogoutTest{
	
	private String ScreenShotFileName = "";
	private static final Logger log = LoggerFactory.getLogger(LogoutTest.class);
	private StringBuffer verificationErrors = new StringBuffer();
	WebDriver driver = PageTest.driver;
		
	@Test
	public void testLogoutStock() throws Exception {
		
		log.info("***Run case of testLogoutStock.***");
		
		try {			
			driver.switchTo().defaultContent();
			driver.findElement(By.cssSelector("a[title=\"退出\"] > img")).click();
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
