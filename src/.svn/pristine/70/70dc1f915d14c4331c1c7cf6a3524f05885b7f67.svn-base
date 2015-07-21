package Testcase;


import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.eclipse.jdt.internal.compiler.ast.ThisReference;
import org.junit.*;

import static org.junit.Assert.*;

import org.openqa.selenium.*;
import org.openqa.selenium.ie.InternetExplorerDriver;

//import TestVerify.LoginVerify;

import org.openqa.selenium.remote.DesiredCapabilities;

import TestScript.LoginTS;
import TestVerify.StockVerify_bak;

import com.Core.CaptureScreenshot;
import com.Core.CommFunc;
import com.csvreader.CsvReader;

public class LoginTest_back {
  private static Logger log = Logger.getLogger(LoginTest_back.class.getName());
  //public WebDriver driver;
  public static WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();
  private String ScreenShotFileName = "";
  private boolean PrintFlag = true;

  @Before
  public void setUp() throws Exception {

	File file = new File("lib/IEDriverServer.exe");  
	System.setProperty("webdriver.ie.driver", file.getAbsolutePath());	
	System.setProperty("webdriver.ie.driver.loglevel", "INFO");		
	
	//DesiredCapabilities capabilities = DesiredCapabilities.internetExplorer();
    //capabilities.setCapability("logLevel", "DEBUG");
    //driver = new InternetExplorerDriver(capabilities);
    
	driver = new InternetExplorerDriver();
    baseUrl = "http://10.243.140.101:8085";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testLogin() throws Exception {
	//LoginVerify.inputBoxVerify(driver);
	log.info("***Run case of testLogin.***");
    CaptureScreenshot CSShot = new CaptureScreenshot();
    ScreenShotFileName = CSShot.getScreenshotName(this, Thread.currentThread().getStackTrace()[1]);
    driver.get(baseUrl + "/ks-main/web/loginPage");
    driver.manage().window().maximize();
	try {
		String filePath = CommFunc.getTestDataFile();
		CsvReader reader = new CsvReader(filePath);
		log.info(filePath);
		reader.readHeaders();
		
		while (reader.readRecord()) {			
		    LoginTS.login(driver, reader);		   
		    StockVerify_bak.inputBoxVerify(driver);
		}
	} catch (IOException e) {
		e.printStackTrace();
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