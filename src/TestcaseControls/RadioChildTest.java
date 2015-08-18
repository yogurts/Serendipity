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

public class RadioChildTest extends BaseClass{
	
	  private static final Logger log = LoggerFactory.getLogger(RadioChildTest.class);

	  //随父控件联动的子项
	  @Test
	  public void testRadioboxChild() throws Exception {
		log.info("***Run case of testRadioboxChild.***");
		PrintFlag = true;
		
		try {
			RadioBoxTS.childRadio(driver);
			
		} catch (Exception e) {
			log.error("testRadioboxChild is error", e);
			e.printStackTrace();
		    fail("failure");
			return;
		}		
		
		PrintFlag = false;
	  }
	  	  
}
