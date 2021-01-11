package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Register 
{
	private By fname= By.id("firstname");
	private By lname= By.id("lastname");
	private By email= By.id("Email");
	private By pass= By.id("password");
	private By createaccbut= By.id("EMAIL_REG_FORM_SUBMIT");
	WebDriver driver;
	public String ewarn= "Email address is invalid. Please enter a valid email address.";
	private By ewarnLoc= By.id("Email_err");
	
	public String getwarnemail()
	{
		return driver.findElement(ewarnLoc).getText();
	}
	public Register(WebDriver driver)
	 {
		 this.driver= driver;
	 }
	public void typefname(String str)
	{
		driver.findElement(fname).sendKeys(str);
	}
	public void typelname(String str)
	{
		driver.findElement(lname).sendKeys(str);
	}
	public void typeemail(String str)
	{
		driver.findElement(email).sendKeys(str);
	}
	public void typepass(String str)
	{
		driver.findElement(pass).sendKeys(str);
	}
	public void click_createaccbut()
	{
		boolean b =  driver.findElement(fname).isEnabled();
		if(b)
			driver.findElement(fname).click();
		else
			System.out.println("crate account button is disabled");
	}
	public void clickPass()
	{
		driver.findElement(pass).click();
	}
}
