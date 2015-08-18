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

public class RadioSearchTest extends BaseClass{
	
	  private static final Logger log = LoggerFactory.getLogger(RadioSearchTest.class);
	 
	  @Test
	  public void testRadioSearch() throws Exception {
		log.info("***Run case of testRadioSearch.***");
		PrintFlag = true;
		
		try {
			RadioBoxTS.searchRadio(driver);
	
		} catch (Exception e) {
			log.error("testRadioSearch is error", e);
			e.printStackTrace();
		    fail("failure");
			return;
		}	
		
		PrintFlag = false;
	  }
	  
}
