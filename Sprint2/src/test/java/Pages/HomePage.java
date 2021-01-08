package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage 
{
	WebDriver driver;
	private By signin = By.xpath("//a[@href=\"https://signin.ebay.com/ws/eBayISAPI.dll?SignIn&ru=https%3A%2F%2Fwww.ebay.com%2F\"]");
	private By dailyd= By.xpath("//a[@href=\"https://www.ebay.com/deals\"]");
	private By helpcontact= By.xpath("//a[@href=\"https://ocsnext.ebay.com/ocs/home\"]");
	private By sell= By.xpath("//a[@href=\"https://www.ebay.com/sl/sell\"]");
	private By buy= By.xpath("(//a[@href=\"https://www.ebay.com/n/all-categories\"])[3]");
	
	public HomePage(WebDriver driver)
	{
		this.driver= driver;
	}
	
	public void clicksignin()
	{
		driver.findElement(signin).click();
	}
	public void clickdailyd()
	{
		driver.findElement(dailyd).click();
	}
	public void clickhelpcontact()
	{
		driver.findElement(helpcontact).click();
	}
	public void clicksell()
	{
		driver.findElement(sell).click();
	}
	public void clickbuy()
	{
		driver.findElement(buy).click();
	}
	
}
