package TestScript;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.Core.CommFunc;
import com.PageObjects.LoginPage;
import com.csvreader.CsvReader;

/** 
 * @author Lili.Sun  
 * @date 2015年6月15日 上午10:48:58 
 *  
 */

public class LoginTS {
	private static final Logger log = LoggerFactory.getLogger(LoginTS.class);
	
	public static void login(WebDriver driver, CsvReader reader) throws Exception {
		String account = reader.get("Account");
		String password = reader.get("Password");
		
		LoginPage loginPage = new LoginPage(driver);
		
	    loginPage.username.clear();
	    loginPage.username.sendKeys(account);
	    loginPage.password.clear();
	    loginPage.password.sendKeys(password);
	    loginPage.loginBtn.click();
	    CommFunc.waitForExists(driver, 10, By.xpath("//a[contains(text(),'股票系统')]"));
	    
	    log.info("Title is:" + driver.getTitle());	 
		
	}
	
}
