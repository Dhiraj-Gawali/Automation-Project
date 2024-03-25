package Steps;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginTest {
	
	WebDriver driver = null;
	String chromeDriverPath = System.getProperty("user.dir") + "/src/test/resources/Drivers/chromedriver";
	LoginPageFactory lpf = null;
	String loginTitle;
	
	@Given("Browser is Open")
	public void browser_is_open() {
	    driver = new ChromeDriver();
	}

	@And("user is on Swag Labs Log in page")
	public void user_is_on_swag_labs_log_in_page() {
		driver.navigate().to("https://www.saucedemo.com/");
		loginTitle = driver.getTitle();
		lpf = new LoginPageFactory(driver);
	}

	@When("^user enters the (.*) and (.*)$")
	public void user_enters_the_credentials(String username, String password) {
		lpf.enterUserName(username);
		lpf.enterPassword(password);
	}

	@And("user taps on submit button")
	public void user_taps_on_submit_button() {
		lpf.clickLogin();
	}

	@Then("user navigated to home Page of Swag Labs")
	public void user_navigated_to_home_page_of_swag_labs() throws InterruptedException {
		Thread.sleep(2000);
		Assert.assertFalse(driver.getTitle().equalsIgnoreCase(loginTitle));
	    Thread.sleep(2000);
	    driver.quit();
	}
}
