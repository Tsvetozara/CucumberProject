package tests;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.Map;

public class Register {

    @Given("^User navigates to Register Account page$")
    public void user_navigates_to_register_account_page() {
        System.out.println(">> User got navigated to Register Account page");
    }

    @When("User enters below details into the fields")
    public void user_enters_below_details_into_the_fields(DataTable dataTable){
        Map<String, String> map = dataTable.asMap(String.class, String.class);
        System.out.println("User has entered the first name as "+map.get("firstname"));
        System.out.println("User has entered the last name as "+map.get("lastname"));
        System.out.println("User has entered the email address as "+map.get("email"));
        System.out.println("User has entered the telephone as "+map.get("telephone"));
        System.out.println("User has entered the password as "+map.get("password"));
    }

    @And("^User selects Privacy Policy Field$")
    public void user_selects_privacy_policy_field() {
        System.out.println(">> User has selected the Privacy Policy Field");
    }

    @And("^User clicks on Continue button$")
    public void user_clicks_on_continue_button() {
        System.out.println(">> User has clicked on Continue button");
    }

    @Then("^Account should get successfully created$")
    public void account_should_get_successfully_created() {
        System.out.println(">> User account got successfully created");
    }

    @And("^User selects Yes for Newsletter$")
    public void user_selects_yes_for_newsletter() {
        System.out.println(">> User has selected Yes for Newsletter");
    }

    @When("^User don't enter details into any fields$")
    public void user_don_t_enter_details_into_any_fields() {
        System.out.println(">> User has kept all the fields blank");
    }

    @Then("^Warning messages should be displayed for the mandatory fields$")
    public void warning_messages_should_be_displayed_for_the_mandatory_fields() {
        System.out.println(">> Warning messages for all the mandatory fields got displayed");
    }

    @Then("^Warning message informing the User about duplicate email address should be displayed$")
    public void warning_message_informing_the_user_about_duplicate_email_address_should_be_displayed() {
        System.out.println(">> Warning message informing the User about duplicate email address is displayed");
    }

}
