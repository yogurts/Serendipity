package Testcase;

import static org.junit.Assert.fail;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.junit.Test;
import org.openqa.selenium.By;
import com.Core.BaseClass;
import TestVerify.StockVerify;


/** 
 * @author Lili.Sun  
 * @date 2015年6月10日 上午10:56:03 
 *  
 */

public class AddStockTest extends BaseClass{
	
	private static final Logger log = LoggerFactory.getLogger(AddStockTest.class);
	
	@Test
	public void testSave() throws Exception {
		log.info("***Run case of testSave.***");
		PrintFlag = true;
		//保存 
		try {
			driver.findElement(By.xpath("//div[@class='panel window']/div[@class='dialog-button']/a/span/span")).click();
			//CommFunc.waitForExists(driver, 10, By.xpath("//a[contains(text(),'退出')]"));
			Thread.sleep(2000);
			StockVerify.addStockVerify(driver);
			
		} catch (Exception e) {
			log.error("Save is error", e);
			e.printStackTrace();
			fail("failure");
			return;
		}	
		
		PrintFlag = false;
	}

}
