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

public class RadioOperatorTest extends BaseClass{
	
	  private static final Logger log = LoggerFactory.getLogger(RadioOperatorTest.class);

	  //数据类型  字段操作符
	  @Test
	  public void testRadioboxOperator() throws Exception {
		log.info("***Run case of testRadioboxOperator.***");
		PrintFlag = true;
		
		try {
			RadioBoxTS.operatorRadio(driver);
			RadioBoxVerify.operatorVerify(driver);
			
		} catch (Exception e) {
			log.error("testRadioboxOperator is error", e);
			e.printStackTrace();
		    fail("failure");
			return;
		}		

		PrintFlag = false;
	  }

	  
}
