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
	private By dropd = By.id("gh-ug");
	private By signout = By.xpath("//a[@href=\"https://signin.ebay.com/ws/eBayISAPI.dll?SignIn&lgout=1\"]");
	public String dtext = " Daily Deals";
	public String htext = " Help & Contact";
	public String stext = " Sell";
	public String btext = "Buy";
	
	public HomePage(WebDriver driver)
	{
		this.driver= driver;
	}
	public String getbtext()
	{
		return driver.findElement(buy).getText();
	}
	public String getstext()
	{
		return driver.findElement(sell).getText();
	}
	public String gethtext()
	{
		return driver.findElement(helpcontact).getText();
	}
	public String getdtext()
	{
		return driver.findElement(dailyd).getText();
	}
	
	public void clicksignout()
	{
		driver.findElement(signout).click();
	}
	public void clickdropd()
	{
		driver.findElement(signout).click();
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
