package com.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/** 
 * @author Lili.Sun  
 * @date 2015年6月24日 上午10:39:08 
 *  
 */

public class StockPage {
	
	//Parameter:股票名称
	@FindBy(xpath = "//div[@id='51c7da04a8b8440aa6582f5827db3d25_modifyDialog']/form/table/tbody/tr/td[2]/span/input")
	@CacheLookup
	public WebElement stockName;
	
	//Parameter:股票代码
	@FindBy(xpath = "//div[@id='51c7da04a8b8440aa6582f5827db3d25_modifyDialog']/form/table/tbody/tr/td[4]/span/input")
	@CacheLookup
	public WebElement stockCode;
	
	//Parameter:股票数量
	@FindBy(xpath = "//div[@id='51c7da04a8b8440aa6582f5827db3d25_modifyDialog']/form/table/tbody/tr[2]/td[2]/span/input")
	@CacheLookup
	public WebElement volume;
	
	//Parameter:当前价格
	@FindBy(xpath = "//div[@id='51c7da04a8b8440aa6582f5827db3d25_modifyDialog']/form/table/tbody/tr[3]/td[2]/span/input")
	@CacheLookup
	public WebElement presentPrice;
	
	
	/**
	 * Init WebElement
	 * @param driver
	 */
	public StockPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public StockPage() {
	}
	
}