package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Grouplead {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com//opentaps/control/main");
		driver.manage().window().maximize();
		driver.findElement(By.name("USERNAME")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
	   String title=driver.getTitle();
	   System.out.println(title);
	   driver.findElement(By.linkText("CRM/SFA")).click();
	   driver.findElement(By.linkText("Leads")).click();
	   driver.findElement(By.linkText("Create Lead")).click();
    driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
    driver.findElement(By.id("createLeadForm_firstName")).sendKeys("sowmiya");
    driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("sowmi");
    driver.findElement(By.id("createLeadForm_personalTitle")).sendKeys("engineer");
  driver.findElement(By.id("createLeadForm_parentPartyId")).sendKeys("97654");
	}

}
