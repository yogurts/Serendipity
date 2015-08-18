package TestcaseControls;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.junit.*;

import static org.junit.Assert.*;

import TestScript.RadioBoxTS;
import TestVerify.RadioBoxVerify;
import com.Core.BaseClass;

/** 
 * @author Lili.Sun  
 * @date 2015年7月23日 上午10:53:53 
 *  
 */

public class RadioHiddenTest extends BaseClass{
	
	  private static final Logger log = LoggerFactory.getLogger(RadioHiddenTest.class);

	  //高级查询
	  @Test
	  public void testRadioboxHidden() throws Exception {
		log.info("***Run case of testRadioboxHidden.***");
		PrintFlag = true;
		
		try {
			RadioBoxTS.hiddenRadio(driver);
			RadioBoxVerify.hiddenVerify(driver);
			
		} catch (Exception e) {
			log.error("testRadioboxHidden is error", e);
			e.printStackTrace();
		    fail("failure");
			return;
		}		
	
		PrintFlag = false;
	  }

	  
}
