package step_denifition;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import pages.DiageoWebApplicationLoginPage;
import utilities.PropertiesReader;
import utilities.driver;

public class DiageoLogin {
	
	DiageoWebApplicationLoginPage Diageolp = new DiageoWebApplicationLoginPage();
	
	// Diageo login page, log in with valid credentials
	@Given("User is on the log in page")
	public void user_is_on_the_log_in_page() {
	    driver.getDriver().get(PropertiesReader.getProperty("DiageoWebAppUrl"));
	   }
	
	@Given("The LOGIN button displays.")
	public void the_login_button_displays() {
	    Assert.assertTrue(Diageolp.Loginbtn.isDisplayed());
	}
	@When("User enter valid email address.")
	public void user_enter_valid_email_address() {
	    Diageolp.emailbox.sendKeys("pkwong@trutags.com");
	}
	@When("User enter valid password.")
	public void user_enter_valid_password() {
		Diageolp.password.sendKeys("ttdiageo");    
	}
	
	@When("User click on the LOGIN button")
	public void user_click_on_the_login_button() {
	    Diageolp.Loginbtn.click();
	}
	
	@Then("User should be directed to dashboard.")
	public void user_should_be_directed_to_dashboard() {
		Assert.assertTrue(Diageolp.dashboard.isDisplayed());
	    
	}
	
}
