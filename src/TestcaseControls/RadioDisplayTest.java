package TestcaseControls;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.junit.*;

import static org.junit.Assert.*;

import org.openqa.selenium.*;

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

public class RadioDisplayTest {
	
	  private static final Logger log = LoggerFactory.getLogger(RadioDisplayTest.class);
	  private boolean PrintFlag = true;
	  private String ScreenShotFileName = "";
	  static WebDriver driver = RadioboxInitial.driver;

	  //标题、  显示顺序、  缺省值
	  @Test
	  public void testRadioboxDisplay() throws Exception {
		log.info("***Run case of testRadioboxDisplay.***");
		try {
			driver.findElement(By.xpath("//form[@id='commonForm']/table/tbody/tr/td/div/ul/li[2]/span[2]/span/span/a"))
					.click();
			driver.findElement(By.xpath("//div[@id='_easyui_combobox_i2_1']")).click();
			RadioBoxVerify.displayVerify(driver);
			
		} catch (Exception e) {
			log.error("testRadioboxDisplay is error", e);
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
