package TestVerify;


import static org.junit.Assert.*;

import org.junit.Assert;
import org.apache.log4j.Logger;


import TestScript.NowDate;

import com.Model.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


/** 
 * @author Lili.Sun  
 * @date 2015年6月3日 上午11:01:54 
 *  
 */


public class StockVerify_bak {
	
	private static Logger log = Logger.getLogger(StockVerify_bak.class.getName());

	static NowDate today = new NowDate();
	static StockBeanCl sbc =  new StockBeanCl();
	
	public static void pageVerify(WebDriver driver) throws Exception  {

	    assertEquals("框架V2.5", driver.getTitle());
	}
	
	public static void loginVerify(WebDriver driver) throws Exception  {
		Assert.assertTrue(driver.findElement(By.xpath("//a[contains(text(),'退出')]")).isDisplayed());
	}
	
	
	
	public static void inputBoxVerify(WebDriver driver) throws Exception  {
		//assertEditable(By.xpath("//div[@id='51c7da04a8b8440aa6582f5827db3d25_modifyDialog']/form/table/tbody/tr/td[2]/span/input"));
	    
	}
	

	public static void addStockVerify(WebDriver driver) throws Exception  {
		
	    assertEquals("大众交通", sbc.checkStockName(today.getDate()));
	    
	}
	
	public static void alterStockVerify(WebDriver driver) throws Exception  {
	   
		assertEquals("大众交通2", sbc.checkStockName(today.getDate()));
	    
	}
	
	public static void delStockVerify(WebDriver driver) throws Exception  {
		System.out.println(sbc.checkStockName(today.getDate()));
		assertEquals(null, sbc.checkStockName(today.getDate()));
	    
	}

	public static void logoutStockVerify(WebDriver driver) throws Exception  {
		
		String url = "http://10.243.140.101:8085/ks-main/web/logout";
		assertEquals(url, driver.getCurrentUrl());  
	}
}
