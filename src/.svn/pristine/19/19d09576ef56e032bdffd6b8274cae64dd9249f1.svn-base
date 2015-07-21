package Testcase;

import static org.junit.Assert.fail;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.Core.CaptureScreenshot;

import TestVerify.StockVerify;
import Testcase.PageTest;


/** 
 * @author Lili.Sun  
 * @date 2015年6月10日 上午10:56:03 
 *  
 */

public class AddStockTest{
	
	private String ScreenShotFileName = "";
	private static final Logger log = LoggerFactory.getLogger(AddStockTest.class);
	private StringBuffer verificationErrors = new StringBuffer();
	WebDriver driver = PageTest.driver;
		
	@Test
	public void testSave() throws Exception {
		log.info("***Run case of testSave.***");
		//保存 
		try {			
			driver.findElement(By.xpath("//div[@class='panel window']/div[@class='dialog-button']/a/span/span")).click();
			Thread.sleep(2000);
			StockVerify.addStockVerify(driver);
			
		} catch (Exception e) {
			log.error("Save is error", e);
			e.printStackTrace();
			CaptureScreenshot CSShot = new CaptureScreenshot();
		    ScreenShotFileName = CSShot.getScreenshotName(this, Thread.currentThread().getStackTrace()[1]);
		    CSShot.captureScreen(driver, ScreenShotFileName);
		    fail("failure");
			return;
		}		
	}

}
