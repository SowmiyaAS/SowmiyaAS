package org.runnerclass;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.basecalss.Base_Class;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.remote.NewSessionPayload;
import org.openqa.selenium.support.ui.Select;
import org.pomclass.Adactinbooknowpage;
import org.pomclass.Adactincontpage;
import org.pomclass.Adactinlogin;
import org.pomclass.Adactinsearchpage;
import org.pommanager.Managerclass;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Adactinrunner extends Base_Class{

	public static WebDriver driver = browser_configuration("chrome");

//	public static Adactinlogin al=new Adactinlogin(driver);
//
//	public static Adactinsearchpage as=new Adactinsearchpage(driver);
//	
//	public static Adactincontpage ac=new  Adactincontpage(driver);
//	
//	public static Adactinbooknowpage ab=new Adactinbooknowpage(driver);
	
//	
	public static Managerclass pom=new Managerclass(driver);

	public static void main(String[] args) throws Throwable {

		//WebDriverManager.chromedriver().setup();
		//ChromeDriver driver=new ChromeDriver();
		//driver.get("https://adactinhotelapp.com/index.php");
		getUrl("https://adactinhotelapp.com/index.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);

		//Adactinlogin al=new Adactinlogin(driver);

		//driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Sowmiya98");
		inputvalueelement(pom.Instance_getAl().getUsername(), "Sowmiya98");
		//driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Siwethi@98");
		inputvalueelement(pom.Instance_getAl().getPassword(), "Siwethi@98");
		//driver.findElement(By.xpath("//input[@id='login']")).click();
		clickonElement(pom.Instance_getAl().getLogin());



		//nextpage

		//Adactinsearchpage as=new Adactinsearchpage(driver);


		//click location
		
//				WebElement location= driver.findElement(By.xpath("//Select[@id='location']"));
//				Select locate=new Select(location);
//				locate.selectByValue("New York");
        
	    		
	    		//locate.selectByIndex(2);
		//int index = Integer.parseInt("2");
				

//dropdown(pom.getAs().getLocation(), "New York");
inputvalueelement(pom.getAs().getLocation(), "New York");

		//select hotels
		//		WebElement hotels = driver.findElement(By.xpath("//Select[@id='hotels']"));
		//		Select hotel=new Select(hotels);
		//		hotel.selectByVisibleText("Hotel Sunshine");
		//		
		inputvalueelement(pom.getAs().getHotel(), "Hotel Sunshine");

		//select room type

//				WebElement room = driver.findElement(By.xpath("//Select[@id='room_type']"));
//				Select type=new Select(room);
//				type.selectByValue("Deluxe");

		inputvalueelement(pom.getAs().getRoomtype(),"Deluxe");

		//select room num
//				WebElement roomno = driver.findElement(By.xpath("//Select[@id='room_nos']"));
//				Select roomnum=new Select(roomno);
//				roomnum.selectByVisibleText("2 - Two");
		
		inputvalueelement(pom.getAs().getRoomnum(), "2 - Two");

		//select adult room
		//		WebElement adult = driver.findElement(By.xpath("//Select[@id='adult_room']"));
		//		Select aduroom=new Select(adult);
		//		aduroom.selectByValue("3");

		inputvalueelement(pom.getAs().getAdultroom(), "3");

		//select child room
		//		WebElement child = driver.findElement(By.xpath("//Select[@id='child_room']"));
		//		Select chroom=new Select(child);
		//		chroom.selectByVisibleText("1 - One");

		inputvalueelement(pom.getAs().getChildroom(), "1 - One");


		//click search
		//driver.findElement(By.xpath("//input[@id='Submit']")).click();

		clickonElement(pom.getAs().getSearch());

		//next page

		//Adactincontpage ac=new  Adactincontpage(driver);

		//click circle
		//driver.findElement(By.xpath("//input[@type='radio']")).click();
		
		clickonElement(pom.getAc().getClickcirce());
		
		//click continue
		//driver.findElement(By.xpath("//input[@name='continue']")).click();
		
		clickonElement(pom.getAc().getClickcontinue());
		

		//next page
		
		//Adactinbooknowpage ab=new Adactinbooknowpage(driver);


		//send first name
		//driver.findElement(By.xpath("//input[@id='first_name']")).sendKeys("Sowmiya");
		
		inputvalueelement(pom.getAb().getFirstname(), "Sowmiya");

		//send last name

		//driver.findElement(By.xpath("//input[@id='last_name']")).sendKeys("Ayyadurai");
		
		inputvalueelement(pom.getAb().getLastname(), "Ayyadurai");

		//send address

		//driver.findElement(By.xpath("//textarea[@id='address']")).sendKeys("Andakottai");
		
		inputvalueelement(pom.getAb().getAddress(), "Andakottai");

		//send card num

		//driver.findElement(By.xpath("//input[@name='cc_num']")).sendKeys("6543987612347654");
		
		inputvalueelement(pom.getAb().getCardnum(), "6543987612347654");
		
		//credit card type
//		WebElement card = driver.findElement(By.xpath("//Select[@id='cc_type']"));
//		Select cardtype=new Select(card);
//		cardtype.selectByValue("VISA");
		
		inputvalueelement(pom.getAb().getCardtype(), "VISA");

		//expire month
//		WebElement month= driver.findElement(By.xpath("//Select[@id='cc_exp_month']"));
//		Select expiremonth=new Select(month);
//		expiremonth.selectByVisibleText("March");
		
		inputvalueelement(pom.getAb().getExpiremonth(), "March");

		//  expire yr 
//		WebElement yr = driver.findElement(By.xpath("//Select[@id='cc_exp_year']"));
//		Select year=new Select(yr);
//		year.selectByVisibleText("2022");
		
		inputvalueelement(pom.getAb().getExpireyear(), "2022");
		
		//cvv number

		//driver.findElement(By.xpath("//input[@id='cc_cvv']")).sendKeys("543");
		
		inputvalueelement(pom.getAb().getCvvnum(), "543");


		//click book now
		//driver.findElement(By.xpath("//input[@id='book_now']")).click();
		
		clickonElement(pom.getAb().getBooknow());
		
		
		//get screenshot
		
//		TakesScreenshot ts = (TakesScreenshot) driver;
//		File source = ts.getScreenshotAs(OutputType.FILE);
//		File dest = new File("./adactinscr.png");
//		FileUtils.copyFile(source, dest);
	
		
	fileutils("./adactinscr.png");
}

	

}
