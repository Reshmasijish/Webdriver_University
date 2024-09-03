package Webdriveruniversity;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown_checkbox_radiobutton {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\SIJISH\\Desktop\\Automation\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	WebDriver Driver = new ChromeDriver();
	Driver.navigate().to("https://webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
	Driver.manage().window().maximize();
	Select dropdown1 = new Select(Driver.findElement(By.id("dropdowm-menu-1")));
	dropdown1.selectByIndex(0);
	//dropdown1.selectByValue("sql");
	//dropdown1.selectByVisibleText("Python");
	Select dropdown2 = new Select(Driver.findElement(By.id("dropdowm-menu-2")));
	dropdown2.selectByIndex(0);
	//dropdown2.selectByVisibleText("Maven");
	//dropdown2.selectByValue("testng");
	Select dropdown3 = new Select(Driver.findElement(By.id("dropdowm-menu-3")));
	dropdown3.selectByIndex(1);
	//dropdown3.selectByValue("javascript");
	//dropdown3.selectByVisibleText("JQuery");
	Driver.findElement(By.id("checkboxes"));
	WebElement option1 = Driver.findElement(By.xpath("//*[@id=\"checkboxes\"]/label[1]/input"));
	option1.click();
	WebElement option4 = Driver.findElement(By.xpath("//*[@id=\"checkboxes\"]/label[4]/input"));
	option4.click();
	WebElement Radiobutton = Driver.findElement(By.xpath("//*[@id=\"radio-buttons\"]/input[2]"));
	Radiobutton.click();
	//Driver.close();
	}

}
