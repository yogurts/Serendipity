package TestScript;


import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

import com.PageObjects.LoginPage;
import com.csvreader.CsvReader;

/** 
 * @author Lili.Sun  
 * @date 2015年6月15日 上午10:48:58 
 *  
 */

public class LoginTS {
	private static Logger log = Logger.getLogger(LoginTS.class.getName());
	
	public static void login(WebDriver driver, CsvReader reader) throws Exception {
		String account = reader.get("Account");
		String password = reader.get("Password");
		
		LoginPage loginPage = new LoginPage(driver);
		
	    loginPage.username.clear();
	    loginPage.username.sendKeys(account);
	    loginPage.password.clear();
	    loginPage.password.sendKeys(password);
	    loginPage.loginBtn.click();
	    Thread.sleep(2000);
	    
	    log.info("Title is:" + driver.getTitle());	 
		
	}
	
}
