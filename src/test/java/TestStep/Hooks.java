package TestStep;

import common.Utils;
import configs.ConfigReader;
import drivers.DriverFactory;
import drivers.DriverManager;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;

public class Hooks {

    @Before
    public void browserLaunch(){
        WebDriver driver = DriverFactory.initializeDriver(ConfigReader.getprop("browser"));
        DriverManager.setDriver(driver);
        Utils.windowMax();
    }

    @After
    public void tearDown() {

        if(DriverManager.getDriver() != null){
            DriverManager.getDriver().quit();
            DriverManager.unloadDriver();
        }
    }
}
