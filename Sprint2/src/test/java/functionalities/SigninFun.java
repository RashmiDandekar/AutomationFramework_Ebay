package functionalities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.HomePage;
import Pages.Register;
import Pages.SigninOrRegister;

public class SigninFun {

	public static void main(String[] args) throws InterruptedException 
	{
		System.out.println("\n--------------------Start--------------------");
    	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.ebay.com/");
		driver.manage().window().maximize();
		SigninOrRegister sr= new SigninOrRegister(driver);
		HomePage hp= new HomePage(driver);
		Register r = new Register(driver);
		hp.clicksignin();
		Thread.sleep(3000);
		sr.typeuseroremail("asdf@a.in");
		sr.clickcontiuebut();
		Thread.sleep(2000);
		sr.typepass("as1234");
		sr.clicksigninbut();
		hp.clickdropd();
		hp.clicksignout();
		
	}

}
