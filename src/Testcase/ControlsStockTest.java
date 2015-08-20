package Testcase;

import static org.junit.Assert.fail;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;

import com.Core.BaseClass;
import com.Core.CommFunc;
import com.csvreader.CsvReader;

import TestScript.ControlsStockTS;
import java.nio.charset.Charset;

/** 
 * @author Lili.Sun  
 * @date 2015年6月9日 上午10:53:53 
 *  
 */

public class ControlsStockTest extends BaseClass{
	
	private static final Logger log = LoggerFactory.getLogger(ControlsStockTest.class);
	
	@BeforeClass
	public static void testAddStock() throws Exception {
		ControlsStockTS.addStock(driver);
	}

	@Test
	public void testInputBox() throws Exception {
		
		log.info("***Run case of testInputBox.***");
		PrintFlag = true;
		
		//输入框测试
		try {
			String filePath = CommFunc.getTestDataFile();
			CsvReader reader = new CsvReader(filePath,',',Charset.forName("UTF-8"));
			log.info(filePath);
			reader.readHeaders();
			
			while (reader.readRecord()) {			
			    ControlsStockTS.controlsStock(driver, reader);
				
			}
		} catch (Exception e) {
			log.error("InputBox is error", e);
			e.printStackTrace();
		    fail("failure");
			return;
		}	
		PrintFlag = false;
	}

	
	@Test
	public void testDateControl() throws Exception {
		
		log.info("***Run case of testDateControl.***");
		PrintFlag = true;
		
		//日期控件测试
		try {
			CommFunc.highlightElement(driver,driver.findElement(By.xpath("//form[@id='modifyForm']/table/tbody/tr[2]/td[4]/span")));
			driver.findElement(By.xpath("//form[@id='modifyForm']/table/tbody/tr[2]/td[4]/span")).click();
		    driver.findElement(By.xpath("//iframe[@border='0']"));
			driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@border='0']")));
			CommFunc.highlightElement(driver,driver.findElement(By.id("dpTodayInput")));
			driver.findElement(By.id("dpTodayInput")).click();
			driver.switchTo().defaultContent();
			driver.switchTo().frame("ifrf");
			
		} catch (Exception e) {
			log.error("DateControl is error", e);
			e.printStackTrace();
		    fail("failure");
			return;
		}	
		PrintFlag = false;
	}
	
	@Test
	public void testMultiSelect() throws Exception {
		
		log.info("***Run case of testMultiSelect.***");
		PrintFlag = true;
		
		//多选下拉框测试
		try {
			CommFunc.highlightElement(driver,driver.findElement(By.xpath("//form[@id='modifyForm']/table/tbody/tr[3]/td[4]/span/span/a")));
		    driver.findElement(By.xpath("//form[@id='modifyForm']/table/tbody/tr[3]/td[4]/span/span/a")).click();
		    CommFunc.highlightElement(driver,driver.findElement(By.xpath("//div[@id='_easyui_combobox_i5_2']")));
		    driver.findElement(By.xpath("//div[@id='_easyui_combobox_i5_2']")).click();
		    CommFunc.highlightElement(driver,driver.findElement(By.xpath("//div[@id='_easyui_combobox_i5_6']")));
		    driver.findElement(By.xpath("//div[@id='_easyui_combobox_i5_6']")).click();
		    CommFunc.highlightElement(driver,driver.findElement(By.xpath("//form[@id='modifyForm']/table/tbody/tr[4]/td[2]/span/input")));
		    driver.findElement(By.xpath("//form[@id='modifyForm']/table/tbody/tr[4]/td[2]/span/input")).clear();
		    driver.findElement(By.xpath("//form[@id='modifyForm']/table/tbody/tr[4]/td[2]/span/input")).sendKeys("15.9");
		} catch (Exception e) {
			log.error("MultiSelect is error", e);
			e.printStackTrace();
		    fail("failure");
			return;
		}	  
		PrintFlag = false;
	}
	
	@Test
	public void testSingleSelect() throws Exception {
		
		log.info("***Run case of testSingleSelect.***");
		PrintFlag = true;
		
		//单选框下拉测试
		try {
			CommFunc.highlightElement(driver,driver.findElement(By.xpath("//form[@id='modifyForm']/table/tbody/tr[4]/td[4]/span/span/a")));
		    driver.findElement(By.xpath("//form[@id='modifyForm']/table/tbody/tr[4]/td[4]/span/span/a")).click();
		    CommFunc.highlightElement(driver,driver.findElement(By.xpath("//div[@id='_easyui_combobox_i6_1']")));
		    driver.findElement(By.xpath("//div[@id='_easyui_combobox_i6_1']")).click();
		} catch (Exception e) {
			log.error("SingleSelect is error", e);
			e.printStackTrace();
		    fail("failure");
			return;
		}	  
		PrintFlag = false;
	}
	
	@Test
	public void testMultiSelectTree() throws Exception {
		
		log.info("***Run case of testMultiSelectTree.***");
		PrintFlag = true;
		
		//多选树测试
		try {
			CommFunc.highlightElement(driver,driver.findElement(By.xpath("//div[@id='modify_div_AREA']")));
			driver.findElement(By.xpath("//div[@id='modify_div_AREA']")).click();
		    Thread.sleep(1000);
		    CommFunc.highlightElement(driver,driver.findElement(By.xpath("//div[@id='_easyui_tree_2']/span[@class='tree-checkbox tree-checkbox0']")));
		    driver.findElement(By.xpath("//div[@id='_easyui_tree_2']/span[@class='tree-checkbox tree-checkbox0']")).click();
		    CommFunc.highlightElement(driver,driver.findElement(By.xpath("//div[@id='_easyui_tree_3']/span[@class='tree-checkbox tree-checkbox0']")));
		    driver.findElement(By.xpath("//div[@id='_easyui_tree_3']/span[@class='tree-checkbox tree-checkbox0']")).click();
		    CommFunc.highlightElement(driver,driver.findElement(By.xpath("//div[@class='panel window'][2]")));
		    //driver.findElement(By.xpath("//div[@class='panel window'][2]")).click();
		    CommFunc.highlightElement(driver,driver.findElement(By.xpath("//div[@id='dia_modify_t_AREA']/div/table/tbody/tr[2]/td[2]/input[@id='selectTo']")));
		    driver.findElement(By.xpath("//div[@id='dia_modify_t_AREA']/div/table/tbody/tr[2]/td[2]/input[@id='selectTo']")).click();
		    CommFunc.highlightElement(driver,driver.findElement(By.xpath("//div[@class='panel window'][2]/div[@class='dialog-button']/a/span/span")));
		    driver.findElement(By.xpath("//div[@class='panel window'][2]/div[@class='dialog-button']/a/span/span")).click();
		} catch (Exception e) {
			log.error("MultiSelectTree is error", e);
			e.printStackTrace();
		    fail("failure");
			return;
		}	     
		PrintFlag = false;  
	    
	}
	
	@Test
	public void testSingleSelectTree() throws Exception {
		
		log.info("***Run case of testSingleSelectTree.***");
		PrintFlag = true;
		
		//单选树测试
		try {
			CommFunc.highlightElement(driver,driver.findElement(By.xpath("//div[@id='modify_div_DEPARTMENT']")));
		    driver.findElement(By.xpath("//div[@id='modify_div_DEPARTMENT']")).click();
		    CommFunc.highlightElement(driver,driver.findElement(By.xpath("//div[@class='panel window'][2]")));
		    driver.findElement(By.xpath("//div[@class='panel window'][2]")).click();
		    CommFunc.highlightElement(driver,driver.findElement(By.xpath("//div[@id='dia_modify_t_DEPARTMENT']/div[@class='tablecontent']/table/tbody/tr[2]/td/ul/li/ul/li")));
		    driver.findElement(By.xpath("//div[@id='dia_modify_t_DEPARTMENT']/div[@class='tablecontent']/table/tbody/tr[2]/td/ul/li/ul/li")).click();  
		    CommFunc.highlightElement(driver,driver.findElement(By.xpath("//div[@id='dia_modify_t_DEPARTMENT']/div[@class='tablecontent']/table/tbody/tr[2]/td/ul/li/ul/li/ul/li")));
		    driver.findElement(By.xpath("//div[@id='dia_modify_t_DEPARTMENT']/div[@class='tablecontent']/table/tbody/tr[2]/td/ul/li/ul/li/ul/li")).click();
		    CommFunc.highlightElement(driver,driver.findElement(By.xpath("//div[@id='dia_modify_t_DEPARTMENT']/div[@class='tablecontent']/table/tbody/tr[2]/td/ul/li/ul/li/ul/li/ul/li")));
		    driver.findElement(By.xpath("//div[@id='dia_modify_t_DEPARTMENT']/div[@class='tablecontent']/table/tbody/tr[2]/td/ul/li/ul/li/ul/li/ul/li")).click();
		    CommFunc.highlightElement(driver,driver.findElement(By.xpath("//div[@id='dia_modify_t_DEPARTMENT']/div/table/tbody/tr[2]/td[2]/input[@id='selectTo']")));
		    driver.findElement(By.xpath("//div[@id='dia_modify_t_DEPARTMENT']/div/table/tbody/tr[2]/td[2]/input[@id='selectTo']")).click();
		    CommFunc.highlightElement(driver,driver.findElement(By.xpath("//div[@class='panel window'][2]/div[@class='dialog-button']/a/span/span")));
		    driver.findElement(By.xpath("//div[@class='panel window'][2]/div[@class='dialog-button']/a/span/span")).click();
		} catch (Exception e) {
			log.error("SingleSelectTree is error", e);
			e.printStackTrace();
		    fail("failure");
			return;
		}
		PrintFlag = false;
	}
	
}