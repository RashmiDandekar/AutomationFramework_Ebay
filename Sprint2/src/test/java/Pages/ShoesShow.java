package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ShoesShow {
	WebDriver driver;
	private By shoe= By.linkText("Reebok DAYTONA DMX MEN'S SHOES Size US 9");
	
	
	public ShoesShow(WebDriver driver)
	 {
		 this.driver=driver;
	 }
	public void clickshoe()
	 {
		 driver.findElement(shoe).click();
	 }
	
}
