package TestcaseControls;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.junit.*;

import static org.junit.Assert.*;

import org.openqa.selenium.*;

import TestScript.RadioBoxTS;
import TestVerify.RadioBoxVerify;

import com.Core.BaseClass;


/** 
 * @author Lili.Sun  
 * @date 2015年7月23日 上午10:53:53 
 *  
 */

public class RadioCommonTest extends BaseClass{
	
	  private static final Logger log = LoggerFactory.getLogger(RadioCommonTest.class);
	  
	  @Before
	  public void setUp() throws Exception {
		    driver.findElement(By.xpath("//a[contains(text(),'股票系统')]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//div[@id='_easyui_tree_1']/span"))
					.click();
			driver.findElement(By.cssSelector("#_easyui_tree_3 > span.tree-title"))
					.click();
			driver.switchTo().frame("ifrf");
	  }
	  
	  //基础选项
	  @Test
	  public void testRadioboxCommon() throws Exception {
		log.info("***Run case of testRadioboxCommon.***");
		PrintFlag = true;
		
		try {
			RadioBoxTS.commonRadio(driver);
			RadioBoxVerify.commonVerify(driver);
			
		} catch (Exception e) {
			log.error("testRadioboxCommon is error", e);
			e.printStackTrace();
		    fail("failure");
			return;
		}		
		PrintFlag = false;
	  }


}
