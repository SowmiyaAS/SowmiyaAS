package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FacebookAccount {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("sowmiyasiwethi4320@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("siwethi");
		driver.findElement(By.name("login")).click();

	}

}
