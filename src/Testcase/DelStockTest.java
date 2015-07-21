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

/** 
 * @author Lili.Sun  
 * @date 2015年6月17日 上午11:00:45 
 *  
 */


public class DelStockTest{
	
	private String ScreenShotFileName = "";
	private static final Logger log = LoggerFactory.getLogger(DelStockTest.class);
	private StringBuffer verificationErrors = new StringBuffer();
	WebDriver driver = PageTest.driver;
		
	@Test
	public void testDelStock() throws Exception {
		
		log.info("***Run case of testDelStock.***");
		//删除
		try {
			driver.findElement(By.xpath("//a[@id='search']/span")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//div[2]/table/tbody/tr/td/div/input")).click();
			driver.findElement(By.xpath("//a[3]/span/span[2]")).click();
			driver.findElement(By.xpath("//div[4]/a/span/span")).click();
			Thread.sleep(4000);
			StockVerify.delStockVerify(driver);
		
		} catch (Exception e) {
			log.error("DelStock is error", e);
			e.printStackTrace();
			CaptureScreenshot CSShot = new CaptureScreenshot();
		    ScreenShotFileName = CSShot.getScreenshotName(this, Thread.currentThread().getStackTrace()[1]);
		    CSShot.captureScreen(driver, ScreenShotFileName);
		    fail("failure");
			return;
		}	  
	}
	
}