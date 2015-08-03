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

public class RadioHiddenTest {
	
	  private static final Logger log = LoggerFactory.getLogger(RadioHiddenTest.class);
	  private boolean PrintFlag = true;
	  private String ScreenShotFileName = "";
	  static WebDriver driver = RadioboxInitial.driver;

	  //高级查询
	  @Test
	  public void testRadioboxHidden() throws Exception {
		log.info("***Run case of testRadioboxHidden.***");
		try {
			driver.findElement(By.xpath("//form[@id='commonForm']/table/tbody/tr/td/div/div/span[2]/a")).click();
			driver.findElement(By.xpath("//table[@id='ad_input_table']/tbody/tr/td/ul/li[3]/span[2]/span/span/a")).click();
			driver.findElement(By.xpath("//div[@id='_easyui_combobox_i9_2']")).click();
			driver.findElement(By.xpath("//div[3]/a[2]/span/span[2]")).click();
			RadioBoxVerify.hiddenVerify(driver);
			
		} catch (Exception e) {
			log.error("testRadioboxHidden is error", e);
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
