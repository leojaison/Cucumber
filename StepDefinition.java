package org.stepdefinition;

import java.util.List;

import org.base.BaseClass;
import org.junit.Assert;
import org.loginpojo.ForgottonPassPojo;
import org.loginpojo.LoginPojo;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition extends BaseClass {

//	@Given("User have to enter Facebook Login through Chrome browser")
//	public void user_have_to_enter_Facebook_Login_through_Chrome_browser() {
//		launchBrowser();
//		loadUrl("https://www.facebook.com/");
//		maxiBrowser();
//	}

	@When("User have to enter invalid username and Invalid password")
	public void user_have_to_enter_invalid_username_and_Invalid_password(io.cucumber.datatable.DataTable d) {
		List<String> alldata = d.asList();
		String email = alldata.get(0);
		String pass = alldata.get(1);

		LoginPojo l = new LoginPojo();

		fill(l.getTextEmail(), email);
		fill(l.getTextPass(), pass);

	}

	@When("User have to enter Invalid username and Invalid password")
	public void user_have_to_enter_Invalid_username_and_Invalid_password() {
		LoginPojo l = new LoginPojo();

		fill(l.getTextEmail(), "core");
		fill(l.getTextPass(), "core123");

	}

	@When("User have to enter valid username and Invalid password")
	public void user_have_to_enter_valid_username_and_Invalid_password() {

		LoginPojo l = new LoginPojo();

		fill(l.getTextEmail(), "maven");
		fill(l.getTextPass(), "maven123");

	}

	@When("User have to enter invalid username and valid password")
	public void user_have_to_enter_invalid_username_and_valid_password() {

		LoginPojo l = new LoginPojo();

		fill(l.getTextEmail(), "cucumber");
		fill(l.getTextPass(), "cucumber123");

	}

	@When("User Click the login button")
	public void user_Click_the_login_button() throws InterruptedException {

		LoginPojo l = new LoginPojo();
		btnClick(l.getBtnLogin());
		Thread.sleep(3000);

	}

	@Then("User should be in a invalid credentials Page")
	public void user_should_be_in_a_invalid_credentials_Page() {

		String currentUrl = driver.getCurrentUrl();
		Assert.assertTrue("To check the current url", currentUrl.contains("https://www.facebook.com/login/"));
	}

//	@Given("User have to enter facebook login through chrome browser")
//	public void user_have_to_enter_facebook_login_through_chrome_browser() {
//		launchBrowser();
//		loadUrl("https://www.facebook.com/");
//		maxiBrowser();

//	}

	@Given("User have to click the forgotten password")
	public void user_have_to_click_the_forgotten_password() throws InterruptedException {
		ForgottonPassPojo f = new ForgottonPassPojo();

		btnClick(f.getBtnFrgtPass());
		Thread.sleep(3000);

	}

	@When("User have to enter email or moblieNo")
	public void user_have_to_enter_email_or_moblieNo() {
		ForgottonPassPojo f = new ForgottonPassPojo();

		fill(f.getTextBox(), "8072930740254");

	}

	@Then("User have to click the search button")
	public void user_have_to_click_the_search_button() {
		ForgottonPassPojo f = new ForgottonPassPojo();

		btnClick(f.getBtnSearch());

	}

}
