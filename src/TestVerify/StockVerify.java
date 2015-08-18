package TestVerify;

import java.io.IOException;
import java.nio.charset.Charset;

import org.junit.Assert;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.openqa.selenium.*;

import TestScript.NowDate;
import Testcase.PageTest;
import TestcaseControls.RadioboxInitial;

import com.Core.AssertUtils;
import com.Core.BaseClass;
import com.Core.CommFunc;
import com.Model.*;
import com.csvreader.CsvReader;



/** 
 * @author Lili.Sun  
 * @date 2015年6月3日 上午11:01:54 
 *  
 */


public class StockVerify{
	
	private static final Logger log = LoggerFactory.getLogger(StockVerify.class);

	static NowDate today = new NowDate();
	static StockBeanCl sbc =  new StockBeanCl();
	//static WebDriver driver = PageTest.driver;
	
	static String verify_title;
	static String verify_stockName;
	static String verify_stockAlter;
	static String verify_logoutUrl;
	static StockVerify sv = new StockVerify();
	
	public void testStockVerify() throws Exception {
		
		//验证数据读取
		try {
			String filePath = CommFunc.getTestDataFile();
			CsvReader reader = new CsvReader(filePath,',',Charset.forName("UTF-8"));
			//log.info(filePath);
			reader.readHeaders();
			
			while (reader.readRecord()) {			
				verify_title = reader.get("VerifyTitle");
				verify_stockName = reader.get("VerifyStockName");
				verify_stockAlter = reader.get("VerifyStockAlter");
				verify_logoutUrl = reader.get("VerifyLogoutUrl");				
			}
	
		} catch (IOException e) {
			e.printStackTrace();
			return;
		}
		
	}

	
	public static void pageVerify(WebDriver driver) throws Exception  {
		
		sv.testStockVerify();
		//Assert.assertTrue(verify_title.equals(driver.getTitle()));
	    //assertEquals(verify_title, (driver.getTitle()));
		//throw new IOException("i am error!");
		//System.out.println(driver.getTitle());
		//System.out.println(verify_title);
		AssertUtils.assertTrue(verify_title.equals(driver.getTitle()), "title is not equals vtitle");
	}
	
	public static void loginVerify(WebDriver driver) throws Exception  {
		
		Assert.assertTrue(driver.findElement(By.xpath("//a[contains(text(),'退出')]")).isDisplayed());
		//Assert.assertTrue(driver.findElement(By.xpath("//a[contains(text(),'error')]")).isDisplayed());
		
	}
	
	
	
	public static void inputBoxVerify(WebDriver driver) throws Exception  {
		//assertEditable(By.xpath("//div[@id='51c7da04a8b8440aa6582f5827db3d25_modifyDialog']/form/table/tbody/tr/td[2]/span/input"));
	    
	}
	

	public static void addStockVerify(WebDriver driver) throws Exception  {

		sv.testStockVerify();
		AssertUtils.assertTrue(verify_stockName.equals(sbc.checkStockName(today.getDate())), "verify_stockName is not equals sbc.checkStockName(today.getDate())");
	    
	}
	
	public static void alterStockVerify(WebDriver driver) throws Exception  {
		
		//sv.testStockVerify();
		//assertEquals(verify_stockAlter, sbc.checkStockName(today.getDate()));
		//AssertUtils.assertTrue(verify_stockAlter.equals(sbc.checkStockName(today.getDate())), "verify_stockAlter is not ");
		Assert.assertTrue(driver.findElement(By.cssSelector("div.datagrid-cell-rownumber")).isDisplayed());
	    
	}
	
	public static void delStockVerify(WebDriver driver) throws Exception  {
		
		//System.out.println(sbc.checkStockName(today.getDate()));
		//assertEquals(null, sbc.checkStockName(today.getDate()));
		AssertUtils.assertTrue(sbc.checkStockName(today.getDate())==null, "delete is wrong ");
	    
	}

	public static void logoutStockVerify(WebDriver driver) throws Exception  {
		
		sv.testStockVerify();
		//String url = "http://10.243.140.101:8085/ks-main/web/logout";
		//assertEquals(verify_logoutUrl, driver.getCurrentUrl());  
		AssertUtils.assertTrue(verify_logoutUrl.equals(driver.getCurrentUrl()), "logoutStock is error ");
		
	}
	
}

