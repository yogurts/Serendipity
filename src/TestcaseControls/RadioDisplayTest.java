package TestcaseControls;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.junit.*;

import static org.junit.Assert.*;

import TestScript.RadioBoxTS;
import TestVerify.RadioBoxVerify;

import com.Core.BaseClass;
import com.Core.CaptureScreenshot;

/** 
 * @author Lili.Sun  
 * @date 2015年7月23日 上午10:53:53 
 *  
 */

public class RadioDisplayTest extends BaseClass{
	
	  private static final Logger log = LoggerFactory.getLogger(RadioDisplayTest.class);

	  //标题、  显示顺序、  缺省值
	  @Test
	  public void testRadioboxDisplay() throws Exception {
		log.info("***Run case of testRadioboxDisplay.***");
		PrintFlag = true;
		
		try {
			RadioBoxTS.displayRadio(driver);
			RadioBoxVerify.displayVerify(driver);
			
		} catch (Exception e) {
			log.error("testRadioboxDisplay is error", e);
			e.printStackTrace();
		    fail("failure");
			return;
		}		
		
		PrintFlag = false;
	  }

	  
}
