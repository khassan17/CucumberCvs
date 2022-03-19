package stepDefinitions;

import org.openqa.selenium.WebDriver;

import baseDriver.Base;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.SigninPage;

public class Steps {
	
	public WebDriver driver;
	public SigninPage Sp;
	
	@Given("User opens URL {string}")
	public void user_opens_url(String string){
		WebDriver driver = Base.getDriver();
		Sp=new SigninPage();
		driver.get("https://www.cvs.com/account/login/?icid=cvsheader:signin&screenname=%2F");
		driver.manage().window().maximize();
	}

	@When("User give Email  as {string}")
	 public void user_give_email_as(String string) {
		Sp.setUserName("Email");
	}

	@And("User click on sign in button")
	public void user_click_on_sign_in_button() {
	    Sp.clickSignin();
	}



	//@Then("User click on continue button")
	//public void user_click_on_continue_button() {
	   //Sp.clickContinue();
	//}

	@Then("User type password as {string}")
	public void user_type_password(String string) {
		Sp.setPassword("Password");
	}

	@Then("User click on continue button")
	public void user_click_on_continue_button()  {
	    Sp.clickContinue();
	}

	@Then("User click signout button")
	public void user_click_signout_button() throws InterruptedException {
	   Sp.clickSignout();
	   Thread.sleep(3000);
	   driver.quit();
	}
  
}
