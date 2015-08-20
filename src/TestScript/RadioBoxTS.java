package TestScript;


import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

import TestcaseControls.RadioboxInitial;

import com.Core.CommFunc;
import com.PageObjects.RadioboxPage;


/**
 * @author lili.sun
 * @date 2015年7月20日 上午11:07:15 
 *
 */
public class RadioBoxTS{
	
	private static Logger log = Logger.getLogger(RadioBoxTS.class.getName());
	static WebDriver driver = RadioboxInitial.driver;
	static RadioboxPage rbPage = new RadioboxPage(driver);
	
	public static void commonRadio(WebDriver driver) throws Exception {
		CommFunc.highlightElement(driver,rbPage.stockNamepulldown);
		rbPage.stockNamepulldown.click();
		CommFunc.highlightElement(driver,rbPage.stockNameselect);
		rbPage.stockNameselect.click();
	    
	    log.info("Title is:" + driver.getTitle());	 		
	}
	
	public static void displayRadio(WebDriver driver) throws Exception {
		CommFunc.highlightElement(driver,rbPage.displaypulldown);
		rbPage.displaypulldown.click();
		CommFunc.highlightElement(driver,rbPage.displayselect);
		rbPage.displayselect.click();
	    
	    log.info("Title is:" + driver.getTitle());	
	}

	public static void operatorRadio(WebDriver driver) throws Exception {
		CommFunc.highlightElement(driver,rbPage.operatorpulldown);
		rbPage.operatorpulldown.click();
		CommFunc.highlightElement(driver,rbPage.operatorselect);
		rbPage.operatorselect.click();
	    
	    log.info("Title is:" + driver.getTitle());	
		
	}
	
	public static void hiddenRadio(WebDriver driver) throws Exception {
		CommFunc.highlightElement(driver,rbPage.hiddenpulldown1);
		rbPage.hiddenpulldown1.click();
		CommFunc.highlightElement(driver,rbPage.hiddenpulldown2);
		rbPage.hiddenpulldown2.click();
		CommFunc.highlightElement(driver,rbPage.hiddenpulldown3);
		rbPage.hiddenpulldown3.click();
		rbPage.hiddenselect.click();
	    
	    log.info("Title is:" + driver.getTitle());	
		
	}
	
	public static void requiredfieldRadio(WebDriver driver) throws Exception {
		CommFunc.highlightElement(driver,rbPage.search);
		rbPage.search.click();
	    
	    log.info("Title is:" + driver.getTitle());	
		
	}
	
	public static void parentRadio(WebDriver driver) throws Exception {
		CommFunc.highlightElement(driver,rbPage.parentpulldown);
		rbPage.parentpulldown.click();
		CommFunc.highlightElement(driver,rbPage.parentselect);
		rbPage.parentselect.click();
	    
	    log.info("Title is:" + driver.getTitle());	
		
	}
	
	public static void childRadio(WebDriver driver) throws Exception {
		CommFunc.highlightElement(driver,rbPage.childpulldown);
		rbPage.childpulldown.click();
		CommFunc.highlightElement(driver,rbPage.childselect);
		rbPage.childselect.click();
	    
	    log.info("Title is:" + driver.getTitle());	
		
	}
	
	public static void searchRadio(WebDriver driver) throws Exception {
		
		driver.switchTo().defaultContent();
		CommFunc.highlightElement(driver,rbPage.search1);
		rbPage.search1.click();
		CommFunc.highlightElement(driver,rbPage.search2);
		rbPage.search2.click();
		driver.switchTo().frame("ifrf");
		CommFunc.highlightElement(driver,rbPage.search3);
		rbPage.search3.click();
		CommFunc.highlightElement(driver,rbPage.search4);
		rbPage.search4.click();
		CommFunc.highlightElement(driver,rbPage.search5);
		rbPage.search5.click();
	    
	    log.info("Title is:" + driver.getTitle());	
	}
	
	public static void outRadio(WebDriver driver) throws Exception {
		driver.switchTo().defaultContent();
		CommFunc.highlightElement(driver,rbPage.outradio);
		rbPage.outradio.click();
	    
	    log.info("Title is:" + driver.getTitle());	
		
	}
	
}
