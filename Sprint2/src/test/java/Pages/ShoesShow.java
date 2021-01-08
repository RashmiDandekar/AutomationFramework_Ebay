package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ShoesShow {
	WebDriver driver;
	private By shoe= By.linkText("Reebok BB 4600 FV7352 Mens White Lace Up Basketball Sneakers Shoes");
	
	public ShoesShow(WebDriver driver)
	 {
		 this.driver=driver;
	 }
	public void clickshoe()
	 {
		 driver.findElement(shoe).click();
	 }
	
}