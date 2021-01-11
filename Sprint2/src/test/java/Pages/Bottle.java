package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Bottle {
	WebDriver driver;
	private By Botname= By.linkText("Drinking Bottle Brown Clear with Cap");
	//private By Botname=By.xpath("//h3[@class=\"s-item__title\"]");
			//h3/span[@class="LIGHT_HIGHLIGHT"]
	public Bottle(WebDriver driver)
	 {
		 this.driver=driver;
	 }
	public void clickBottle()
	 {
		
		driver.findElement(Botname).click();
	 }
	
}