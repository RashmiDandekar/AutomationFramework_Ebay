package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ListAnItempage {
	WebDriver driver;
	private By typeitem= By.xpath("//input[@type=\"text\"]");
	private By clickgo= By.xpath("//button[@class='keyword-suggestion__button btn btn--primary']");
	public ListAnItempage(WebDriver driver)
	{
		this.driver=driver;  
	}
	public void typeitem(String str) {
		driver.findElement(typeitem).sendKeys(str);
	}
	public void clickgo()
	{
		driver.findElement(clickgo).click();
	}
}
