package selenium.cucumber.stepDefinition;

import junit.framework.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Test2 {
	
	String URL = "http://store.demoqa.com/wp-login.php";
	String Login = "zmmm";
	String Password="Ambattur123";
	String exePath = "D:\\SeleniumCuccumber\\Cucumber\\src\\main\\resources\\Chrome\\chromedriver.exe";
	WebDriver driver;
	String Loginid="user_login";
	String passwordid ="user_pass";
	String login_button="wp-submit";
	String profilepage="profile-page";
	
	public void setupBrowser()
	{
		System.setProperty("webdriver.chrome.driver",exePath);
		driver = new ChromeDriver();
	}

	@Given("^Test user has launched URL successfully$")
	public void test_user_has_launched_URL_successfully() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		setupBrowser();
		driver.get(URL);
	}

	@When("^Enters the valid \"([^\"]*)\" & \"([^\"]*)\" and then clicks on the Login button$")
	public void enters_the_valid_and_then_clicks_on_the_Login_button(String uname, String pwd) throws Throwable {
		Thread.sleep(5000);
		driver.findElement(By.id(Loginid)).sendKeys(uname);
		driver.findElement(By.id(passwordid)).sendKeys(pwd);
		driver.findElement(By.id(login_button)).click();
	}

	@Then("^User should get the home screen of the Portal successfully$")
	public void user_should_get_the_home_screen_of_the_Portal_successfully() throws Throwable {
		Boolean Expec = driver.findElement(By.id("profile-page")).isDisplayed();
		Assert.assertTrue(Expec);
		driver.quit();
	}
}
