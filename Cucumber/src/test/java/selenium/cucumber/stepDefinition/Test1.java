package selenium.cucumber.stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Test1 {
	
	String URL = "http://store.demoqa.com/wp-login.php";
	String Login = "zmmm";
	String Password="Ambattur123";
	String exePath = "D:\\SeleniumCuccumber\\Cucumber\\src\\main\\resources\\Chrome\\chromedriver.exe";
	WebDriver driver;
	String Loginid="user_login";
	String passwordid ="user_pass";
	String login_button="wp-submit";
	

	@Given("^User has launched Test URL$")
	public void user_has_launched_Test_URL() throws Throwable {
		System.setProperty("webdriver.chrome.driver",exePath);
		driver = new ChromeDriver();
		driver.get(URL);
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^Enters valid username and password and clicks on Login$")
	public void enters_valid_username_and_password_and_clicks_on_Login() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(10000);
		driver.findElement(By.id(Loginid)).sendKeys(Login);
		driver.findElement(By.id(passwordid)).sendKeys(Password);
		driver.findElement(By.id(login_button)).click();
	    throw new PendingException();
	}

	@Then("^User should get the home screen$")
	public void user_should_get_the_home_screen() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}
}
