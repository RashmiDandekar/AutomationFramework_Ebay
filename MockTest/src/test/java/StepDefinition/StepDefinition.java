package StepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import PageObjects.Msg;
import PageObjects.Recipe;
import cucumber.api.java.After;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class StepDefinition 
{
	WebDriver driver;
	Msg m;
	Recipe r;
	
	@Given("^user loads the browser and user open the webpage$")
    public void user_loads_the_browser() throws Throwable {
		System.out.println("\n--------------------Start--------------------");
    	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("file:///C:/Users/SONY/eclipse-workspace/MockTest/HtmlPages/Recipe_class_registration.html");
    }

    @When("^verify title$")
    public void verify_title() throws Throwable {
        r= new Recipe(driver);
        Assert.assertEquals("Online Cooking Class Enquiry Form", r.title());
    }

    @When("^user give null first name$")
    public void user_give_null_first_name() throws Throwable {
       r= new Recipe(driver);
       r.firstName("");
    }

    @Then("^user clicks first name$")
    public void user_clicks_first_name() throws Throwable {
        r= new Recipe(driver);
        r.firstClick();
    }

    @Then("^user enters last name$")
    public void user_enters_last_name() throws Throwable {
        r= new Recipe(driver);
        r.Lastname("cena");
    }

    @When("^enter mobile no as characters$")
    public void enter_mobile_no_as_characters() throws Throwable {
    	 r= new Recipe(driver);
    	 r.Mobile("ajfkjfd");
    }

    @When("^user enter wrong mobile no$")
    public void user_enter_wrong_mobile_no() throws Throwable {
    	r= new Recipe(driver);
    	r.Mobile("12468");
    }

    @And("^user select Category as NonVeg$")
    public void user_select_category_as_nonveg() throws Throwable {
    	r= new Recipe(driver);
    	r.Category();
    }

    @And("^Click on Enquire Now!$")
    public void click_on_enquire_now() throws Throwable {
    	r= new Recipe(driver);
    	r.Ennow();
    }

    @Then("^Click on the hyperlink$")
    public void click_on_the_hyperlink() throws Throwable {
        r= new Recipe(driver);
        r.DownLoad();
    }

    @When("^user enters first name$")
    public void user_enters_first_name() throws Throwable {
        r= new Recipe(driver);
        r.firstName("John");
    }

    @Then("^clicks on category$")
    public void clicks_on_category() throws Throwable {
    	r= new Recipe(driver);
    	r.Categoryclick();
    }

    @And("^Write meaningful sentence “Your Enquiry”$")
    public void write_meaningful_sentence_your_enquiry() throws Throwable {
    	r= new Recipe(driver);
    	r.Enquiry("Your Enquiry");
    }

    @And("^verify the text$")
    public void verify_the_text() throws Throwable {
    	r= new Recipe(driver);
    	Assert.assertEquals(r.confmsg, r.confget());
    }

    @And("^Print the title in console$")
    public void print_the_title_in_console() throws Throwable {
       System.out.println(driver.getTitle());
    }

    @And("^Verify the text “Recipe class Brochure is sent to your registered mail id”$")
    public void verify_the_text_recipe_class_brochure_is_sent_to_your_registered_mail_id() throws Throwable {
        m= new Msg(driver);
        Assert.assertEquals(m.msg, m.gett());
    }

    @And("^Go back to the previous page$")
    public void go_back_to_the_previous_page() throws Throwable {
        m= new Msg(driver);
        m.goback();
    }

    @And("^user clicks last name$")
    public void user_clicks_last_name() throws Throwable {
        r=new Recipe(driver);
        r.Lastclick();
    }

    @And("^Print the Alert message on console$")
    public void print_the_alert_message_on_console() throws Throwable {
    	System.out.println(driver.switchTo().alert().getText());
    }

    @And("^Handle the Alert$")
    public void handle_the_alert() throws Throwable {
        driver.switchTo().alert().accept();
    }

    @And("^alert box pops$")
    public void alert_box_pops() throws Throwable {
       driver.switchTo().alert();
    }

    @And("^enters valid email$")
    public void enters_valid_email() throws Throwable {
        r= new Recipe(driver);
        r.Email("john@g.com");
    }

    @And("^user enters correct mobile no$")
    public void user_enters_correct_mobile_no() throws Throwable {
    	r= new Recipe(driver);
    	r.Mobile("9000000000");
    }

    @And("^city preference as “Mumbai”$")
    public void city_preference_as_mumbai() throws Throwable {
    	r= new Recipe(driver);
    	r.City();
    }

    @And("^Select mode of learning$")
    public void select_mode_of_learning_as_something() throws Throwable {
    	r= new Recipe(driver);
    	r.Mode();
    }

    @And("^Select interested course duration as “6 months”$")
    public void select_interested_course_duration_as_6_months() throws Throwable {
    	r= new Recipe(driver);
    	r.Course();
    }

    @And("^verfy alert msg$")
    public void verfy_alert_msg() throws Throwable {
    	r= new Recipe(driver);
    	Assert.assertEquals(r.altmsg, driver.switchTo().alert().getText());
    }

    
    @After
    public void TearDown()
    {
    	System.out.println("------------------------End-------------------------");
    	 driver.close();
    }
}
