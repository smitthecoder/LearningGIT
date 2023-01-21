package stepDefinitionFiles;

import org.junit.runner.RunWith;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
public class StepDefinition {
	
	@Given("^User is on the landing page$")
	public void user_is_on_the_landing_page() throws Throwable {
		//Code to navigate the user to the net banking login page
		System.out.println("\nUser is on the landing page");
	}
	
	@When("^user enters username \"([^\"]*)\" and password \"([^\"]*)\"$")
	public void user_enters_username_and_password(String username, String password) throws Throwable {
		System.out.println("The user entered the username : "+ username);
		System.out.println("The user entered the password : "+ password);
	}
	
	@Then("^Home page is displayed$")
	public void home_page_is_displayed() throws Throwable {
		System.out.println("The home page is displayed!");
	}
	
	@And("^status is \"([^\"]*)\"$")
	public void status_Is_True(String status) {
		System.out.println("Status is " + status);
		System.out.println("Status is successfully displayed");
	}
}
