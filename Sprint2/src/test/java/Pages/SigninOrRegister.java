package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SigninOrRegister 
{
 private By switchacc = By.id("switch-account-anchor");
 private By createnew = By.id("create-account-link");
 private By continuewithg = By.id("signin_ggl_btn");
 private By useroremail = By.id("userid");
 private By contiuebut = By.id("signin-continue-btn");
 private By pass= By.id("pass");
 private By signinbut= By.id("sgnBt");
 public String tit= "Sign in or Register | eBay";
 public String Wmgs= "Oops, that's not a match.";
 private By WmgsLoc= By.id("signin-error-msg");
 public String Wmgspass= "Oops, that's not a match.";
 private By WmgspassLoc= By.id("signin-error-msg");
 
 WebDriver driver;
 public String getpassmsg()
 {
	 return driver.findElement(WmgspassLoc).getText();
 }
 public String getwmsg()
 {
	 return driver.findElement(WmgsLoc).getText();
 }
 public String getTit()
 {
	 return driver.getTitle();
 }
 public SigninOrRegister(WebDriver driver)
 {
	 this.driver= driver;
 }
 public void clickswitchacc()
 {
	 driver.findElement(switchacc).click();
 }
 public void clickcreatenew()
 {
	 driver.findElement(createnew).click();
 }
 public void clickcontinuewithg()
 {
	 driver.findElement(continuewithg).click();
 }
 public void clickcontiuebut()
 {
	 driver.findElement(contiuebut).click();
 }
 public void clicksigninbut()
 {
	 driver.findElement(signinbut).click();
 }
 
 public void typeuseroremail(String str)
 {
	 driver.findElement(useroremail).sendKeys(str);
 }
 public void typepass(String str)
 {
	 driver.findElement(pass).sendKeys(str);
 }
}
