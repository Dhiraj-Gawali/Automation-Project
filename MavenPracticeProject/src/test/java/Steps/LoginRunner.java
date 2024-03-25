// LoginRunner.java
package Steps;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
    features= {"src/test/resources/TagsFeature"},
    glue= {"Steps"}
    
)
public class LoginRunner extends AbstractTestNGCucumberTests {
}
