package Webdriveruniversity;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class loginportal_wbu {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\SIJISH\\Desktop\\Automation\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	WebDriver Driver = new ChromeDriver();
	Driver.navigate().to("https://webdriveruniversity.com/Login-Portal/index.html");
	Driver.manage().window().maximize();
	WebElement username = Driver.findElement(By.id("text"));
	username.sendKeys("Reshmasijish");
	WebElement password = Driver.findElement(By.id("password"));
	password.sendKeys("Reshmasijish@123");
	WebElement Login = Driver.findElement(By.id("login-button"));
	Login.click();
	}

}
