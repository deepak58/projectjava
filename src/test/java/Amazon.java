import common.Utils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.time.Duration;

public class Amazon extends Utils {
    WebDriver driver = browserLanch();

    public void search() throws InterruptedException {
        lanchUrl("https://www.amazon.in/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
        search.sendKeys("Iphone", Keys.ENTER);
        WebElement result = findElement(By.xpath("//h2[text()='Results']"));
        if (result.isDisplayed()) {
            System.out.println("search is successful");
        } else {
            System.out.println("search is not successful");
        }
        Thread.sleep(9000);
        quitBrowser();
    }

    public void amazonFinds() throws InterruptedException {
        lanchUrl("https://www.amazon.in/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
        search.sendKeys("Mobiles", Keys.ENTER);
        WebElement see = findElement(By.xpath("//span[text()='Brands']/parent::div/following-sibling::ul//span[text()='See more']"));
        see.click();
        WebElement brand = findElement(By.xpath("//span[text()='Brands']/parent::div/following-sibling::ul//span[text()='Samsung']"));
        brand.click();
        Thread.sleep(9000);
        quitBrowser();
    }

    public void shortlist() throws InterruptedException {
        lanchUrl("https://www.amazon.in/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
        search.sendKeys("Mobiles", Keys.ENTER);
        WebElement ramSize = findElement(By.xpath("//span[text()='RAM Size']/parent::div/following-sibling::ul//span[text()='10 GB & Above']"));
        ramSize.click();
        WebElement storageCapacity = findElement(By.xpath("//span[text()='Storage Capacity']/parent::div/following-sibling::ul//span[text()='512 GB & above']"));
        storageCapacity.click();
        WebElement customerReview = findElement(By.xpath("//span[text()='Customer Reviews']/parent::div/following-sibling::ul//span[text()='& Up']"));
        customerReview.click();
        WebElement cellularTechnology = findElement(By.xpath("//span[text()='Cellular Technology']/parent::div/following-sibling::ul//span[text()='5G']"));
        cellularTechnology.click();
        WebElement batteryCapacity = findElement(By.xpath("//span[text()='Battery Capacity']/parent::div/following-sibling::ul//span[text()='6,000 mAh & Above']"));
        batteryCapacity.click();
        WebElement processorSpeed = findElement(By.xpath("//span[text()='Processor Speed']/parent::div/following-sibling::ul//span[text()='2.5 GHz & Above']"));
        processorSpeed.click();
        WebElement screenSize = findElement(By.xpath("//span[text()='Screen Size']/parent::div/following-sibling::ul//span[text()='15 to 17.9 cm']"));
        screenSize.click();
        WebElement camera = findElement(By.xpath("//span[text()='Mobile Phone Primary Camera Resolution']/parent::div/following-sibling::ul//span[text()='32 MP & Above']"));
        camera.click();
        WebElement batteryLife = findElement(By.xpath("//span[text()='Battery Life']/parent::div/following-sibling::ul//span[text()='19 h & above']"));
        batteryLife.click();
        WebElement result = findElement(By.xpath("//span[text()='iQOO Neo 10 (Titanium Chrome, 16GB RAM, 512GB Storage) | Snapdragon 8s Gen 4 Processor & SuperComputing Chip Q1 | 7000 mAh Battery | Segment’s Highest 144 FPS Gaming Smartphone']"));
        if (result.isDisplayed()) {
            System.out.println("If you can able to see only (iQ00 Neo 10) mobile in search result than the test is pass");
        } else {
            System.out.println("If you can't able to see only (iQ00 Neo 10) mobile in search result than the test is fail");
        }
        Thread.sleep(9000);
        quitBrowser();
    }

    public static void main(String[] args) throws InterruptedException {
        Amazon amazon = new Amazon();
        //amazon.search();
        //amazon.amazonFinds();
        //amazon.shortlist();
    }
}

