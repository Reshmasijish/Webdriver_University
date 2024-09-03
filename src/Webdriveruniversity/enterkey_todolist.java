package Webdriveruniversity;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class enterkey_todolist {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SIJISH\\Desktop\\Automation\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver Driver = new ChromeDriver();
		Driver.navigate().to("https://webdriveruniversity.com/To-Do-List/index.html");
		Driver.manage().window().maximize();
		
		WebElement todo = Driver.findElement(By.cssSelector("#container > input[type=text]"));
		todo.click();
		todo.sendKeys("buy groceries");
		todo.sendKeys(Keys.RETURN);
		
		
		WebElement trash = Driver.findElement(By.xpath("//*[@id=\"container\"]/ul/li[1]/span/i"));
		trash.click();
	}

}
