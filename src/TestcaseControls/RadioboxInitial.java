package TestcaseControls;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.junit.*;

import static org.junit.Assert.*;

import org.openqa.selenium.ie.InternetExplorerDriver;

import TestScript.LoginTS;

import com.Core.BaseClass;
import com.Core.CommFunc;
import com.csvreader.CsvReader;


/** 
 * @author Lili.Sun  
 * @date 2015年7月23日 上午10:53:53 
 *  
 */

public class RadioboxInitial extends BaseClass{
	
	  private static final Logger log = LoggerFactory.getLogger(RadioboxInitial.class);
	  private String baseUrl;

	  @Before
	  public void setUp() throws Exception {

		File file = new File("lib/IEDriverServer.exe");  
		System.setProperty("webdriver.ie.driver", file.getAbsolutePath());		
		
		driver = new InternetExplorerDriver();
	    baseUrl = "http://10.243.140.101:8085";
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  }
	  
	  @Test
	  public void testLogin() throws Exception {
		log.info("***Run case of testLogin.***");
		PrintFlag = true;
		driver.get(baseUrl + "/ks-main/web/loginPage");
		driver.manage().window().maximize();
	
		try {			
			String filePath = CommFunc.getTestDataFile();
			CsvReader reader = new CsvReader(filePath);
			log.info(filePath);
			reader.readHeaders();
			
			while (reader.readRecord()) {			
			    LoginTS.login(driver, reader);
			}
			
		} catch (Exception e) {
			log.error("login is error", e);
			e.printStackTrace();
		    fail("failure");
			return;
		}		
		PrintFlag = false;
	  }

	  /*
	  @After
	  public void tearDown() throws Exception {
	    //driver.quit();
			driver.findElement(By.xpath("//a[contains(text(),'股票系统')]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//div[@id='_easyui_tree_1']/span"))
					.click();
			driver.findElement(By.cssSelector("#_easyui_tree_3 > span.tree-title"))
					.click();
			driver.switchTo().frame("ifrf");
	  }
	  */
}
