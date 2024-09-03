package Webdriveruniversity;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class fileupload {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\SIJISH\\Desktop\\Automation\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	WebDriver Driver = new ChromeDriver();
	Driver.get("https://webdriveruniversity.com/File-Upload/index.html");
	WebElement fileupload = Driver.findElement(By.id("myFile"));
	fileupload.sendKeys("C:\\Users\\SIJISH\\Pictures\\Saved Pictures\\reshu sijish.jpg");
	//Thread.sleep(7000);
	WebElement submit = Driver.findElement(By.id("submit-button"));
	submit.click();
	}

}
