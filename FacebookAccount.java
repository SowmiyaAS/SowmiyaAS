package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FacebookAccount {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver facebook=new ChromeDriver();
		facebook.get("https://www.facebook.com/");
		facebook.findElement(By.id("email")).sendKeys("sowmiyasiwethi4320@gmail.com");
		facebook.findElement(By.id("pass")).sendKeys("siwethi");
		facebook.findElement(By.name("login")).click();

	}

}
