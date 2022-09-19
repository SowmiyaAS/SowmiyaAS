package org.pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;





public class Adactinhomepage {
	
	public WebDriver driver;
	
@FindBy(xpath ="//a[text()='New User Register Here'] ") private WebElement userregister;
@FindBy(xpath=" //input[@name='username'] ")private WebElement username;

@FindBy(xpath=" //input[@id='password'] ")private WebElement password;


@FindBy(xpath=" //input[@id='re_password'] ")private WebElement  confirmpassword;

@FindBy(xpath=" //input[@id='full_name'] ")private WebElement fullname;

@FindBy (xpath= "  //input[@id='email_add']") private WebElement email;

public Adactinhomepage(WebDriver driver2) {
	
	
	
	this.driver=driver2;
	
	PageFactory.initElements(driver, this);
}



public WebElement getUserregister() {
	return userregister;
}

public WebElement getUsername() {
	return username;
}

public WebElement getPassword() {
	return password;
}

public WebElement getConfirmpassword() {
	return confirmpassword;
}

public WebElement getFullname() {
	return fullname;
}

public WebElement getEmail() {
	return email;
}



	
	
	
	
	

}
