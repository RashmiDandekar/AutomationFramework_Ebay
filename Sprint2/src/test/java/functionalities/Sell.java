package functionalities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.HomePage;
import Pages.ListAnItempage;
import Pages.Sellpage;
import Pages.Sellyouritempage;

public class Sell {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://ebay.com/");
		HomePage hp= new HomePage(driver);
		Sellpage sp= new Sellpage(driver);
		ListAnItempage laip=new ListAnItempage(driver);
		Sellyouritempage syip=new Sellyouritempage(driver);
		hp.clicksell();
		sp.list_an_item();
		laip.typeitem("laptop");
		Thread.sleep(3000);
		laip.clickgo();
		syip.pop();
		syip.sellonelikethis();
		Thread.sleep(3000);
		driver.close();
	}

}
