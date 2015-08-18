package TestcaseControls;

import static org.junit.Assert.fail;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.junit.Test;

import com.Core.BaseClass;
import TestScript.RadioBoxTS;
import TestVerify.StockVerify;

/** 
 * @author Lili.Sun  
 * @date 2015年6月19日 上午11:01:54 
 *  
 */

public class RadioLogoutTest extends BaseClass{
	
	private static final Logger log = LoggerFactory.getLogger(RadioLogoutTest.class);
		
	@Test
	public void testLogoutRadio() throws Exception {
		log.info("***Run case of testLogoutRadio.***");
		PrintFlag = true;
		
		try {			
			RadioBoxTS.outRadio(driver);
			StockVerify.logoutStockVerify(driver);		
		
		} catch (Exception e) {
			log.error("LogoutStock is error", e);
			e.printStackTrace();
		    fail("failure");
			return;
		}	 
		
		PrintFlag = false;
	}
	
}
