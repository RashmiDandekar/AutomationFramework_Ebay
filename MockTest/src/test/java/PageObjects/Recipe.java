package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Recipe 
{
	WebDriver driver;
	private By firstname= By.id("fname");
	private By lastname= By.id("lname");
	private By email= By.id("emails");
	private By mobile= By.id("mobile");
	private By category= By.xpath("//select[@name='D6']");
	private By city= By.xpath("//select[@name='D5']");
	private By mode= By.xpath("//select[@name='D4']");
	private By course = By.xpath("(//select[@name='D4'])[2]");
	private By enquire= By.id("enqdetails");
	private By ennow= By.xpath("//*[@id=\"Submit1\"]");
	private By down = By.xpath("//a[@href='msg.html']");
	public String altmsg = "Thank you for submitting the online recipe class Enquiry";
	public String confmsg= "Our location representative will contact you soon.";
	private By con = By.xpath("//h3");
	
	public String confget()
	{
		return driver.findElement(con).getText();
	}
	public Recipe(WebDriver driver)
	{
		this.driver=driver;  
	}
	public void DownLoad()
	{
		driver.findElement(down).click();
	}
	public String title()
	{
		return driver.getTitle();
	}
	public String titlePrint()
	{
		return driver.getTitle();
	}
	
	public void firstName(String str)
	{
		driver.findElement(firstname).sendKeys(str);
	}
	public void firstClick()
	{
		driver.findElement(firstname).click();
	}
	
	public void Lastname(String str)
	{
		driver.findElement(lastname).sendKeys(str);
	}
	public void Lastclick()
	{
		driver.findElement(lastname).click();
	}
	public void Email(String str)
	{
		driver.findElement(email).sendKeys(str);
	}
	public void Mobile(String str)
	{
		driver.findElement(mobile).sendKeys(str);
	}
	public void Category()
	{
		WebElement wb = driver.findElement(category);
		Select s= new Select(wb);
		s.selectByVisibleText("Non-Veg");
	}
	public void Categoryclick()
	{
		driver.findElement(category).click();
	}
	public void City()
	{
		WebElement wb1 = driver.findElement(city);
		Select s1= new Select(wb1);
		s1.selectByVisibleText("Mumbai");
	}
	public void Mode()
	{
		WebElement wb2 = driver.findElement(mode);
		Select s2= new Select(wb2);
		s2.selectByVisibleText("In house training");
	}
	public void Course()
	{
		WebElement wb3 = driver.findElement(course);
		Select s3= new Select(wb3);
		s3.selectByVisibleText("6 months");
	}
	public void Enquiry(String str)
	{
		driver.findElement(enquire).sendKeys(str);
	}
	public void Ennow()
	{
		driver.findElement(ennow).click();
	}
}
