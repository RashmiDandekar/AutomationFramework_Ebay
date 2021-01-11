package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Sellyouritempage {
	
		WebDriver driver;
		private By sellone= By.xpath("//a[@href=\"javacript:;\"]");
		private By popit=By.xpath("//button[@class=\"btn btn--primary btn--large-text\"]");
		public Sellyouritempage(WebDriver driver)
		{
			this.driver=driver;  
		}
		
		public void pop() {
			driver.findElement(popit).click();
		}
		
		public void sellonelikethis()
		{
			driver.findElement(sellone).click();
		}
}
