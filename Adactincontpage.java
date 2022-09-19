package org.pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Adactincontpage {
	
	public WebDriver driver;
	
	@FindBy(xpath ="//input[@type='radio']") private WebElement clicksearchhotelbutton;
	@FindBy(xpath ="//input[@name='continue']") private WebElement clickcontinue;
	
	
	
	
	public Adactincontpage(WebDriver driver2) {
		// TODO Auto-generated constructor stub
		
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}
	public WebElement getClickcirce() {
		return clicksearchhotelbutton;
	}
	public WebElement getClickcontinue() {
		return clickcontinue;
	}
	
	
	

}
