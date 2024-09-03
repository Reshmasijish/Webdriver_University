package Webdriveruniversity;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class contactus_wbu {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\SIJISH\\Desktop\\Automation\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	WebDriver Driver = new ChromeDriver();
	Driver.navigate().to("https://webdriveruniversity.com/");
	//Driver.get("https://webdriveruniversity.com/Click-Buttons/index.html");
	Driver.get("https://webdriveruniversity.com/Contact-Us/contactus.html");
	Driver.manage().window().maximize();
	WebElement Firstname = Driver.findElement(By.name("first_name"));
	Firstname.sendKeys("Reshma");
	WebElement Lastname = Driver.findElement(By.name("last_name"));
	Lastname.sendKeys("Sijish");
	WebElement Email = Driver.findElement(By.name("email"));
	Email.sendKeys("reshmar3094@gmail.com");
	WebElement Comments = Driver.findElement(By.name("message"));
	Comments.sendKeys("Contact alternate e-mail reshmasijish@yahoo.com");
	WebElement Submit = Driver.findElement(By.xpath("//*[@type='submit']"));
	Submit.click();
	//WebElement Reset = Driver.findElement(By.cssSelector("#form_buttons > input:nth-child(1)"));
	//Reset.click();
	
	}

}
