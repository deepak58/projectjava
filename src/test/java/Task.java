import common.Utils;
import junit.framework.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane;
import java.time.Duration;
import java.util.List;

public class Task extends Utils {
    WebDriver driver = browserLanch();

    public void amazon(){
        lanchUrl("https://www.amazon.in/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        Actions act = new Actions(driver);
        WebElement signIN = findElement(By.xpath("//span[text()='Hello, sign in']"));
        act.moveToElement(signIN).perform();
        WebElement baby = findElement((By.xpath("//span[text()='Baby Wishlist']")));
        baby.click();
        WebElement downpage = findElement(By.xpath("//h2[text()='See personalized recommendations']"));
        act.scrollToElement(downpage).perform();

    }
    public void light(){
        lanchUrl("https://www.amazon.in/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        Actions act = new Actions(driver);
        WebElement signIN = findElement(By.xpath("//span[text()='Hello, sign in']"));
        act.moveToElement(signIN).perform();
        WebElement explore = findElement(By.xpath("//span[text()='Explore Showroom']"));
        explore.click();
    }
    public void test(){
        lanchUrl("https://www.automationtesting.co.uk/loginPortal.html");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        WebElement username = findElement(By.cssSelector("#login_text"));
        username.sendKeys("test");
        WebElement pass = findElement(By.cssSelector("#login_password"));
        pass.sendKeys("test123",Keys.ENTER);
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
//        Alert alert = wait.until(ExpectedConditions.alertIsPresent());
//        String text = alert.getText();
//        String expectedText = "validation succeeded";
//        Assert.assertEquals(text,expectedText);
//        alert.accept();
        if (wait.until(ExpectedConditions.alertIsPresent()) !=null){
            Alert alert = driver.switchTo().alert();
            System.out.println("Test Pass");
            alert.accept();
        }else {
            System.out.println("Test Fail");
        }

    }
    public void actiontest(){
        Actions act = new Actions(driver);
        lanchUrl("https://www.automationtesting.co.uk/index.html");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        WebElement actbutton = findElement(By.xpath("//*[@id=\"menu\"]/ul/li[3]/a"));
        actbutton.click();
        WebElement dragFrom = findElement(By.xpath("//*[@id=\"dragtarget\"]"));
        WebElement dragTo = findElement(By.xpath("//*[@id=\"main\"]/div/div[1]/div[1]/div[2]"));
        act.dragAndDrop(dragFrom,dragTo).perform();
        WebElement hold = findElement(By.xpath("//*[@id=\"click-box\"]"));
        act.clickAndHold(hold).perform();
        act.release(hold).perform();
        WebElement doubleClick = findElement(By.xpath("//p[text()='Double Click Here']"));
        act.doubleClick(doubleClick).perform();
        WebElement holdShiftClick = findElement(By.xpath("//p[text()='Hold Shift & Click Here']"));
        act.keyDown(Keys.SHIFT).click(holdShiftClick).keyUp(Keys.SHIFT).perform();
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
        Alert alert = wait.until(ExpectedConditions.alertIsPresent());
        String actualText = alert.getText();
        String expectedText = "The SHIFT key was pressed!";
        if (actualText.equals(expectedText)){
            System.out.println("Test Pass");
            alert.accept();
        }else {
            System.out.println("Test Fail");
        }
    }
    public void slide() {
        Actions act = new Actions(driver);
        lanchUrl("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        WebElement scroll = findElement(By.xpath("//*[@id=\"HTML14\"]/h2"));
        act.scrollToElement(scroll).perform();
        List<WebElement> slide = driver.findElements(By.xpath("//*[@id=\"slider-range\"]/span[1]"));
        act.dragAndDropBy(slide.get(0), 40,0).perform();
        act.dragAndDropBy(slide.get(1),-50,0);
        String price = driver.findElement(By.xpath("//*[@id=\"amount\"]")).getText();
        System.out.println("Test pass and price range is: "+price);

    }
    public void flipkart(String games){
        lanchUrl("https://www.flipkart.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        WebElement search =  findElement(By.xpath("//input[contains(@placeholder,'Search for Products')]"));
        type_values_Enter(games,search);
        List<WebElement> consoleList = findElements(By.xpath("//a[@class='GnxRXv']"));
        System.out.println(consoleList.size());
        WebElement five = consoleList.get(5);

        if(five.isDisplayed()){
            five.click();
            System.out.println("Game-Console is  clicked");
        }else {
            System.out.println("Game-Console is not displayed");
        }

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

    public static void main(String[] args) {
        Task zon = new Task();
        //zon.amazon();
        //zon.test();
        //zon.actiontest();
        //zon.slide();
        zon.flipkart("games");
    }

}
