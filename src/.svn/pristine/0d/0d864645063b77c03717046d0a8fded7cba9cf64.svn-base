package TestScript;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

import com.PageObjects.StockPage;
import com.csvreader.CsvReader;

import Testcase.PageTest;

/** 
 * @author Lili.Sun  
 * @date 2015年6月24日 上午10:48:58 
 *  
 */

public class ControlsStockTS {
	
	
	private static Logger log = Logger.getLogger(ControlsStockTS.class.getName());
	private StringBuffer verificationErrors = new StringBuffer();
	static WebDriver driver = PageTest.driver;
		

	public static void ControlsStock(WebDriver driver, CsvReader reader) throws Exception {
		String stock_name = reader.get("StockName");
		String stock_code = reader.get("StockCode");
		String volume = reader.get("Volume");
		String present_price = reader.get("PresentPrice");
		
		StockPage stockPage = new StockPage(driver);
		
		
		stockPage.stockName.clear();
		stockPage.stockName.sendKeys(stock_name);
		stockPage.stockCode.clear();
		stockPage.stockCode.sendKeys(stock_code);
		stockPage.volume.clear();
		stockPage.volume.sendKeys(volume);
		stockPage.presentPrice.clear();
		stockPage.presentPrice.sendKeys(present_price);
		
		
	    log.info("Title is:" + driver.getTitle());
		
	}
}
