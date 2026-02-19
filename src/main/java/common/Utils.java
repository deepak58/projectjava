package common;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

//locator = identifing element
//how locator use = id, class, css-selector, xpath, name, link-text, partial-link-text, tag name

//xpath axes - advance xpath
//parent , child
//ancestors, descendant
//siblings
//up = preceding
//down = following

public class Utils {
    public WebDriver driver;
    WebDriverWait wait;

    public WebDriver browserLanch() {
        driver = new ChromeDriver();
        return driver;
    }

    public void lanchUrl(String Url) {
        driver.get(Url);
    }

    public void quitBrowser() {
        driver.quit();
    }

    public WebElement findElement(By locator) {
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        return element;
    }

    public void setImplisitTime(long time) {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }

    public void windowMax() {
        driver.manage().window().maximize();
    }

    public void type_values_Enter(String value, WebElement element) {
        element.sendKeys(value, Keys.ENTER);
    }

    public List<WebElement> findElements(By locator) {
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        List<WebElement> elements = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locator));
        return elements;
    }
}
