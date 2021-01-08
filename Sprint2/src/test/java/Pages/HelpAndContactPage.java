package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HelpAndContactPage{
	WebDriver driver;
	private By searchbox= By.id("search_input_element");
	private By querysuggestion= By.xpath("//*[@id=\"search_suggestions_lists\"]/a[1]/span/span[2]");
	private By selectquery= By.id("popular_solution_1");
	public HelpAndContactPage(WebDriver driver) {
		this.driver= driver;
	}
	public void typequery(String query) {
		driver.findElement(searchbox).sendKeys(query);
	}
	public void querysuggest() {
		driver.findElement(querysuggestion).click();
	}
	public void selectquery() {
		driver.findElement(selectquery).click();
	}
	
}
