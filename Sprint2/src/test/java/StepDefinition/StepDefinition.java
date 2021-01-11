package StepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.AddToCart;
import Pages.Bottle;
import Pages.Buypage;
import Pages.DailyDealsPage;
import Pages.HelpAndContactPage;
import Pages.HomePage;
import Pages.ListAnItempage;
import Pages.ProductPageDD;
import Pages.Register;
import Pages.Sellpage;
import Pages.Sellyouritempage;
import Pages.ShoesShow;
import Pages.SigninOrRegister;
import Pages.women;
import cucumber.api.java.After;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class StepDefinition 
{
	WebDriver driver;
	HomePage hp;
	Register r;
	SigninOrRegister sr;
	women w;
	HelpAndContactPage hc;
	DailyDealsPage dp;
	ProductPageDD pp;
	Sellpage sp;    
	ListAnItempage  laip; 
	Sellyouritempage syip;
	Buypage by;
	ShoesShow ss;
	Bottle bt;
	AddToCart ac;
	
	@Given("^user should be on homepage of eBay website$")
	public void user_should_be_on_homepage_of_eBay_website() throws Throwable {
		System.out.println("\n--------------------Start--------------------");
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("https://www.ebay.com/");
		driver.manage().window().maximize();
    }

    @When("^Buy option is available$")
    public void buy_option_is_available() throws Throwable {
        hp= new HomePage(driver);
        Assert.assertEquals(hp.btext, hp.getbtext());
    }

    @When("^User clicks on Buy option$")
    public void user_clicks_on_buy_option() throws Throwable {
    	 hp= new HomePage(driver);
    	 hp.clickbuy();
    }
    
    @When("^Check dailydeals option is available$")
    public void check_dailydeals_option_is_available() throws Throwable {
        hp = new HomePage(driver);
        Assert.assertEquals(hp.getdtext(), hp.dtext);
    }

    @When("^User clicks on Daily Deals option$")
    public void user_clicks_on_daily_deals_option() throws Throwable {
        hp = new HomePage(driver);
        hp.clickdailyd();
    }

    @When("^Help & Contact is available$")
    public void help_contact_is_available() throws Throwable {
        hp= new HomePage(driver);
        Assert.assertEquals(hp.htext, hp.gethtext());
    }

    @When("^user clicks on Help & Contact$")
    public void user_clicks_on_help_contact() throws Throwable {
        hp= new HomePage(driver);
        hp.clickhelpcontact();
    }

    @When("^Sell option is available$")
    public void sell_option_is_available() throws Throwable {
        hp= new HomePage(driver);
        Assert.assertEquals(hp.stext, hp.getstext());
    }

    @When("^user click list an item$")
    public void user_click_list_an_item() throws Throwable {
    	sp= new Sellpage(driver);
    	sp.list_an_item();
    }

    @When("^user clicks Sign in$")
    public void user_clicks_sign_in() throws Throwable {
    	hp= new HomePage(driver);
    	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		hp.clicksignin();
    }

    @When("^enter valid email or username$")
    public void enter_valid_email_or_username() throws Throwable {
    	sr= new SigninOrRegister(driver);
    	sr.typeuseroremail("raj.r@g.in");
    }

    @When("^user enters (.+)$")
    public void user_enters(String emailorusername) throws Throwable {
    	sr= new SigninOrRegister(driver);
    	sr.typeuseroremail(emailorusername);
    }

    @When("^user clicks create an account$")
    public void user_clicks_create_an_account() throws Throwable {
        sr = new SigninOrRegister(driver);
        sr.clickcreatenew();
    }

    @Then("^print the text of Buy option$")
    public void print_the_text_of_buy_option() throws Throwable {
        hp= new HomePage(driver);
    	System.out.println(hp.getbtext());
    }

    @Then("^Select the Category for Buy option$")
    public void select_the_category_for_buy_option() throws Throwable {
    	by=new Buypage(driver);
    	by.clickshop();
    }

    @Then("^user (.+) in search box in Buy option$")
    public void user_in_search_box_in_buy_option(String typeproduct) throws Throwable {
    	by=new Buypage(driver);
    	by.buysearchBox(typeproduct);
    }

    @Then("^user clicks continue with google option$")
    public void user_clicks_continue_with_google_option() throws Throwable {
    	sr = new SigninOrRegister(driver);
    	sr.clickcontinuewithg();
    }

    @Then("^print the text of Daily Deals option$")
    public void print_the_text_of_daily_deals_option() throws Throwable {
        hp= new HomePage(driver);
    	System.out.println(hp.getdtext());
    }

    @Then("^Select the Category for Daily Deals option$")
    public void select_the_category_for_daily_deals_option() throws Throwable {
    	dp=new DailyDealsPage(driver);
    	dp.ShopByCatDD();
    }

    @Then("^print the text of Help and contact option$")
    public void print_the_text_of_help_and_contact_option() throws Throwable {
    	hp= new HomePage(driver);
    	System.out.println(hp.gethtext());
    }

    @Then("^print the text of sell option$")
    public void print_the_text_of_sell_option() throws Throwable {
    	hp= new HomePage(driver);
    	System.out.println(hp.getstext());
    }

    @Then("^click go$")
    public void click_go() throws Throwable {
    	laip=new ListAnItempage(driver);
    	laip.clickgo();
    }

    @Then("^user clicks Switch account$")
    public void user_clicks_switch_account() throws Throwable {
        sr= new SigninOrRegister(driver);
        sr.clickswitchacc();
    }

    @Then("^click continue$")
    public void click_continue() throws Throwable {
    	sr= new SigninOrRegister(driver);
    	sr.clickcontiuebut();
    }

    @Then("^click create account$")
    public void click_create_account() throws Throwable {
        r= new Register(driver);
        r.click_createaccbut();
    }

    @Then("^click the password textbox$")
    public void click_the_password_textbox() throws Throwable {
        r= new Register(driver);
        r.clickPass();
    }

    @And("^Select the product for Buy option$")
    public void select_the_product_for_buy_option() throws Throwable {
    	by=new Buypage(driver);
    	by.clickwomen();
    }

    @And("^Choose and select the product to buy$")
    public void choose_and_select_the_product_to_buy() throws Throwable {
    	ss=new ShoesShow(driver);
    	ac=new AddToCart(driver);
    	bt=new Bottle(driver);
    	if(driver.getTitle()=="Reebok | eBay")
    		ss.clickshoe();
    	else if(driver.getTitle()=="Bottle | eBay")
    		bt.clickBottle();
		ac.AddCart();
    }

    @And("^Add to cart$")
    public void add_to_cart() throws Throwable {
    	pp=new ProductPageDD(driver);
    	pp.AddcartprodDD();
    }

    @And("^click on search Buy option$")
    public void click_on_search_buy_option() throws Throwable {
    	by=new Buypage(driver);
    	by.clicksearchbuy();
    }

    @And("^sign in or register page will open$")
    public void sign_in_or_register_page_will_open() throws Throwable {
        sr = new SigninOrRegister(driver);
    	Assert.assertEquals(sr.tit, sr.getTit());
    }

    @And("^Select first product for Dailydeals$")
    public void select_first_product_for_dailydeals() throws Throwable {
    	dp=new DailyDealsPage(driver);
    	dp.SelproductDD();
    }

    @Then("^type the query in search box$")
    public void type_the_query_in_search_box() throws Throwable {
    	hc= new HelpAndContactPage(driver);
    	hc.typequery("discount");
    }

    @And("^select the query from list$")
    public void select_the_query_from_list() throws Throwable {
    	hc= new HelpAndContactPage(driver);
    	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    	hc.querysuggest();
    }

    @Then("^click the query$")
    public void click_the_query() throws Throwable {
    	hc= new HelpAndContactPage(driver);
    	hc.selectquery();
    }

    @And("^user (.+) in Sell search box$")
    public void user_in_sell_search_box(String typeproduct) throws Throwable {
    	laip=new ListAnItempage(driver);
    	laip.typeitem(typeproduct);
    }

    @And("^click on sell one like this$")
    public void click_on_sell_one_like_this() throws Throwable {
    	syip=new Sellyouritempage(driver);
    	syip.sellonelikethis();
    }

    @And("^verify warning message for email or username$")
    public void verify_warning_message_for_email_or_username() throws Throwable {
    	sr= new SigninOrRegister(driver);
    	Assert.assertEquals(sr.Wmgs, sr.getwmsg());
    }

    @And("^enter the valid password $")
    public void enter_the_valid_password() throws Throwable {
        sr= new SigninOrRegister(driver);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        sr.typepass("raj1234");
    }

    @And("^click sign in button$")
    public void click_sign_in_button() throws Throwable {
        sr= new SigninOrRegister(driver);
        sr.clicksigninbut();
    }

    @And("^user clicks sign out$")
    public void user_clicks_sign_out() throws Throwable {
       hp= new HomePage(driver);
       hp.clickdropd();
       hp.clicksignout();
    }

    @And("^verify warning message for password$")
    public void verify_warning_message_for_password() throws Throwable {
        sr= new SigninOrRegister(driver);
        Assert.assertEquals(sr.Wmgspass, sr.getpassmsg());
    }

    @And("^enters valid firstname$")
    public void enters_valid_firstname() throws Throwable {
        r= new Register(driver);
        r.typefname("john");
    }

    @And("^enters valid lastname$")
    public void enters_valid_lastname() throws Throwable {
    	r= new Register(driver);
        r.typelname("cena");
    }

    @And("^enters valid Email$")
    public void enters_valid_email() throws Throwable {
    	r= new Register(driver);
    	r.typeemail("john@asdf.com");
    }

    @And("^enters valid password for creating account$")
    public void enters_valid_password_for_creating_account() throws Throwable {
    	r= new Register(driver);
    	r.typepass("joHnG@123");
    }

    @And("^user enter invalid (.+)$")
    public void user_enter_invalid(String email) throws Throwable {
    	r= new Register(driver);
    	r.typeemail(email);
    }

    @And("^print the error message for email$")
    public void print_the_error_message_for_email() throws Throwable {
    	r= new Register(driver);
    	System.out.println(r.getwarnemail());
    }
    @And("^enter (.+)$")
    public void enter(String password) throws Throwable {
    	sr= new SigninOrRegister(driver);
    	sr.typepass(password);
    }
    @And("^Print the title$")
    public void print_the_title() throws Throwable {
        System.out.println(driver.getTitle());
    }
    @After
    public void teardown()
    {
    	driver.quit();
    }
}
