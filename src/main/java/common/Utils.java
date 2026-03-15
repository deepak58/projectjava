package common;

import drivers.DriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.util.List;
import java.util.Locale;

public class Utils {

    public static WebDriverWait getWait(){
        return new WebDriverWait(DriverManager.getDriver(),Duration.ofSeconds(20));
    }
    public static void windowMax() {
        DriverManager.getDriver().manage().window().maximize();
    }

    public static WebElement wait_for_element_locator_visible(By locator){
        return getWait().until(ExpectedConditions.visibilityOfElementLocated(locator));
    }
    public static List<WebElement> wait_for_elements_locator_visibility(By locator) {
        return getWait().until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locator));
    }
    public static WebElement wait_for_element_locator_clickable(By locator){
        return getWait().until(ExpectedConditions.elementToBeClickable(locator));
    }

    public static void type_values_by_locator(String value,By locator){
        WebElement element = wait_for_element_locator_clickable(locator);

        element.click();
        element.clear();
        element.sendKeys(value);
    }
    public static void type_values_byLocator_Enter(String value,By locator) {
        wait_for_element_locator_visible(locator).sendKeys(value, Keys.ENTER);
    }
    public static void selectDropdownCreated(By dropdownLocator, By optionsLocator, String text){

        jsClick(dropdownLocator);

        List<WebElement> options = wait_for_elements_locator_visibility(optionsLocator);

        for(WebElement option : options){

            try{
                if(option.getText().trim().equalsIgnoreCase(text)){
                    option.click();
                    break;
                }
            }catch(StaleElementReferenceException e){
                System.out.println("Retrying due to stale element...");
            }
        }
    }

    public static void click_element_byLocator(By locator){
        try{
            wait_for_element_locator_clickable(locator).click();
        }
        catch(StaleElementReferenceException e){
            wait_for_element_locator_clickable(locator).click();
        }
    }
    public static void jsClick(By locator){

        WebElement element = wait_for_element_locator_visible(locator);

        JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver();
        js.executeScript("arguments[0].scrollIntoView(true);", element);
        js.executeScript("arguments[0].click();", element);
    }

    public static void selectDropdown(By dropdownLocator, String optionText){

        Utils.jsClick(dropdownLocator);

        By optionLocator = By.xpath("//*[normalize-space()='" + optionText.trim() + "']");

        Utils.click_element_byLocator(optionLocator);
    }
    public static void selectDate(By calendarButton, By monthHeader, By nextMonthButton, String dateString) {

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate date = LocalDate.parse(dateString, formatter);
        String expectedMonthYear = date.getMonth()
                .getDisplayName(TextStyle.FULL, Locale.ENGLISH)
                + " " + date.getYear();
        String day = String.valueOf(date.getDayOfMonth());
        // open calendar
        wait_for_element_locator_clickable(calendarButton).click();
        // navigate to correct month
        while (true) {
            String currentMonthYear = wait_for_element_locator_visible(monthHeader).getText();
            if (currentMonthYear.equals(expectedMonthYear)) {
                break;
            }
            wait_for_element_locator_clickable(nextMonthButton).click();
        }
        // click day
        By dayLocator = By.xpath("//button[normalize-space()='" + day + "']");
        wait_for_element_locator_clickable(dayLocator).click();
    }

    //locator = identifing element
    // how locator use = id, class, css-selector, xpath, name, link-text, partial-link-text, tag name

    // xpath axes - advance xpath
    // parent , child
    // ancestors, descendant
    // siblings
    // up = preceding
    // down = following


//    public static void setImplisitTime(long time) {
//        DriverManager.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
//    }
//    public static void lanchUrl(String Url) {
//        DriverManager.getDriver().get(Url);
//    }
//
//    public static void quitBrowser() {
//        DriverManager.getDriver().quit();
//    }
//
//    public static void typeAndTab(By locator, String text){
//
//        WebElement element = wait_for_element_locator_visible(locator);
//
//        element.click();
//        element.clear();
//        element.sendKeys(text);
//        element.sendKeys(Keys.TAB);
//
//    }
//    public static WebElement wait_for_element_visible(WebElement element) {
//        return getWait().until(ExpectedConditions.visibilityOf(element));
//    }
//    public static List<WebElement> wait_for_elements_visibility(WebElement element) {
//        return getWait().until(ExpectedConditions.visibilityOfAllElements(element));
//    }
//    public static void type_values_by_webElement(String value,WebElement element){
//        wait_for_element_visible(element).sendKeys(value);
//    }
//    public static void type_values_element_Enter(String value,WebElement element) {
//        wait_for_element_visible(element).sendKeys(value, Keys.ENTER);
//    }
//    public static void click_element(WebElement element){
//        wait_for_element_clickable(element).click();
//    }
//    public static WebElement wait_for_element_clickable(WebElement element){
//        return getWait().until(ExpectedConditions.elementToBeClickable(element));
//    }
//    public void scrollToElement(WebElement element) {
//
//        getWait().until(ExpectedConditions.visibilityOf(element));
//
//        JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver();
//        js.executeScript("arguments[0].scrollIntoView(true);", element);
//
//    }

}
