package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DailyDealsPage {
	WebDriver driver;
	private By ShopcatDD= By.id("gh-shop-a");
	private By SelprodDD=By.xpath("//*[@id=\"refit-spf-container\"]/div[2]/div[1]/div[1]/div/div/div[2]/a/h3/span/span");
	
	public DailyDealsPage(WebDriver driver)
	{
		this.driver=driver;  
	}
	public void ShopByCatDD()
	{
		driver.findElement(ShopcatDD).click();
	}
	public void SelproductDD()
	{
		driver.findElement(SelprodDD).click();
	}
	

}
