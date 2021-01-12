package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ShoesShow {
	WebDriver driver;
	private By shoe= By.xpath("(//a[@class='s-item__link'])[2]");
	
	
	public ShoesShow(WebDriver driver)
	 {
		 this.driver=driver;
	 }
	public void clickshoe()
	 {
		 driver.findElement(shoe).click();
	 }
	
}
