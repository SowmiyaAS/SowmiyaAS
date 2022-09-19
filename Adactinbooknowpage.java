package org.pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Adactinbooknowpage {
	   
	public WebDriver driver;
		
	
	
	@FindBy(xpath = "//input[@id='first_name']")private WebElement firstname;
	@FindBy(xpath = "//input[@id='last_name']")private WebElement lastname;
	@FindBy(xpath = "//textarea[@id='address']")private WebElement address;
	@FindBy(xpath = "//input[@name='cc_num']")private WebElement cardnum;
	@FindBy(xpath = "//Select[@id='cc_type']")private WebElement cardtype;
	@FindBy(xpath = "//Select[@id='cc_exp_month']")private WebElement expiremonth;
	@FindBy(xpath = "//Select[@id='cc_exp_year']")private WebElement expireyear;
	@FindBy(xpath = "//input[@id='cc_cvv']")private WebElement cvvnum;
	@FindBy(xpath = "//input[@id='book_now']")private WebElement booknow;
	
	
	
	public Adactinbooknowpage(WebDriver driver2) {
		// TODO Auto-generated constructor stub
		
		
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}
	public WebElement getFirstname() {
		return firstname;
	}
	public WebElement getLastname() {
		return lastname;
	}
	public WebElement getAddress() {
		return address;
	}
	public WebElement getCardnum() {
		return cardnum;
	}
	public WebElement getCardtype() {
		return cardtype;
	}
	public WebElement getExpiremonth() {
		return expiremonth;
	}
	public WebElement getExpireyear() {
		return expireyear;
	}
	public WebElement getCvvnum() {
		return cvvnum;
	}
	public WebElement getBooknow() {
		return booknow;
	}

	

	
}
