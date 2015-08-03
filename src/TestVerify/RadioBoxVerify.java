package TestVerify;


import java.io.IOException;
import java.nio.charset.Charset;







import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.junit.Assert;
import org.openqa.selenium.*;

import TestScript.NowDate;
import TestcaseControls.RadioboxInitial;

import com.Core.AssertUtils;
import com.Core.CommFunc;
import com.Model.*;
import com.csvreader.CsvReader;
import com.thoughtworks.selenium.DefaultSelenium;



/** 
 * @author Lili.Sun  
 * @date 2015年6月27日 上午11:01:54 
 *  
 */


public class RadioBoxVerify {
	
	public static DefaultSelenium selenium;
	
	private static final Logger log = LoggerFactory.getLogger(RadioBoxVerify.class);

	static NowDate today = new NowDate();
	static StockBeanCl sbc =  new StockBeanCl();
	static WebDriver driver = RadioboxInitial.driver;
	
	static String verifyCommonName;
	static String verifyCommonValue;
	static String verifyDisplayName;
	static String verifyDisplayValue;
	static String verifyRequiredfieldName;
	static String verifyOperatorName;
	static String verifyOperatorValue;
	static RadioBoxVerify sv = new RadioBoxVerify();
	
	public void testRadioVerify() throws Exception {
		
		//验证数据读取
		try {
			String filePath = CommFunc.getTestDataFile();
			CsvReader reader = new CsvReader(filePath,',',Charset.forName("UTF-8"));
			//log.info(filePath);
			reader.readHeaders();
			
			while (reader.readRecord()) {			
				verifyCommonName = reader.get("Verify_CommonName");
				verifyCommonValue = reader.get("Verify_CommonValue");
				verifyDisplayName = reader.get("Verify_DisplayName");
				verifyDisplayValue = reader.get("Verify_DisplayValue");	
				verifyRequiredfieldName = reader.get("Verify_RequiredfieldName");
				verifyOperatorName = reader.get("Verify_OperatorName");
				verifyOperatorValue = reader.get("Verify_OperatorValue");	
			}
	
		} catch (IOException e) {
			e.printStackTrace();
			return;
		}
		
	}

	
	public static void commonVerify(WebDriver driver) throws Exception  {
		sv.testRadioVerify();
		//System.out.println(driver.findElement(By.xpath("//form[@id='commonForm']/table/tbody/tr/td/div/ul/li/span[2]/span/input")).getAttribute("value"));
		//显示存在"股票名称"检索框
		Assert.assertEquals(driver.findElement(By.xpath("//form[@id='commonForm']/table/tbody/tr/td/div/ul/li/span")).getText(),verifyCommonName);
		//单选下拉
		Assert.assertTrue(driver.findElement(By.xpath("//form[@id='commonForm']/table/tbody/tr/td/div/ul/li/span[2]/span/span/a")).isDisplayed());
		//选择值
		Assert.assertEquals((driver.findElement(By.xpath("//form[@id='commonForm']/table/tbody/tr/td/div/ul/li/span[2]/span/input")).getAttribute("value")).trim(),verifyCommonValue);
	}
	

	public static void displayVerify(WebDriver driver) throws Exception  {
		
		//显示存在"有缺省值"检索框 、显示顺序
		Assert.assertEquals(driver.findElement(By.xpath("//form[@id='commonForm']/table/tbody/tr/td/div/ul/li[2]/span")).getText(),verifyDisplayName);
		//单选下拉
		Assert.assertTrue(driver.findElement(By.xpath("//form[@id='commonForm']/table/tbody/tr/td/div/ul/li[2]/span[2]/span/span/a")).isDisplayed());
		//默认值
		Assert.assertEquals(driver.findElement(By.xpath("//form[@id='commonForm']/table/tbody/tr/td/div/ul/li[2]/span[2]/span/input")).getAttribute("value"),verifyDisplayValue);
		
	}
	
	public static void requiredFieldVerify(WebDriver driver) throws Exception  {
		
		//显示存在"必填项"检索框 
		Assert.assertEquals(driver.findElement(By.xpath("//form[@id='commonForm']/table/tbody/tr/td/div/ul/li[3]/span")).getText(),verifyRequiredfieldName);
		//单选下拉
		Assert.assertTrue(driver.findElement(By.xpath("//form[@id='commonForm']/table/tbody/tr/td/div/ul/li[3]/span[2]/span/span/a")).isDisplayed());

		//提示信息是否弹出
		Assert.assertTrue(driver.findElement(By.xpath("//div[@class='tooltip-content']")).isDisplayed());
		
	}
	
	
	public static void operatorVerify(WebDriver driver) throws Exception  {
		
		//显示存在"操作符大于"检索框 
		Assert.assertEquals(driver.findElement(By.xpath("//form[@id='commonForm']/table/tbody/tr/td/div/ul/li[4]/span")).getText(),verifyOperatorName);
		//单选下拉
		Assert.assertTrue(driver.findElement(By.xpath("//form[@id='commonForm']/table/tbody/tr/td/div/ul/li[4]/span[2]/span/span/a")).isDisplayed());
		//选择值
		Assert.assertEquals(driver.findElement(By.xpath("//form[@id='commonForm']/table/tbody/tr/td/div/ul/li[4]/span[2]/span/input")).getAttribute("value"),verifyOperatorValue);
		//列表显示volume值大于100的数据
		
	}
	
	
	public static void hiddenVerify(WebDriver driver) throws Exception  {
		
		//显示存在"隐藏标题"检索框 
		Assert.assertEquals(driver.findElement(By.xpath("//table[@id='ad_input_table']/tbody/tr/td/ul/li[3]/span[2]/span")).getText(),"");
		//单选下拉
		//Assert.assertTrue(driver.findElement(By.xpath("//table[@id='ad_input_table']/tbody/tr/td/ul/li[3]/span[2]/span/span/a")).isDisplayed());
		
	}

	
	
}

