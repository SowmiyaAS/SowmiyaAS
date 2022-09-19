package org.pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Adactinsearchpage {
	
	public WebDriver driver;
	
	@FindBy(xpath="//Select[@id='location']") private WebElement location;
	@FindBy(xpath="//Select[@id='hotels']") private WebElement hotel;
	@FindBy(xpath="//Select[@id='room_type']") private WebElement roomtype;
	@FindBy(xpath="//Select[@id='room_nos']") private WebElement roomnum;
	@FindBy(xpath="//Select[@id='adult_room']") private WebElement adultroom;
	@FindBy(xpath="//Select[@id='child_room']") private WebElement childroom;
	@FindBy(xpath="//input[@id='Submit']") private WebElement search;
	
	
	
	
	
	
	
	
	
	public Adactinsearchpage(WebDriver driver2) {

		this.driver=driver2;
		PageFactory.initElements(driver, this);
		
		
	}
	public WebElement getLocation() {
		return location;
	}
	public WebElement getHotel() {
		return hotel;
	}
	public WebElement getRoomtype() {
		return roomtype;
	}
	public WebElement getRoomnum() {
		return roomnum;
	}
	public WebElement getAdultroom() {
		return adultroom;
	}
	public WebElement getChildroom() {
		return childroom;
	}
	public WebElement getSearch() {
		return search;
	}
	
	
	
	

}
