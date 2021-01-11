package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddToCart {
	WebDriver driver;
	private By AddCart=By.xpath("//*[@id=\"atcRedesignId_btn\"]");

	public AddToCart (WebDriver driver)
	 {
		 this.driver=driver;
	 }
public void AddCart()
{
	 driver.findElement(AddCart).click();
}
}

