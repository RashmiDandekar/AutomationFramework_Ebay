package functionalities;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.AddToCart;
import Pages.Bottle;
import Pages.Buypage;
import Pages.HomePage;
import Pages.ShoesShow;
import Pages.women;

public class BuyFun {
	public static void main (String[]args) throws InterruptedException {
		/*System.out.println("\n--------------------Start--------------------");
    	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.ebay.com/");
		driver.manage().window().maximize();
		
		Buypage by=new Buypage(driver);
		HomePage hp=new HomePage(driver);
		//women wn=new women(driver);
		AddToCart ac=new AddToCart(driver);
		ShoesShow ss=new ShoesShow(driver);
		Bottle bt=new Bottle(driver);
		
		//hp.clickbuy();
		//by.clickshop();
		//by.clickwomen();
		//driver.close();*/
		
		
		System.out.println("\n--------------------Start--------------------");
    	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
    	WebDriver driver = new ChromeDriver();
		driver.get("https://www.ebay.com/");
		driver.manage().window().maximize();
		Buypage by=new Buypage(driver);
		HomePage hp=new HomePage(driver);
		ShoesShow ss=new ShoesShow(driver);
		Bottle bt=new Bottle(driver);
		AddToCart ac=new AddToCart(driver);
		hp.clickbuy();
		
	    by.buysearchBox("Reebok");
		by.clicksearchbuy();
		Thread.sleep(200);
		ss.clickshoe();
		ac.AddCart();
		
		/*by.buysearchBox("Bottle");
		by.clicksearchbuy();
		Thread.sleep(200);
		bt.clickBottle();
		ac.AddCart();*/
		
}
}