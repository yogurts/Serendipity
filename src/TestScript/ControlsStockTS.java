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
	static WebDriver driver = PageTest.driver;
	static StockPage stockPage = new StockPage(driver);	

	public static void controlsStock(WebDriver driver, CsvReader reader) throws Exception {
		String stock_name = reader.get("StockName");
		String stock_code = reader.get("StockCode");
		String volume = reader.get("Volume");
		String present_price = reader.get("PresentPrice");
		
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
	
	public static void addStock(WebDriver driver) throws Exception {
		
		/*
		driver.findElement(By.xpath("//a[contains(text(),'股票系统')]")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//div[@id='_easyui_tree_1']/span")).click();
	    driver.findElement(By.cssSelector("#_easyui_tree_2 > span.tree-title")).click();
	    Thread.sleep(1000);
	    driver.switchTo().frame("ifrf");
	    Thread.sleep(1000);
	    driver.findElement(By.id("51c7da04a8b8440aa6582f5827db3d25")).click();
	    Thread.sleep(4000);
	    driver.findElement(By.cssSelector("span.l-btn-text")).click();
	    */
		stockPage.addstock1.click();
	    Thread.sleep(2000);
	    stockPage.addstock2.click();
	    stockPage.addstock3.click();
	    Thread.sleep(1000);
	    driver.switchTo().frame("ifrf");
	    Thread.sleep(1000);
	    stockPage.addstock4.click();
	    Thread.sleep(4000);
	    stockPage.addstock5.click();
	    
	    log.info("Title is:" + driver.getTitle());	
	}


	
/*
	
	ControlsStockTest.class,
	AddStockTest.class,
	AlterStockTest.class,
	DelStockTest.class,
	LogoutTest.class
	*/
}
