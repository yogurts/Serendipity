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
 * @date 2015年6月15日 上午10:59:31 
 *  
 */


public class AlterStockTest extends BaseClass{
	
	private static final Logger log = LoggerFactory.getLogger(AlterStockTest.class);  
		
	@Test
	public void testAlterStock() throws Exception {
		
		log.info("***Run case of testAlterStock.***");
		PrintFlag = true;
		//修改
		try {
			CommFunc.highlightElement(driver,driver.findElement(By.xpath("//a[@id='search']/span")));
			driver.findElement(By.xpath("//a[@id='search']/span")).click();
			CommFunc.waitForExists(driver, 10, By.xpath("//div[2]/table/tbody/tr/td/div/input"));
			CommFunc.highlightElement(driver,driver.findElement(By.xpath("//div[2]/table/tbody/tr/td/div/input")));
			driver.findElement(By.xpath("//div[2]/table/tbody/tr/td/div/input")).click();
			CommFunc.waitForExists(driver, 10, By.xpath("//a[2]/span/span"));
			CommFunc.highlightElement(driver,driver.findElement(By.xpath("//a[2]/span/span")));
			driver.findElement(By.xpath("//a[2]/span/span")).click();
			CommFunc.waitForExists(driver, 10, By.xpath("//form[@id='modifyForm']/table/tbody/tr/td[2]/span/input"));
			CommFunc.highlightElement(driver,driver.findElement(By.xpath("//form[@id='modifyForm']/table/tbody/tr/td[2]/span/input")));
			driver.findElement(By.xpath("//form[@id='modifyForm']/table/tbody/tr/td[2]/span/input")).clear();
			driver.findElement(By.xpath("//form[@id='modifyForm']/table/tbody/tr/td[2]/span/input")).sendKeys("2");
			CommFunc.highlightElement(driver,driver.findElement(By.xpath("//div[3]/a/span/span")));
			driver.findElement(By.xpath("//div[3]/a/span/span")).click();
			CommFunc.waitForExists(driver, 10, By.cssSelector("div.datagrid-cell-rownumber"));
			StockVerify.alterStockVerify(driver);
			
		} catch (Exception e) {
			log.error("AlterStock is error", e);
			e.printStackTrace();
		    fail("failure");
			return;
		}
		PrintFlag = false;
	}
	

}