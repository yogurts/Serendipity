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

public class RadioSearchTest {
	
	  private static final Logger log = LoggerFactory.getLogger(RadioSearchTest.class);
	  static WebDriver driver = RadioboxInitial.driver;
	  private boolean PrintFlag = true;
	  private String ScreenShotFileName = "";

	 
	  @Test
	  public void testRadioSearch() throws Exception {
		log.info("***Run case of testRadioSearch.***");
		try {
			
			driver.switchTo().defaultContent();
			driver.findElement(By.xpath("//div[@id='_easyui_tree_4']/span[4]")).click();
			driver.findElement(By.cssSelector("a.tabs-close")).click();
			driver.switchTo().frame("ifrf");
			driver.findElement(By.xpath("//form[@id='commonForm']/table/tbody/tr/td/div/ul/li[3]/span[2]/span/input")).click();
			driver.findElement(By.xpath("//div[@id='_easyui_combobox_i3_1']")).click();
			driver.findElement(By.xpath("//a[@id='search']/span")).click();
			RadioBoxVerify.searchVerify(driver);
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
