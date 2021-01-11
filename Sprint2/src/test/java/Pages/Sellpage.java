package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Sellpage {
	WebDriver driver;
	private By list_an_item= By.xpath("//a[@href=\"/sl/prelist/suggest\"]");
	
	public Sellpage(WebDriver driver)
	{
		this.driver=driver;  
	}
	
	public void list_an_item()
	{
		driver.findElement(list_an_item).click();
	}
}
