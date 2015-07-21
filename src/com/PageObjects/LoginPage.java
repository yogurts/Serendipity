package com.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/** 
 * @author Lili.Sun  
 * @date 2015年6月10日 上午9:39:08 
 *  
 */

public class LoginPage {
	// Parameter: username
	@FindBy(id = "userCode")
	@CacheLookup
	public WebElement username;

	// Parameter: password
	@FindBy(id = "userPwd")
	@CacheLookup
	public WebElement password;	
	
	// Parameter: loginBtn
	@FindBy(css = "input[type=\"image\"]")
	@CacheLookup
	public WebElement loginBtn;	

	
	/**
	 * Init WebElement
	 * @param driver
	 */
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public LoginPage() {
	}
}
