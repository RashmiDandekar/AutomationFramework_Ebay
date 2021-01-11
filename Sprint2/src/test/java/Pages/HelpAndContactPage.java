package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HelpAndContactPage{
	WebDriver driver;
	private By searchbox= By.id("search_input_element");
	private By querysuggestion= By.xpath("/html/body/div[5]/div[2]/div[1]/div[1]/div[3]/div[1]/div/div/div[2]/div/div/a[1]");
	private By selectquery= By.id("popular_solution_1");
	public HelpAndContactPage(WebDriver driver) {
		this.driver= driver;
	}
	public void typequery(String src) {
		driver.findElement(searchbox).sendKeys(src);
	}
	public void querysuggest() {
		driver.findElement(querysuggestion).click();
	}
	public void selectquery() {
		driver.findElement(selectquery).click();
	}
	
}
