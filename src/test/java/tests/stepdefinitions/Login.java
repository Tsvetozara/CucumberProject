package tests.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login {

    @Given("^User navigates to Login page$")
    public void user_navigates_to_login_page() {

        System.out.println(">> User got navigated to Login page");
    }

    @When("^User enters a valid email address (.+)$")
    public void user_enters_a_valid_email_address(String email) {
        System.out.println(">> User enters a valid email address: " + email);
    }

    @And("^Enters a valid password (.+)$")
    public void enters_a_valid_password(String password) {
        System.out.println(">> User enters a valid password: " + password);
    }

    @And("^Clicks on Login button$")
    public void clicks_on_login_button() {
        System.out.println(">> User clicks on Login button");
    }

    @Then("^User should login successfully$")
    public void user_should_login_successfully() {
        System.out.println(">> User got logged in successfully");
    }

    @When("^User enters an invalid email address \"(.+)\"$")
    public void user_enters_an_invalid_email_address(String invalidEmailAddress) {
        System.out.println(">> User has entered an invalid email address: " + invalidEmailAddress);
    }

    @And("^Enters an invalid password \"(.+)\"$")
    public void enters_an_invalid_password(String invalidPassword) {
        System.out.println(">> User has entered an invalid password: " + invalidPassword);
    }

    @Then("^User should get a proper warning message$")
    public void user_should_get_a_proper_warning_message() {
        System.out.println(">> User got a proper warning message");
    }

    @When("^User don't enter any credentials$")
    public void user_dont_enter_any_credentials() {
        System.out.println(">> User has not entered any credentials");
    }
}
