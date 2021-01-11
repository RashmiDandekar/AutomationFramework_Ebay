package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class women {
	WebDriver driver;
	//private By firstItem=By.xpath("//*[@id=\"s0-27-9-0-1[0]-0-0-xCarousel-x-carousel-items\"]/ul/li[1]/a/div[2]/div[1]");
	
	public String getTit()
	{
		return driver.getTitle();
	}
	public women(WebDriver driver)
	 {
		 this.driver=driver;
	 }
	
}
