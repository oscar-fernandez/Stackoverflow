package cucumberframework.steps;

import static org.junit.Assert.assertEquals;

import java.io.IOException;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStep {
	
	WebDriver driver;
	
	@Before
	public void setup() throws IOException {
		System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "/geckodriver.exe");
		this.driver = new FirefoxDriver();
	}
	
	@Given("^User navigates to Stackoverflow website$")
	public void user_navigates_to_Stackoverflow_website(){
	    // Write code here that turns the phrase above into concrete actions
		this.driver.get("http://stackoverflow.com");
	}

	@Given("^User clicks on Login button$")
	public void user_clicks_on_Login_button() {
	    // Write code here that turns the phrase above into concrete actions
		// /html/body/header/div/ol[2]/li[3]/a
		this.driver.findElement(By.xpath("/html/body/header/div/ol[2]/li[3]/a")).click();
	}

	@Given("^User enters valid username$")
	public void user_enters_valid_username() {
	    // Write code here that turns the phrase above into concrete actions
		// //*[@id="email"]
		this.driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("webdriveruniversity2@mail.com");
	}

	@Given("^User enters valid password$")
	public void user_enters_valid_password() {
	    // Write code here that turns the phrase above into concrete actions
		// //*[@id="password"]
		this.driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Yellow321!");
	}

	@When("^User clicks Submit button$")
	public void user_clicks_Submit_button() {
	    // Write code here that turns the phrase above into concrete actions
		// //*[@id="submit-button"]
		this.driver.findElement(By.xpath("//*[@id=\"submit-button\"]")).click();
	}

	@Then("^User is taken to Home page successfully$")
	public void user_is_taken_to_Home_page_successfully() {
	    // Write code here that turns the phrase above into concrete actions
		// /html/body/div[3]/div[2]/div[1]/div[1]/div/a
		WebElement askQuestionButton = driver.findElement(By.xpath("/html/body/div[3]/div[2]/div[1]/div[1]/div/a"));
		assertEquals(true, askQuestionButton.isDisplayed());
		driver.close();
	}
	

	@Given("User navigates to Stackoverflow website2")
	public void user_navigates_to_stackoverflow_website2() {
		System.out.println("User navigates to Stackoverflow website2");
	}
	@Given("User clicks on Login button2")
	public void user_clicks_on_login_button2() {
		System.out.println("User clicks on Login button2");
	}
	@Given("User enters valid username2")
	public void user_enters_valid_username2() {
		System.out.println("User enters valid username2");
	}
	@Given("User enters valid password2")
	public void user_enters_valid_password2() {
		System.out.println("User enters valid password2");
	}
	@When("User clicks Submit button2")
	public void user_clicks_submit_button2() {
		System.out.println("User clicks Submit button2");
	}
	@Then("User is taken to Home page successfully2")
	public void user_is_taken_to_home_page_successfully2() {
		System.out.println("User is taken to Home page successfully2");
	}



}
