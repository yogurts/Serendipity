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
 * @date 2015年6月17日 上午11:00:45 
 *  
 */


public class DelStockTest extends BaseClass{
	
	private static final Logger log = LoggerFactory.getLogger(DelStockTest.class);
		
	@Test
	public void testDelStock() throws Exception {
		
		log.info("***Run case of testDelStock.***");
		PrintFlag = true;
		//删除
		try {
			driver.findElement(By.xpath("//a[@id='search']/span")).click();
			CommFunc.waitForExists(driver, 10, By.xpath("//input[@name='ck']"));
			driver.findElement(By.xpath("//div[2]/table/tbody/tr/td/div/input")).click();
			driver.findElement(By.xpath("//a[3]/span/span[2]")).click();
			driver.findElement(By.xpath("//div[4]/a/span/span")).click();
			Thread.sleep(4000);
			
			StockVerify.delStockVerify(driver);
		
		} catch (Exception e) {
			log.error("DelStock is error", e);
			e.printStackTrace();
		    fail("failure");
			return;
		}
		PrintFlag = false;
	}
	
}