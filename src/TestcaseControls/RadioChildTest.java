package TestcaseControls;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.junit.*;

import static org.junit.Assert.*;

import org.openqa.selenium.*;

import Testcase.PageTest;

import com.Core.CaptureScreenshot;
import com.Core.CommFunc;
import com.csvreader.CsvReader;


/** 
 * @author Lili.Sun  
 * @date 2015年7月23日 上午10:53:53 
 *  
 */

public class RadioChildTest {
	
	  private static final Logger log = LoggerFactory.getLogger(RadioChildTest.class);
	  private boolean PrintFlag = true;
	  private String ScreenShotFileName = "";
	  static WebDriver driver = RadioboxInitial.driver;

	  //随父控件联动的子项
	  @Test
	  public void testRadioboxChild() throws Exception {
		log.info("***Run case of testRadioboxChild.***");
		try {
			driver.findElement(By.xpath("//form[@id='commonForm']/table/tbody/tr/td/div/ul/li[6]/span[2]/span/span/a"))
					.click();
			driver.findElement(By.xpath("//div[@id='_easyui_combobox_i6_2']")).click();
			
		} catch (Exception e) {
			log.error("testRadioboxChild is error", e);
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
