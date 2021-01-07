package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Msg 
{
	WebDriver driver;
	public String msg= "Recipe class Brochure is sent to your registered mail id";
	public By text= By.xpath("/html/body/p");
	private By link= By.linkText("Go Back to Registration");
	
	public String gett()
	{
		return driver.findElement(text).getText();
	}
	
	public Msg(WebDriver driver)
	{
		this.driver=driver;  
	}
	
	public void goback()
	{
		driver.findElement(link).click();
	}
	public void title()
	{
		driver.getTitle();
	}
	
	
}
