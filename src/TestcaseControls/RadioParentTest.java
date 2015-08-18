package TestcaseControls;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.junit.*;

import static org.junit.Assert.*;
import TestScript.RadioBoxTS;
import com.Core.BaseClass;


/** 
 * @author Lili.Sun  
 * @date 2015年7月23日 上午10:53:53 
 *  
 */

public class RadioParentTest extends BaseClass{
	
	  private static final Logger log = LoggerFactory.getLogger(RadioParentTest.class);

	  //父控件
	  @Test
	  public void testRadioboxParent() throws Exception {
		log.info("***Run case of testRadioboxParent.***");
		PrintFlag = true;
		
		try {
			RadioBoxTS.parentRadio(driver);
			
		} catch (Exception e) {
			log.error("testRadioboxParent is error", e);
			e.printStackTrace();
		    fail("failure");
			return;
		}		
	
		PrintFlag = false;
	  }

	  
}
