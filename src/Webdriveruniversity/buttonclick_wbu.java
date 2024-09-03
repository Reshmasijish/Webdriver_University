package Webdriveruniversity;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class buttonclick_wbu {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\SIJISH\\Desktop\\Automation\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	WebDriver Driver = new ChromeDriver();
	Driver.get("https://webdriveruniversity.com/Click-Buttons/index.html");
	Driver.manage().window();
	WebElement login1 = Driver.findElement(By.xpath("//*[@id=\"button1\"]"));
	login1.click();
	//WebElement login2 = Driver.findElement(By.cssSelector("document.querySelector(\"#button2\")"));
	//login2.click();
	//WebElement login3 = Driver.findElement(By.id("button3"));
	//login3.click();
	//Driver.close();
	}

}
