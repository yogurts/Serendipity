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

public class RadioRequiredfieldTest extends BaseClass{
	
	  private static final Logger log = LoggerFactory.getLogger(RadioRequiredfieldTest.class);

	  //必填项
	  @Test
	  public void testRadioboxRequiredfield() throws Exception {
		log.info("***Run case of testRadioboxRequiredfield.***");
		PrintFlag = true;
		
		try {
			RadioBoxTS.requiredfieldRadio(driver);
			RadioBoxVerify.requiredFieldVerify(driver);
			
		} catch (Exception e) {
			log.error("testRadioboxRequiredfield is error", e);
			e.printStackTrace();
		    fail("failure");
			return;
		}		

		PrintFlag = false;
	  }

	  
}
