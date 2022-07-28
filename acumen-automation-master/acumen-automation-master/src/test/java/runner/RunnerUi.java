package runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "C:\\Users\\My\\acumen automation\\acumen automation\\src\\main\\resources",
        glue = {"steps"}
        )

	
public class RunnerUi {
   
}

