package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductPageDD {
	WebDriver driver;
	private By AddcartDD= By.id("atcRedesignId_btn");
	public ProductPageDD(WebDriver driver)
	{
		this.driver=driver;  
	}
	public void AddcartprodDD()
	{
		driver.findElement(AddcartDD).click();
	}

}

