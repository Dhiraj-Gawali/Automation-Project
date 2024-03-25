package Steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HooksGlue {
	
	WebDriver driver = null;
	String chromeDriverPath = System.getProperty("user.dir") + "/src/test/resources/Drivers/chromedriver";
	LoginPageFactory lpf = null;
	String loginTitle;
	
	
	@Before
	public void StartUpMethods() {
		System.out.println(">>>>>>>>>>>>>>>>This are before Methods");
	}
	
	@After
	public void endMethods() {
		System.out.println(">>>>>>>>>>>>>>>>This are After Methods");

	}
	
	@BeforeStep
	public void beforeSteps() {
		System.out.println(">>>>>>>>>>>>>>>>This are Before Steps");

	}
	
	@AfterStep
	public void AfterSteps() {
		System.out.println(">>>>>>>>>>>>>>>>This are After Steps");
	}
	
	@Given("Browser is Opennn")
	public void browser_is_opennn() {
		driver = new ChromeDriver();
	}

	@And("user is on Swag Labs Log in pagee")
	public void user_is_on_swag_labs_log_in_pagee() {
		driver.navigate().to("https://www.saucedemo.com/");
		loginTitle = driver.getTitle();
		lpf = new LoginPageFactory(driver);
	}

	@When("user enters the username andd password")
	public void user_enters_the_username_andd_password() {
		lpf.enterUserName("problem_user");
		lpf.enterPassword("secret_sauce");
	}

	@And("user taps on submit buttonn")
	public void user_taps_on_submit_buttonn() {
		lpf.clickLogin();
	}

	@Then("user navigated to home Page of Swag Labss")
	public void user_navigated_to_home_page_of_swag_labss() throws InterruptedException {
		Thread.sleep(2000);
	    
	    driver.quit();
	}

}
