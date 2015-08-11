package TestScript;


import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import TestcaseControls.RadioboxInitial;

import com.PageObjects.RadioboxPage;
import com.csvreader.CsvReader;


public class RadioBoxTS{
	
	private static Logger log = Logger.getLogger(RadioBoxTS.class.getName());
	static WebDriver driver = RadioboxInitial.driver;
	static RadioboxPage rbPage = new RadioboxPage(driver);
	
	public static void commonRadio(WebDriver driver) throws Exception {
		rbPage.stockNamepulldown.click();
		rbPage.stockNameselect.click();
	    Thread.sleep(1000);
	    
	    log.info("Title is:" + driver.getTitle());	 		
	}
	
	public static void displayRadio(WebDriver driver) throws Exception {
		rbPage.displaypulldown.click();
		rbPage.displayselect.click();
	    Thread.sleep(1000);
	    
	    log.info("Title is:" + driver.getTitle());	
	}

	public static void operatorRadio(WebDriver driver) throws Exception {
		rbPage.operatorpulldown.click();
		rbPage.operatorselect.click();
		Thread.sleep(1000);
	    
	    log.info("Title is:" + driver.getTitle());	
		
	}
	
	public static void hiddenRadio(WebDriver driver) throws Exception {
		rbPage.hiddenpulldown1.click();
		rbPage.hiddenpulldown2.click();
		rbPage.hiddenpulldown3.click();
		rbPage.hiddenselect.click();
		Thread.sleep(1000);
	    
	    log.info("Title is:" + driver.getTitle());	
		
	}
	
	public static void requiredfieldRadio(WebDriver driver) throws Exception {
		rbPage.search.click();
		Thread.sleep(1000);
	    
	    log.info("Title is:" + driver.getTitle());	
		
	}
	
	public static void parentRadio(WebDriver driver) throws Exception {
		rbPage.parentpulldown.click();
		rbPage.parentselect.click();
		Thread.sleep(1000);
	    
	    log.info("Title is:" + driver.getTitle());	
		
	}
	
	public static void childRadio(WebDriver driver) throws Exception {
		rbPage.childpulldown.click();
		rbPage.childselect.click();
		Thread.sleep(1000);
	    
	    log.info("Title is:" + driver.getTitle());	
		
	}
	
	public static void searchRadio(WebDriver driver) throws Exception {
		
		driver.switchTo().defaultContent();
		rbPage.search1.click();
		rbPage.search2.click();
		driver.switchTo().frame("ifrf");
		rbPage.search3.click();
		rbPage.search4.click();
		rbPage.search5.click();
		Thread.sleep(1000);
	    
	    log.info("Title is:" + driver.getTitle());	
	}
	
}
