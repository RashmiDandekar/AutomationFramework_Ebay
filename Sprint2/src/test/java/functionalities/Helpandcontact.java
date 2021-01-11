package functionalities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.HelpAndContactPage;
import Pages.HomePage;

public class Helpandcontact {
	
	public static void main (String[] args)
	{
		System.out.println("\n--------------------Start--------------------");
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.ebay.com/");
	driver.manage().window().maximize();
	HomePage hp =new HomePage(driver);
	HelpAndContactPage hc= new HelpAndContactPage(driver);
	hp.clickhelpcontact();
	hc.typequery("discount");
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	hc.querysuggest();
	//hc.selectquery();
	System.out.println(driver.getTitle());
	driver.close();
	}
}
