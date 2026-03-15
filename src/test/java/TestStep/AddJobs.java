package TestStep;

import Pages.Dashboard;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class AddJobs {

    Dashboard hireAccelDash = new Dashboard();

    @When("User clicks jobs tab")
    public void user_clicks_jobs_tab() {
        hireAccelDash.click_jobs();
    }
    @When("User clicks post new job")
    public void user_clicks_post_new_job() {
        hireAccelDash.click_post_job();
    }
    @When("User enters job title {string}")
    public void user_enters_job_title(String title) {
        hireAccelDash.send_job_title(title);
    }
    @When("User enters location {string}")
    public void user_enters_location(String loc) {
        hireAccelDash.send_job_location(loc);
    }
    @When("User selects company {string}")
    public void user_selects_company(String name) {
        hireAccelDash.select_company(name);
    }
    @When("User selects job type {string}")
    public void user_selects_job_type(String type) {
        hireAccelDash.select_job_type(type);
    }
    @When("User selects work type {string}")
    public void user_selects_work_type(String type) {
        hireAccelDash.select_work_type(type);
    }
    @When("User enters min exp {string}")
    public void user_enters_min_exp(String exp) {
        hireAccelDash.send_min_exp(exp);
    }
    @When("User enters max exp {string}")
    public void user_enters_max_exp(String exp) {
        hireAccelDash.send_max_exp(exp);
    }
    @When("User enters num of openings {string}")
    public void user_enters_num_of_openings(String open) {
        hireAccelDash.send_num_openings(open);
    }
    @When("User selects hiring time {string}")
    public void user_selects_hiring_time(String text) {
        hireAccelDash.select_hire_time(text);
    }
    @When("User enters job description {string}")
    public void user_enters_job_description(String text) {
        hireAccelDash.send_job_description(text);
    }
    @When("User enters skills {string}")
    public void user_enters_skills(String text) {
        hireAccelDash.send_skills(text);
    }
    @When("User enters min salary {string}")
    public void user_enters_min_salary(String value) {
        hireAccelDash.send_min_salary(value);
    }
    @When("User enters max salary {string}")
    public void user_enters_max_salary(String value) {
        hireAccelDash.send_max_salary(value);
    }
    @When("User selects date {string}")
    public void user_selects_date(String date) {
        hireAccelDash.pickDate(date);
    }
    @When("User clicks create job")
    public void user_clicks_create_job() {
        hireAccelDash.click_create_job();
    }
    @Then("User should see created job id")
    public void user_should_see_created_job_id() {
        String jobId = hireAccelDash.getJobId();
        System.out.println("Job ID is: " + jobId);
        Assert.assertTrue(jobId.startsWith("JOB"));
    }
}
