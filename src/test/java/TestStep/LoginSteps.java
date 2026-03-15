package TestStep;

import Pages.Dashboard;
import Pages.Login;
import common.Utils;
import configs.ConfigReader;
import drivers.DriverFactory;
import drivers.DriverManager;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class LoginSteps {

    Login hireAccel = new Login();
    Dashboard hireAccelDash = new Dashboard();

    @Given("User navigate to login page")
    public void user_navigate_to_login_page() {
        DriverManager.getDriver().get(ConfigReader.getprop("url"));
    }
    @When("User click login with empty field")
    public void user_click_login_with_empty_field() {
        hireAccel.login();
    }
    @Then("User should see email error field in {string}")
    public void user_should_see_email_error_field_in(String emailError) {
        String emailDisplay = hireAccel.email_error_display();
        Assert.assertEquals(emailError,emailDisplay);
    }
    @Then("User should see password error field in {string}")
    public void user_should_see_password_error_field_in(String passError) {
        String passDisplay = hireAccel.password_error_display();
        Assert.assertEquals(passError,passDisplay);
    }
    @When("User enter email {string}")
    public void user_enter_email(String email) {
        hireAccel.sendEmail_Ph(email);
    }
    @When("User enter password {string}")
    public void user_enter_password(String pass) {
        hireAccel.sendPassword(pass);
    }
    @When("User click login")
    public void user_click_login() {
        hireAccel.login();
    }
    @Then("User should see {string}")
    public void user_should_see_(String result) {

        String actualResult;

        if(result.equals("Dashboard")) {
            actualResult = hireAccelDash.verifyLogin();
        }
        else {
            actualResult = hireAccel.errorMessage();
        }

        Assert.assertTrue(actualResult.contains(result));
    }
}
