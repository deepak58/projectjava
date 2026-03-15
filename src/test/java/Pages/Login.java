package Pages;

import common.Utils;
import drivers.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class Login {

    public Login(){
        WebDriver driver = DriverManager.getDriver();
        PageFactory.initElements(driver,this);
    }

    //Login Page
    By email_L = By.id("identifier");
    By password_L = By.id("password");
    By eyePass_L = By.xpath("//label[text()='Password']/following-sibling::div/child::button//*[name()='svg' and contains(@class,'eye-off')]");
    By rememberMe_L = By.id("rememberMe");
    By login_L = By.xpath("//button[text()='Log In']");
    By errorMsg_L = By.xpath("//div[contains(text(),'Invalid credentials')]");
    By emailError_L = By.xpath("//p[contains(text(),'Email or phone number is required')]");
    By passwordError_L = By.xpath("//p[contains(text(),'Password is required')]");
    By forgotPass_L = By.partialLinkText("Forgot Password?");
    By hr_L = By.xpath("//button[text()='HR']");
    By jobSeeker_L = By.xpath("//button[text()='Job Seeker']");

    //Forgot Password Page
    By email_FP = By.id("email");
    By sendResetLink_FP = By.xpath("//button[text()='Send Register Link']");
    By backToSignIn_FP = By.xpath("//button[text()='Back to Sign In']");

    //HR Page
    By name_HR = By.id("name");
    By phoneNumber_HR = By.id("phone");
    By email_HR = By.id("email");
    By password_HR = By.id("password");
    By eyePass_HR = By.xpath("//label[text()='Password ']/following-sibling::div/child::button//*[name()='svg' and contains(@class,'eye-off')]");
    By confirmPass_HR = By.id("confirmPassword");
    By eyeConfirmPass_HR = By.xpath("//label[text()='Confirm Password ']/following-sibling::div/child::button//*[name()='svg' and contains(@class,'eye-off')]");
    By designation_HR = By.id("designation");
    By dropDown_HR = By.xpath("//button[.//span[text()='Select how you heard']]");
    By termsCheckbox_HR = By.id("terms");
    By createEmployerAccount_HR = By.xpath("//button[text()='Create Employer Account']");
    By termsOfServicesLink_HR = By.xpath("//a[text()='Terms of Service']");
    By privacyPolicyLink_HR = By.xpath("//a[text()='Privacy Policy']");
    By alreadyHaveAnAccountLogin_HR = By.xpath("//a[text()='Log in']");

    //Job Seeker Page
    By name_JS = By.id("name");
    By phoneNumber_JS = By.id("phone");
    By email_JS = By.id("email");
    By preferredJob_JS = By.id("preferredJob");
    By password_JS = By.id("password");
    By eyePass_JS = By.xpath("//label[text()='Password ']/following-sibling::div/child::button//*[name()='svg' and contains(@class,'eye-off')]");
    By confirmPass_JS = By.id("confirmPassword");
    By eyeConfirmPass_JS = By.xpath("//label[text()='Confirm Password ']/following-sibling::div/child::button//*[name()='svg' and contains(@class,'eye-off')]");
    By dropDown_JS = By.xpath("//button[.//span[text()='Select how you heard']]");
    By referralCode_JS = By.id("referralCode");
    By termsCheckbox_JS = By.id("terms");
    By termsOfServicesLink_JS = By.xpath("//a[text()='Terms of Service']");
    By privacyPolicyLink_JS = By.xpath("//a[text()='Privacy Policy']");
    By createJobSeekerAccount_JS = By.xpath("//button[text()='Create Job Seeker Account']");
    By alreadyHaveAnAccountLogin_JS = By.xpath("//a[text()='Log in']");

    //Login Page Methods
    public void sendEmail_Ph(String value){
        Utils.type_values_by_locator(value,email_L);
    }
    public void eyebtn(){
        Utils.click_element_byLocator(eyePass_L);
    }
    public void sendPassword(String value){
        Utils.type_values_by_locator(value,password_L);
    }
    public void rememberCheckBox(){
        Utils.click_element_byLocator(rememberMe_L);
    }
    public void login(){
        Utils.click_element_byLocator(login_L);
    }
    public String errorMessage(){
        WebElement element = Utils.wait_for_element_locator_visible(errorMsg_L);
        return element.getText();
    }
    public String email_error_display(){
        WebElement element = Utils.wait_for_element_locator_visible(emailError_L);
        return element.getText();
    }
    public String password_error_display(){
        WebElement element = Utils.wait_for_element_locator_visible(passwordError_L);
        return element.getText();
    }

    //Forgot Password Page Methods
    public void forgotPassLink(){
        Utils.click_element_byLocator(forgotPass_L);
    }
    public void sendEmail(String value){
        Utils.type_values_by_locator(value,email_FP);
    }
    public void sendResetLink(){
        Utils.click_element_byLocator(sendResetLink_FP);
    }
    public void backToSignIn(){
        Utils.click_element_byLocator(backToSignIn_FP);
    }

    //HR Page Methods
    public void hrBtn(){
        Utils.click_element_byLocator(hr_L);
    }
    public void name(String value){
        Utils.type_values_by_locator(value,name_HR);
    }
    public void phNum(String value){
        Utils.type_values_by_locator(value,phoneNumber_HR);
    }
    public void email(String value){
        Utils.type_values_by_locator(value,email_HR);
    }
    public void eyeBtn1(){
        Utils.click_element_byLocator(eyePass_HR);
    }
    public void createPassword(String value){
        Utils.type_values_by_locator(value,password_HR);
    }
    public void eyeBtn2(){
        Utils.click_element_byLocator(eyeConfirmPass_HR);
    }
    public void confirmPassword(String value){
        Utils.type_values_by_locator(value,confirmPass_HR);
    }
    public void designation(String value){
        Utils.type_values_by_locator(value,designation_HR);
    }
    //Drop Down Doubt?
    public void termsCheckBox(){
        Utils.click_element_byLocator(termsCheckbox_HR);
    }
    public void createAccount(){
        Utils.click_element_byLocator(createEmployerAccount_HR);
    }
    /// /////////////////////////////////////////////////////////////
    public void alreadyHaveAccount_Login(){
        Utils.click_element_byLocator(alreadyHaveAnAccountLogin_HR);
    }
    public void termsOfServices(){
        Utils.click_element_byLocator(termsOfServicesLink_HR);
    }
    public void privacyPolicy(){
        Utils.click_element_byLocator(privacyPolicyLink_HR);
    }

    //Job Seeker Page
    public void jobSeeker(){
        Utils.click_element_byLocator(jobSeeker_L);
    }
    public void nameForJS(String value){
        Utils.type_values_by_locator(value,name_JS);
    }
    public void phNumForjs(String value){
        Utils.type_values_by_locator(value,phoneNumber_JS);
    }
    public void emailForJS(String value){
        Utils.type_values_by_locator(value,email_JS);
    }
    public void preferredJob(String value){
        Utils.type_values_by_locator(value,preferredJob_JS);
    }
    public void eyeBtn1ForJS(){
        Utils.click_element_byLocator(eyePass_JS);
    }
    public void passwordForJS(String value){
        Utils.type_values_by_locator(value,password_JS);
    }
    public void eyeBtn2ForJS(){
        Utils.click_element_byLocator(eyeConfirmPass_JS);
    }
    public void confirmPassForJS(String value){
        Utils.type_values_by_locator(value,confirmPass_JS);
    }
    //Drop Down Doubt?
    public void referralCode(String value){
        Utils.type_values_by_locator(value,referralCode_JS);
    }
    public void termsCheckBoxForJS(){
        Utils.click_element_byLocator(termsCheckbox_JS);
    }
    public void createJobSeekerAccount(){
        Utils.click_element_byLocator(createJobSeekerAccount_JS);
    }
    /// ///////////////////////////////////////////////////////////
    public void termsOfServicesForJS(){
        Utils.click_element_byLocator(termsOfServicesLink_JS);
    }
    public void privacyPolicyLinkForJS(){
        Utils.click_element_byLocator(privacyPolicyLink_JS);
    }
    public void alreadyHaveAnAccountLoginForJS(){
        Utils.click_element_byLocator(alreadyHaveAnAccountLogin_JS);
    }
}
