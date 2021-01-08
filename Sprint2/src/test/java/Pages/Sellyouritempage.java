package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Sellyouritempage {
	
		WebDriver driver;
		private By sellone= By.xpath("//a[@href=\"javacript:;\"]");
		public Sellyouritempage(WebDriver driver)
		{
			this.driver=driver;  
		}
		
		public void sellonelikethis()
		{
			driver.findElement(sellone).click();
		}
}
