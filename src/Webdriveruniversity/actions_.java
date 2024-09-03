package Webdriveruniversity;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actions_ {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SIJISH\\Desktop\\Automation\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver Driver = new ChromeDriver();
//		Driver.get("https://webdriveruniversity.com/index.html");
//		WebElement actionn = Driver.findElement(By.xpath("//*[@id=\"actions\"]/div/div[1]"));
//		actionn.click();
		
		
//		This wont work , website is showing no frame.
//		Driver.switchTo().frame(0);
		
		Driver.get("https://webdriveruniversity.com/Actions/index.html");
		WebElement SourceElement = Driver.findElement(By.id("draggable"));
		WebElement TagetElement = Driver.findElement(By.id("droppable"));
		Actions ac = new Actions(Driver);
		ac.clickAndHold(SourceElement).moveToElement(TagetElement).release().build().perform();

	
		WebElement doubleclick = Driver.findElement(By.id("double-click"));
		ac.doubleClick(doubleclick).perform();
		
	}

}
