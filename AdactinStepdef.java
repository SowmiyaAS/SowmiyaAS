package org.StepdefinitionAdactin;

import java.awt.Window;
import java.io.File;
import java.util.concurrent.TimeUnit;

import javax.swing.plaf.basic.BasicTreeUI.TreeHomeAction;

import org.apache.commons.io.FileUtils;
import org.basecalss.Base_Class;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.pomclass.Adactinbooknowpage;
import org.pomclass.Adactincontpage;
import org.pomclass.Adactinlogin;
import org.pomclass.Adactinsearchpage;
import org.pommanager.Managerclass;
import org.testrunner.AdactinTestrunner;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AdactinStepdef extends Base_Class {

	public static WebDriver driver = AdactinTestrunner.driver;

//	public static Adactinlogin al = new Adactinlogin(driver);
//
//	public static Adactinsearchpage as = new Adactinsearchpage(driver);
//
//	public static Adactincontpage ac = new Adactincontpage(driver);
//
//	public static Adactinbooknowpage ab = new Adactinbooknowpage(driver);
	public static Managerclass pom=new Managerclass(driver);


	@Given("user launch the application")
	public void user_launch_the_application() throws Throwable {
		getUrl("https://adactinhotelapp.com/index.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	}

	@When("user enter valid username")
	public void user_enter_valid_username() throws Throwable {
		inputvalueelement(pom.Instance_getAl().getUsername(), particularData("C:\\Users\\tgt593\\eclipse-workspace1\\CyclosProject\\Adactin.xlsx",0,1));

	}

	@When("user enter valid password")
	public void user_enter_valid_password() throws Throwable {
		inputvalueelement(pom.Instance_getAl().getPassword(), particularData("C:\\Users\\tgt593\\eclipse-workspace1\\CyclosProject\\Adactin.xlsx", 1, 1));

	}

	@Then("user clik on the login button and it navigate to the next page")
	public void user_clik_on_the_login_button_and_it_navigate_to_the_next_page() throws Throwable {
		clickonElement(pom.Instance_getAl().getLogin());

		Thread.sleep(3000);
		fileutils("C:\\Users\\tgt593\\eclipse-workspace1\\CyclosProject\\Screenshot\\adactinscr1.png");
	}

	@When("user enter  the location")
	public void user_enter_the_location() throws Throwable {
		inputvalueelement(pom.getAs().getLocation(), particularData("C:\\Users\\tgt593\\eclipse-workspace1\\CyclosProject\\Adactin.xlsx", 2, 1));

	}

	@When("user enter the hotel name")
	public void user_enter_the_hotel_name() throws Throwable {
		inputvalueelement(pom.getAs().getHotel(), particularData("C:\\Users\\tgt593\\eclipse-workspace1\\CyclosProject\\Adactin.xlsx", 3,1));
	}

	@When("user enter  the hotel roomtype")
	public void user_enter_the_hotel_roomtype() throws Throwable {
		inputvalueelement(pom.getAs().getRoomtype(), particularData("C:\\Users\\tgt593\\eclipse-workspace1\\CyclosProject\\Adactin.xlsx", 4, 1));

	}

	@When("user enter the hotel roomnum")
	public void user_enter_the_hotel_roomnum() throws Throwable {
		inputvalueelement(pom.getAs().getRoomnum(), particularData("C:\\Users\\tgt593\\eclipse-workspace1\\CyclosProject\\Adactin.xlsx", 5, 1));

	}

	@When("user enter the adults per room")
	public void user_enter_the_adults_per_room() throws Throwable {

		inputvalueelement(pom.getAs().getAdultroom(), particularData("C:\\Users\\tgt593\\eclipse-workspace1\\CyclosProject\\Adactin.xlsx", 6, 1));
	}

	@When("user enter the Childrens per room")
	public void user_enter_the_childrens_per_room() throws Throwable {
		inputvalueelement(pom.getAs().getChildroom(), particularData("C:\\Users\\tgt593\\eclipse-workspace1\\CyclosProject\\Adactin.xlsx", 7, 1));

	}

	@Then("user click on the search button and it navigate to the continue page")
	public void user_click_on_the_search_button_and_it_navigate_to_the_continue_page() throws Throwable {
		clickonElement(pom.getAs().getSearch());

		Thread.sleep(3000);
		fileutils("C:\\Users\\tgt593\\eclipse-workspace1\\CyclosProject\\Screenshot\\adactinscr2.png");
	}

	@When("user click on the select hotel button")
	public void user_click_on_the_select_hotel_button() throws Throwable {

		clickonElement(pom.getAc().getClickcirce());
	}

	@When("user click on the continue button and it navigate to the booknow page")
	public void user_click_on_the_continue_button_and_it_navigate_to_the_booknow_page() throws Throwable {

		clickonElement(pom.getAc().getClickcontinue());
		Thread.sleep(3000);

		fileutils("C:\\Users\\tgt593\\eclipse-workspace1\\CyclosProject\\Screenshot\\adactinscr3.png");
	}

	@When("user enter the first name")
	public void user_enter_the_first_name() throws Throwable {
		inputvalueelement(pom.getAb().getFirstname(), particularData("C:\\Users\\tgt593\\eclipse-workspace1\\CyclosProject\\Adactin.xlsx", 8, 1));

	}

	@When("user enter the last name")
	public void user_enter_the_last_name() throws Throwable {
		inputvalueelement(pom.getAb().getLastname(), particularData("C:\\Users\\tgt593\\eclipse-workspace1\\CyclosProject\\Adactin.xlsx", 9, 1));

	}

	@When("user enter the address")
	public void user_enter_the_address() throws Throwable {

		inputvalueelement(pom.getAb().getAddress(), particularData("C:\\Users\\tgt593\\eclipse-workspace1\\CyclosProject\\Adactin.xlsx", 10, 1));

	}

	@When("user enter the card number")
	public void user_enter_the_card_number() throws Throwable {
		inputvalueelement(pom.getAb().getCardnum(), particularData("C:\\Users\\tgt593\\eclipse-workspace1\\CyclosProject\\Adactin.xlsx", 11, 1));

	}

	@When("user enter the card type")
	public void user_enter_the_card_type() throws Throwable {

		inputvalueelement(pom.getAb().getCardtype(), particularData("C:\\Users\\tgt593\\eclipse-workspace1\\CyclosProject\\Adactin.xlsx", 12,1));
	}

	@When("user enter the cardexpiremonth")
	public void user_enter_the_cardexpiremonth() throws Throwable {
		inputvalueelement(pom.getAb().getExpiremonth(),particularData("C:\\Users\\tgt593\\eclipse-workspace1\\CyclosProject\\Adactin.xlsx", 13, 1));

	}

	@When("user enter the cardexpireyear")
	public void user_enter_the_cardexpireyear() throws Throwable {
		inputvalueelement(pom.getAb().getExpireyear(), particularData("C:\\Users\\tgt593\\eclipse-workspace1\\CyclosProject\\Adactin.xlsx", 14, 1));

	}

	@When("user enter the cvv number")
	public void user_enter_the_cvv_number() throws Throwable {

		inputvalueelement(pom.getAb().getCvvnum(), particularData("C:\\Users\\tgt593\\eclipse-workspace1\\CyclosProject\\Adactin.xlsx", 15,1));
	}

	@Then("user enter the booknow button and it navigate to the booknow page")
	public void user_enter_the_booknow_button_and_it_navigate_to_the_booknow_page() throws Throwable {
		clickonElement(pom.getAb().getBooknow());
//screenshot

		fileutils("C:\\Users\\tgt593\\eclipse-workspace1\\CyclosProject\\Screenshot\\adactinscr4.png");

		// scroll
		Thread.sleep(6000);
		WebElement scroll = driver.findElement(By.xpath("//td[@class='footer']"));

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,350)", scroll);
	}
}
