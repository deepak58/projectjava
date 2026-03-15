package TestRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features/companies.feature",
        glue = "TestStep",
        //tags = "@first",
        dryRun = false,
        plugin = {"pretty","html:target/Reports/Add_Company_Test_Report.html"}
)

public class AddCompaniesTest {
}
