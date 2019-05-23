


import org.junit.runner.RunWith;
import cucumber.api.junit.Cucumber;
import cucumber.api.CucumberOptions;


//Executar os Testes

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/main/java/Cliente.feature", glue = { "" }, monochrome = true, dryRun = false)
public class ClienteTest {

}
