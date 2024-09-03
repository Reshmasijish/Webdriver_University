package Webdriveruniversity;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class datepicker {

	public static void main(String[] args) throws InterruptedException {
	ChromeOptions options = new ChromeOptions();
	WebDriver Driver = new ChromeDriver();
	Driver.navigate().to("https://www.webdriveruniversity.com/Datepicker/index.html");
	String month = "May 2023";
	
	WebElement datepickerinput = Driver.findElement(By.xpath("//*[@id=\"datepicker\"]/input"));
	datepickerinput.click();
	Thread.sleep(2000);
	while(true)
	
	{
	String monthyeartext = Driver.findElement(By.xpath("/html/body/div[2]/div[1]/table/thead/tr[1]/th[2]")).getText();
	if(monthyeartext.equals(month))
		
	{
	break;
	}
	
	else
	
	{
	WebElement leftarrow = Driver.findElement(By.xpath("/html/body/div[2]/div[1]/table/thead/tr[1]/th[1]"));
	leftarrow.click();
	
	}

	}

	WebElement day = Driver.findElement(By.xpath("/html/body/div[2]/div[1]/table/tbody/tr[3]/td[3]"));
	day.click();
	
}
}