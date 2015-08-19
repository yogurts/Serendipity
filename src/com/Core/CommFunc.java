package com.Core;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CommFunc {
	private static Logger log = Logger.getLogger(CommFunc.class.getName());

	/**
	 * @Title: isElementPresent
	 * @Description: Verify if web element presented.
	 * @param @param driver
	 * @param @param by
	 * @param @return 
	 * @return boolean 
	 * @throws
	 */
	public static boolean isElementPresent(WebDriver driver, By by) {
		try {
			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			driver.findElement(by);	          
			return true;
		} catch (NoSuchElementException e) {
			log.info("Element:" + by.toString() + " is not exsit!");  
			return false;
		}
	}

	
    /**
     * @Title: getNowTimeString
     * @Description: Get Now Time to String
     * @param @return 
     * @return String 
     * @throws
     */
    public static String getNowTimeString() {
    
    	Calendar date = Calendar.getInstance();

	  	SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddhhmmss");
	  	String strNowTime = sdf.format(date.getTime());
	  	
	  	return strNowTime;
    }

    
    /**
     * @Title: getTestDataFile
     * @Description: get test data file for current running method. Basically one method one input file.
     * @param @return 
     * @return String 
     * @throws
     */
    public static String getTestDataFile(){
    	String tfile = null;
    	String method = null;
    	
    	StackTraceElement[] stacks = new Throwable().getStackTrace();  
    	method = stacks[1].getMethodName().toString();
    	
    	try {
			Properties props = new Properties();
			FileInputStream fin = new FileInputStream("TestData/TestDataFileMapping.properties");
			props.load(fin);
			fin.close();
			tfile = props.getProperty(method);
		} catch (IOException e) {
			e.printStackTrace();
		}
    	return tfile;
    }

    /**
     * @throws InterruptedException 
     * @throws AWTException 
     * @Title: inputPasswrod
     * @param  
     * @return void 
     * @throws
     */
    public static void inputPasswrod(String pass) throws AWTException, InterruptedException {
		//Point p = page.TradeKey1.getLocation();
		
		//Actions builder = new Actions(driver);
        // builder.moveByOffset(p.x+5, p.y+5);
        //builder.click().perform(); 
        
		Robot r = new Robot();

 		r.keyPress(KeyEvent.VK_SPACE);    //  (SPACE)
		r.keyRelease(KeyEvent.VK_SPACE);
		Thread.sleep(2000);
 		r.keyPress(KeyEvent.VK_SPACE);    //  (SPACE)
		r.keyRelease(KeyEvent.VK_SPACE);
		Thread.sleep(2000);
 		r.keyPress(KeyEvent.VK_SPACE);    //  (SPACE)
		r.keyRelease(KeyEvent.VK_SPACE);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_1);        // 1
		r.keyRelease(KeyEvent.VK_1);
		r.keyPress(KeyEvent.VK_1);        // 1
		r.keyRelease(KeyEvent.VK_1);
		r.keyPress(KeyEvent.VK_1);        // 1
		r.keyRelease(KeyEvent.VK_1);
		r.keyPress(KeyEvent.VK_1);        // 1
		r.keyRelease(KeyEvent.VK_1);
		r.keyPress(KeyEvent.VK_1);        // 1
		r.keyRelease(KeyEvent.VK_1);
		r.keyPress(KeyEvent.VK_1);        // 1
		r.keyRelease(KeyEvent.VK_1);
		r.keyPress(KeyEvent.VK_ENTER);    // confirm by pressing Enter in the end
		r.keyRelease(KeyEvent.VK_ENTER);
    }
    

    public static void inputPasswrod(WebDriver dr) {
		((JavascriptExecutor)dr).executeScript("document.getElementById('tabView:AREA_21371_2:tx_pwd2').value = \"C5E7F5EAE5EE\";"); 
		((JavascriptExecutor)dr).executeScript("document.getElementById('tabView:AREA_21371_2:withdraw_pwd2').value = \"C5E7F5EAE5EE\";"); 
		((JavascriptExecutor)dr).executeScript("document.getElementById('tabView:AREA_21371_2:append_pwd2').value = \"C5E7F5EAE5EE\";"); 
    	
    }	
    
	/**
	 * @Title: waitForExists
	 * @Description: wait for element presented.
	 * @param @param driver
	 * @param @param timeout
	 * @param @param by 
	 * @return void 
	 * @throws
	 */
	public static void waitForExists(WebDriver driver, int timeout, final By by) {
           new WebDriverWait(driver, timeout) {
           }.until(new ExpectedCondition<Boolean>() {
               @Override
               public Boolean apply(WebDriver driver) {
                   return (driver.findElements(by).size() > 0);
               }
           });
       }


    /**
     * @Title: waitForString
     * @Description: Wait For String appear
     * @param @param driver
     * @param @param Message
     * @param @return 
     * @return boolean 
     * @throws
     */
    public static boolean waitForString(WebDriver driver, String Message) { 
        int timeout = 0; 
        do{ 
                boolean result = driver.getPageSource().contains(Message); 
                if((result == false) && (timeout > 300)) { return result; } 
                timeout++; 
        } while(timeout <= 300 ); 
        return true; 
    } 
    

    /**
     * @Title: scrollTo
     * @Description: TODO
     * @param @param driver
     * @param @param element 
     * @return void 
     * @throws
     */
    public static void scrollTo(WebDriver driver, WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", element);
    } 
}
