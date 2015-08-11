package com.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * @author lili.sun
 * @date 2015年7月20日 上午10:00:53 
 * 
 */
public class RadioboxPage {
	
	
	@FindBy(id = "docTree:0:_t88")
	@CacheLookup
	public WebElement registerBtn;

	//Parameter:股票名称下拉
	@FindBy(xpath = "//form[@id='commonForm']/table/tbody/tr/td/div/ul/li/span[2]/span/span/a")
	@CacheLookup
	public WebElement stockNamepulldown;
	
	//Parameter:股票名称选择
	@FindBy(xpath = "//div[@id='_easyui_combobox_i1_1']")
	@CacheLookup
	public WebElement stockNameselect;
	
	
	//Parameter:有缺省 值下拉
	@FindBy(xpath = "//form[@id='commonForm']/table/tbody/tr/td/div/ul/li[2]/span[2]/span/span/a")
	@CacheLookup
	public WebElement displaypulldown;
		
	//Parameter:缺省值
	@FindBy(xpath = "//div[@id='_easyui_combobox_i2_1']")
	@CacheLookup
	public WebElement displayselect;
	
	//Parameter:数据类型  字段操作符
	@FindBy(xpath = "//form[@id='commonForm']/table/tbody/tr/td/div/ul/li[4]/span[2]/span/span/a")
	@CacheLookup
	public WebElement operatorpulldown;
		
	//Parameter:字段操作符
	@FindBy(xpath = "//div[@id='_easyui_combobox_i4_0']")
	@CacheLookup
	public WebElement operatorselect;
	
	//Parameter:高级查询
	@FindBy(xpath = "//form[@id='commonForm']/table/tbody/tr/td/div/div/span[2]/a")
	@CacheLookup
	public WebElement hiddenpulldown1;
	
	@FindBy(xpath = "//table[@id='ad_input_table']/tbody/tr/td/ul/li[3]/span[2]/span/span/a")
	@CacheLookup
	public WebElement hiddenpulldown2;
	
	@FindBy(xpath = "//div[@id='_easyui_combobox_i9_2']")
	@CacheLookup
	public WebElement hiddenpulldown3;
		
	//Parameter:高级查询
	@FindBy(xpath = "//div[3]/a[2]/span/span[2]")
	@CacheLookup
	public WebElement hiddenselect;
	
	//Parameter:搜索按钮 必填项
	@FindBy(xpath = "//a[@id='search']/span")
	@CacheLookup
	public WebElement search;
	
	//Parameter:父控件下拉
	@FindBy(xpath = "//form[@id='commonForm']/table/tbody/tr/td/div/ul/li[5]/span[2]/span/span/a")
	@CacheLookup
	public WebElement parentpulldown;
	
	//Parameter:父控件选择
	@FindBy(xpath = "//div[@id='_easyui_combobox_i5_7']")
	@CacheLookup
	public WebElement parentselect;
	
	//Parameter:子控件下拉
	@FindBy(xpath = "//form[@id='commonForm']/table/tbody/tr/td/div/ul/li[6]/span[2]/span/span/a")
	@CacheLookup
	public WebElement childpulldown;
	
	//Parameter:子控件选择
	@FindBy(xpath = "//div[@id='_easyui_combobox_i6_2']")
	@CacheLookup
	public WebElement childselect;

	//Parameter:综合查询
	@FindBy(xpath = "//div[@id='_easyui_tree_4']/span[4]")
	@CacheLookup
	public WebElement search1;
	
	@FindBy(css = "a.tabs-close")
	@CacheLookup
	public WebElement search2;
	
	@FindBy(xpath = "//form[@id='commonForm']/table/tbody/tr/td/div/ul/li[3]/span[2]/span/input")
	@CacheLookup
	public WebElement search3;
	
	@FindBy(xpath = "//div[@id='_easyui_combobox_i3_1']")
	@CacheLookup
	public WebElement search4;
	
	@FindBy(xpath = "//a[@id='search']/span")
	@CacheLookup
	public WebElement search5;
	
	/**
	 * Init WebElement
	 * @param driver
	 */
	public RadioboxPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public RadioboxPage() {
	}
	
}
