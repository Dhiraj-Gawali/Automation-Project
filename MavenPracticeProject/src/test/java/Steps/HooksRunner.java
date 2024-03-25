package Steps;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features= {"src/test/resources/FolderHooksDemo"},
		glue= {"Steps"}
		
		)
public class HooksRunner extends AbstractTestNGCucumberTests{

}
