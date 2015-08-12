package com.PageObjects;

import org.openqa.selenium.By;
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
	//Parameter:添加股票
	@FindBy(xpath = "//a[contains(text(),'股票系统')]")
	@CacheLookup
	public WebElement addstock1;
	
	
	//Parameter:添加股票
	@FindBy(xpath = "//div[@id='_easyui_tree_1']/span")
	@CacheLookup
	public WebElement addstock2;
	
	//Parameter:添加股票
	@FindBy(css = "#_easyui_tree_2 > span.tree-title")
	@CacheLookup
	public WebElement addstock3;
	
	//Parameter:添加股票
	@FindBy(id = "51c7da04a8b8440aa6582f5827db3d25")
	@CacheLookup
	public WebElement addstock4;
	
	//Parameter:添加股票
	@FindBy(css = "span.l-btn-text")
	@CacheLookup
	public WebElement addstock5;
	
	
	
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