package Testcase;

import static org.junit.Assert.fail;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.Core.CaptureScreenshot;

import TestVerify.StockVerify;

/** 
 * @author Lili.Sun  
 * @date 2015年6月15日 上午10:59:31 
 *  
 */


public class AlterStockTest{
	
	private String ScreenShotFileName = "";
	private static final Logger log = LoggerFactory.getLogger(AlterStockTest.class);  
	private StringBuffer verificationErrors = new StringBuffer();
	WebDriver driver = PageTest.driver;
		
	@Test
	public void testAlterStock() throws Exception {
		
		log.info("***Run case of testAlterStock.***");
		//修改
		try {			
			driver.findElement(By.xpath("//a[@id='search']/span")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//div[2]/table/tbody/tr/td/div/input")).click();
			driver.findElement(By.xpath("//a[2]/span/span")).click();
			driver.findElement(By.xpath("//form[@id='modifyForm']/table/tbody/tr/td[2]/span/input")).clear();
			driver.findElement(By.xpath("//form[@id='modifyForm']/table/tbody/tr/td[2]/span/input")).sendKeys("2");
			driver.findElement(By.xpath("//div[3]/a/span/span")).click();
			Thread.sleep(6000);
			StockVerify.alterStockVerify(driver);
			
		} catch (Exception e) {
			log.error("AlterStock is error", e);
			e.printStackTrace();
			CaptureScreenshot CSShot = new CaptureScreenshot();
		    ScreenShotFileName = CSShot.getScreenshotName(this, Thread.currentThread().getStackTrace()[1]);
		    CSShot.captureScreen(driver, ScreenShotFileName);
		    fail("failure");
			return;
		}	
	}
	

}