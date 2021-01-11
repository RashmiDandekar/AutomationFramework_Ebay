package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Buypage {
	WebDriver driver;
	 private By shopbuy= By.id("gh-shop-ei");
	 private By women= By.linkText("Women");
	 private By buysearchBox=By.xpath("//input[@type='text']");
     private By SearchBuy= By.id("gh-btn");
	 
	 public Buypage(WebDriver driver)
	 {
		 this.driver=driver;
	 }
	 public void clickshop()
	 {
		 driver.findElement(shopbuy).click();
	 }
	 public void clickwomen()
	 {
		 driver.findElement(women).click();
	 }
	 public void buysearchBox(String str)
		{
			 driver.findElement(buysearchBox).sendKeys(str);
		}
     public void clicksearchbuy()
		 {
			 driver.findElement(SearchBuy).click();
		 }
	 

}