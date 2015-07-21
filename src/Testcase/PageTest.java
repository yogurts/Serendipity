package Testcase;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.junit.*;

import static org.junit.Assert.*;

import org.openqa.selenium.*;
import org.openqa.selenium.ie.InternetExplorerDriver;

import TestVerify.StockVerify;
import com.Core.CaptureScreenshot;


/** 
 * @author Lili.Sun  
 * @date 2015年6月5日 上午10:53:53 
 *  
 */

public class PageTest {
	
	  private static final Logger log = LoggerFactory.getLogger(PageTest.class);
	  public static WebDriver driver;
	  private String baseUrl;
	  private StringBuffer verificationErrors = new StringBuffer();
	  private boolean PrintFlag = true;
	  private String ScreenShotFileName = "";

	  @Before
	  public void setUp() throws Exception {

		File file = new File("lib/IEDriverServer.exe");  
		System.setProperty("webdriver.ie.driver", file.getAbsolutePath());		
		
		driver = new InternetExplorerDriver();
	    baseUrl = "http://10.243.140.101:8085";
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  }
	  
	  @Test
	  public void testPage() throws Exception {
		log.info("***Run case of testLogin.***");
		
	
		try {			
			driver.get(baseUrl + "/ks-main/web/loginPage");
			driver.manage().window().maximize();
			StockVerify.pageVerify(driver);
			
		} catch (Exception e) {
			log.error("page is error", e);
			e.printStackTrace();
			CaptureScreenshot CSShot = new CaptureScreenshot();
		    ScreenShotFileName = CSShot.getScreenshotName(this, Thread.currentThread().getStackTrace()[1]);
		    CSShot.captureScreen(driver, ScreenShotFileName);
		    fail("failure");
			return;
		}		
			
		
		PrintFlag = false;
	  }


	  @After
	  public void tearDown() throws Exception {
	    //driver.quit();
	    String verificationErrorString = verificationErrors.toString();
	    if (!"".equals(verificationErrorString)) {
	      fail(verificationErrorString);
	    }
	  }
	  
}
