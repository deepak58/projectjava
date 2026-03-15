package Pages;

import common.Utils;
import drivers.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import static common.Utils.getWait;

public class Dashboard {

    public Dashboard(){
        WebDriver driver = DriverManager.getDriver();
        PageFactory.initElements(driver,this);
    }

    By dash = By.xpath("//h1[contains(text(),'Dashboard')]");
    By companies = By.xpath("//a[contains(@href,'companies')]");
    By addcompany = By.xpath("//button[.//text()[contains(.,'Add Company')]]");
    By companyName = By.xpath("//input[contains(@placeholder,'TechCorp')]");
    By companySize = By.xpath("//button[.//span[text()='Select company size']]");
    By companyAddress = By.xpath("//input[@id='create-street']");
    By city = By.xpath("//input[@id='create-city']");
    By zipcode = By.xpath("//input[@id='create-zipcode']");
    By year = By.xpath("//input[@id='create-founded']");
    By description = By.xpath("//textarea[@id='create-description']");
    By addCompanyClick = By.xpath("//div[.//text()='Add New Company']//button[text()='Add Company']");
    By companyID = By.xpath("//div[contains(text(),'COMP')]");

    By jobs = By.xpath("//a[contains(@href,'jobs')]");
    By postJob = By.xpath("//button[.//text()[contains(.,'Post New Job')]]");
    By jobTitle = By.xpath("//input[contains(@placeholder,'Senior')]");
    By location = By.xpath("//input[contains(@placeholder,'cities')]");
    By selectCompany = By.xpath("//label[@for='company']/following::button[1]");
    By companyOptions = By.xpath("//div[text()='Stranger Things']");
    By jobType = By.xpath("//button[@id='type-trigger']");
    By workType = By.xpath("//button[@id='workType-trigger']");
    By minExp = By.xpath("//input[@id='experienceMin']");
    By maxExp = By.xpath("//input[@id='experienceMax']");
    By numOfOpenings = By.xpath("//input[@id='numberOfOpenings']");
    By hiringTime = By.xpath("//button[contains(@id,'estimatedDuration')]");
    By jobDescription = By.xpath("//textarea[@id='description']");
    By skills = By.xpath("//input[@id='skills']");
    By minSalary = By.xpath("//input[contains(@id,'salary-min')]");
    By maxSalary = By.xpath("//input[contains(@id,'salary-max')]");
    By foundedDateButton = By.xpath("//label[contains(text(),'Application Deadline ')]/following::button[1]");
    By monthHeader = By.xpath("//div[@aria-live='polite']");
    By nextMonth = By.xpath("//button[contains(@name,'next-month')]");
    By createJob = By.xpath("//button[text()='Create Job']");
    By jobID = By.xpath("//div[contains(text(),'JOB')]");

    public String verifyLogin() {

        getWait().until(ExpectedConditions.urlContains("dashboard"));

        WebElement mainNavigation = Utils.wait_for_element_locator_visible(dash);
        return mainNavigation.getText();
    }

    public void click_companies(){
        Utils.click_element_byLocator(companies);
    }
    public void click_add_company(){
        Utils.click_element_byLocator(addcompany);
    }
    public void send_company_name(String value){
        Utils.type_values_by_locator(value,companyName);
    }
    public void selectCompanySize(String size) {
        Utils.selectDropdown(companySize,size);
    }
    public void send_company_address(String value){
        Utils.type_values_by_locator(value,companyAddress);
    }
    public void send_city_name(String value){
        Utils.type_values_by_locator(value,city);
    }
    public void send_pin_code(String value){
        Utils.type_values_by_locator(value,zipcode);
    }
    public void send_year(String value){
        Utils.type_values_by_locator(value,year);
    }
    public void send_description(String value){
        Utils.type_values_by_locator(value,description);
    }
    public void click_create_company(){
        Utils.wait_for_element_locator_clickable(addCompanyClick).click();
    }
    public String getCompanyId() {
        WebElement id = Utils.wait_for_element_locator_visible(companyID);
        return id.getText();
    }
    /// ///////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public void click_jobs(){
        Utils.click_element_byLocator(jobs);
    }
    public void click_post_job(){
        Utils.click_element_byLocator(postJob);
    }
    public void send_job_title(String value){
        Utils.type_values_by_locator(value,jobTitle);
    }
    public void send_job_location(String value){
        Utils.type_values_by_locator(value,location);
    }
    public void select_company(String text){
        Utils.selectDropdownCreated(selectCompany,companyOptions,text);
    }
    public void select_job_type(String text){
        Utils.selectDropdown(jobType,text);
    }
    public void select_work_type(String text){
        Utils.selectDropdown(workType,text);
    }
    public void send_min_exp(String value){
        Utils.type_values_by_locator(value,minExp);
    }
    public void send_max_exp(String value){
        Utils.type_values_by_locator(value,maxExp);
    }
    public void send_num_openings(String value){
        Utils.type_values_by_locator(value,numOfOpenings);
    }
    public void select_hire_time(String value){
        Utils.selectDropdown(hiringTime,value);
    }
    public void send_job_description(String text){
        Utils.type_values_by_locator(text,jobDescription);
    }
    public void send_skills(String text){
        Utils.type_values_by_locator(text,skills);
    }
    public void send_min_salary(String value){
        Utils.type_values_by_locator(value,minSalary);
    }
    public void send_max_salary(String value){
        Utils.type_values_by_locator(value,maxSalary);
    }
    public void pickDate(String date){
        Utils.selectDate(foundedDateButton,monthHeader,nextMonth,date);
    }
    public void click_create_job(){
        Utils.click_element_byLocator(createJob);
    }
    public String getJobId() {
        WebElement id = Utils.wait_for_element_locator_visible(jobID);
        return id.getText();
    }
}
