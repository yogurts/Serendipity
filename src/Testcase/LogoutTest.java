package Testcase;

import static org.junit.Assert.fail;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.junit.Test;
import org.openqa.selenium.By;

import com.Core.BaseClass;
import com.Core.CommFunc;

import TestVerify.StockVerify;

/** 
 * @author Lili.Sun  
 * @date 2015年6月19日 上午11:01:54 
 *  
 */

public class LogoutTest extends BaseClass{
	
	private static final Logger log = LoggerFactory.getLogger(LogoutTest.class);
		
	@Test
	public void testLogoutStock() throws Exception {
		
		log.info("***Run case of testLogoutStock.***");
		PrintFlag = true;
		try {			
			driver.switchTo().defaultContent();
			CommFunc.highlightElement(driver,driver.findElement(By.cssSelector("a[title=\"退出\"] > img")));
			driver.findElement(By.cssSelector("a[title=\"退出\"] > img")).click();
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