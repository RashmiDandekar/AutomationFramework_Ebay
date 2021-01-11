package functionalities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.DailyDealsPage;
import Pages.HomePage;
import Pages.ProductPageDD;

public class DailydealsFun {
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver;
		System.out.println("\n--------------------Start--------------------");
    	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("https://www.ebay.com/");
		driver.manage().window().maximize();
		HomePage hp =new HomePage(driver);
		DailyDealsPage dd=new DailyDealsPage(driver);
		ProductPageDD ppdd=new ProductPageDD(driver);
		hp.clickdailyd();
		System.out.println("DailyDeals Page has invoked");
		dd.ShopByCatDD();
		Thread.sleep(3000);
		dd.SelproductDD();
		System.out.println("Selected the product from Dailydeals");
		ppdd.AddcartprodDD();
		System.out.println("Selected Product is added to Add to cart Successfully");
		driver.close();
		
		
		
		
	}
	

}
