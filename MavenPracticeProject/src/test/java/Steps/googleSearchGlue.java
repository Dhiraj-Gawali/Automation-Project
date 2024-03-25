package Steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class googleSearchGlue {
	
	WebDriver driver;
	googlePageFactory gpf = null;
	
	@Given("user is on home screen")
	public void user_is_on_home_screen() {
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		gpf = new googlePageFactory(driver);
		
	}

	@When("User enters text in search box")
	public void user_enters_text_in_search_box() {
		gpf.enterSearchText("Google Gemini");
	}

	@And("user clicks search button")
	public void user_clicks_search_button() {
	    gpf.clickSearch();
	}

	@Then("user should be navigated to search reasult")
	public void user_should_be_navigated_to_search_reasult() throws InterruptedException {
	    Thread.sleep(3000);
	    driver.quit();
	}

}
