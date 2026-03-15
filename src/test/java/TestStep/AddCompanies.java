package TestStep;

import Pages.Dashboard;
import Pages.Login;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class AddCompanies {

    Login hireAccel = new Login();
    Dashboard hireAccelDash = new Dashboard();

    @When("User enters email {string}")
    public void user_enters_email(String email) {
        hireAccel.sendEmail_Ph(email);
    }
    @When("User enters password {string}")
    public void user_enters_password(String pass) {
        hireAccel.sendPassword(pass);
    }
    @When("User clicks login")
    public void user_clicks_login() {
        hireAccel.login();
    }
    @When("User clicks companies tab")
    public void user_clicks_companies_tab() {
        hireAccelDash.click_companies();
    }
    @When("User clicks add company button")
    public void user_clicks_add_company_button() {
        hireAccelDash.click_add_company();
    }
    @When("User enters company name {string}")
    public void user_enters_company_name(String name) {
        hireAccelDash.send_company_name(name);
    }
    @When("User selects company size {string}")
    public void user_selects_company_size(String size) {
        hireAccelDash.selectCompanySize(size);
    }
    @When("User enters company address {string}")
    public void user_enters_company_address(String add) {
        hireAccelDash.send_company_address(add);
    }
    @When("User enters city name {string}")
    public void user_enters_city_name(String city) {
        hireAccelDash.send_city_name(city);
    }
    @When("User enters pin code {string}")
    public void user_enters_pin_code(String code) {
        hireAccelDash.send_pin_code(code);
    }
    @When("User enters founded year {string}")
    public void user_enters_founded_year(String year) {
        hireAccelDash.send_year(year);
    }
    @When("User enters company description {string}")
    public void user_enters_company_description(String descrip) {
        hireAccelDash.send_description(descrip);
    }
    @When("User clicks create company button")
    public void user_clicks_create_company_button() {
        hireAccelDash.click_create_company();
    }
    @Then("User should see created company id")
    public void user_should_see_created_company_id() {
        String companyId = hireAccelDash.getCompanyId();
        System.out.println("Company ID is: " + companyId);
        Assert.assertTrue(companyId.startsWith("COMP"));
    }
}
