package tests;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Register {

    @Given("User navigates to Register Account page")
    public void user_navigates_to_register_account_page() {
        System.out.println(">> User got navigated to Register Account page");
    }

    @When("User enters first name {string} into the First Name field")
    public void user_enters_first_name_into_the_first_name_field(String firstNameText) {
        System.out.println(">> User entered firstname: " + firstNameText + " into the First Name field");
    }

    @And("User enters lastname {string} into the Last Name field")
    public void user_enters_lastname_into_the_last_name_field(String lastNameText) {
        System.out.println(">> User has entered lastname: " + lastNameText + " into the Last Name field");
    }

    @And("User enters email address {string} into the Email address field")
    public void user_enters_email_address_into_the_email_address_field(String emailText) {
        System.out.println(">> User has entered email: " + emailText + " into the Email address field");
    }

    @And("User enters telephone {string} into the Telephone field")
    public void user_enters_telephone_into_the_telephone_field(String telephoneText) {
        System.out.println(">> User has entered telephone: " + telephoneText + " into the Telephone field");
    }

    @And("User enters password {string} into the Password field")
    public void user_enters_password_into_the_password_field(String passwordText) {
        System.out.println(">> User has entered Password: " + passwordText + " into the Password field");
    }

    @And("User enters password {string} into the Password Confirm field")
    public void user_enters_password_into_the_password_confirm_field(String passwordText) {
        System.out.println(">> User has entered Password: " + passwordText + " into the Password field");
    }

    @And("User selects Privacy Policy Field")
    public void user_selects_privacy_policy_field() {
        System.out.println(">> User has selected the Privacy Policy Field");
    }

    @And("User clicks on Continue button")
    public void user_clicks_on_continue_button() {
        System.out.println(">> User has clicked on Continue button");
    }

    @Then("Account should get successfully created")
    public void account_should_get_successfully_created() {
        System.out.println(">> User account got successfully created");
    }

    @And("User selects Yes for Newsletter")
    public void user_selects_yes_for_newsletter() {
        System.out.println(">> User has selected Yes for Newsletter");
    }

    @When("User don't enter details into any fields")
    public void user_don_t_enter_details_into_any_fields() {
        System.out.println(">> User has kept all the fields blank");
    }

    @Then("Warning messages should be displayed for the mandatory fields")
    public void warning_messages_should_be_displayed_for_the_mandatory_fields() {
        System.out.println(">> Warning messages for all the mandatory fields got displayed");
    }

    @Then("Warning message informing the User about duplicate email address should be displayed")
    public void warning_message_informing_the_user_about_duplicate_email_address_should_be_displayed() {
        System.out.println(">> Warning message informing the User about duplicate email address is displayed");
    }

}
