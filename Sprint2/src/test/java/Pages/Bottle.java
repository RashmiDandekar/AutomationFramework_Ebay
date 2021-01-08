package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Bottle {
	WebDriver driver;
	private By Botname= By.linkText("Georgia. Bottle");
	
	public Bottle(WebDriver driver)
	 {
		 this.driver=driver;
	 }
	public void clickBottle()
	 {
		
		driver.findElement(Botname).click();
	 }
	
}