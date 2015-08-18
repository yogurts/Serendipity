package Testcase;


import static org.junit.Assert.fail;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.junit.*;

import TestScript.LoginTS;
import TestVerify.StockVerify;

import com.Core.BaseClass;
import com.Core.CommFunc;
import com.csvreader.CsvReader;

/** 
 * @author Lili.Sun  
 * @date 2015年6月5日 上午10:53:53 
 *  
 */
public class LoginTest extends BaseClass{
	
	  private static final Logger log = LoggerFactory.getLogger(LoginTest.class);
	  private String baseUrl;
	  
	  @Test
	  public void testLogin() throws Exception {
		log.info("***Run case of testLogin.***");
		PrintFlag = true;
	    baseUrl = "http://10.243.140.101:8085";
	    driver.get(baseUrl + "/ks-main/web/loginPage");
	    driver.manage().window().maximize();
	    
		try {
			String filePath = CommFunc.getTestDataFile();
			CsvReader reader = new CsvReader(filePath);
			log.info(filePath);
			reader.readHeaders();
			
			while (reader.readRecord()) {			
			    LoginTS.login(driver, reader);
				StockVerify.loginVerify(driver);
			}
		} catch (Exception e) {
			log.error("login is error", e);
			e.printStackTrace();
		    fail("failure");
			return;
		}		
		PrintFlag = false;
		
	  }

}