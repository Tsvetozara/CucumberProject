package tests;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Search {
    @Given("User opens the Application")
    public void user_opens_the_application() {
        System.out.println(">> Application got opened");
    }

    @When("User enters valid product into Search field")
    public void user_enters_valid_product_into_search_field() {
        System.out.println(">> Valid product got entered into Search field");
    }

    @When("User clicks on Search button")
    public void user_clicks_on_search_button() {
        System.out.println(">> User clicked on Search button");
    }

    @Then("Valid Product should get displayed in the Search results")
    public void valid_product_should_get_displayed_in_the_search_results() {
        System.out.println(">> Valid product got displayed in Search results");
    }

    @When("User enters non-existing product into Search field")
    public void user_enters_non_existing_product_into_search_field() {
        System.out.println(">> Non-existing product got entered into Search results");
    }

    @Then("Proper text informing the User about no product matching should be displayed")
    public void proper_text_informing_the_user_about_no_product_matching_should_be_displayed() {
        System.out.println(">> No product matching message got displayed");
    }

    @When("User don't enter any product into Search field")
    public void user_don_t_enter_any_product_into_search_field() {
        System.out.println(">> No product got entered into Search field");
    }

}
