package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SigninPage {
public WebDriver ldriver;

public void LoginPage(WebDriver rdriver) {
	    ldriver = rdriver;
	    PageFactory.initElements(rdriver, this);
	
}

@FindBy(xpath=" //input[@id='email']")
@CacheLookup
WebElement txtEmail;

@FindBy(xpath="//button[@id=\"main-content\"]/div/div/div/div[2]/button")
@CacheLookup
WebElement btnContinue;

@FindBy(id="Password")
@CacheLookup
WebElement txtPassword ;

@FindBy(xpath="//*[@id=\"main-content\"]/div/div[2]/div/div[5]/button")
@CacheLookup
WebElement btnSignin;

@FindBy(linkText="Signout")
@CacheLookup
WebElement lnkSignout;

public void setUserName(String Email) {
       txtEmail.clear();
       txtEmail.sendKeys(Email);
       
       }

public void  clickContinue() {
	btnContinue.click();
}

public void setPassword(String pwd) {
	txtPassword.clear();
	txtPassword.sendKeys(pwd);
}

public void clickSignin() {
	btnSignin.click();
}

public void clickSignout() {
	lnkSignout.click();
}

}











