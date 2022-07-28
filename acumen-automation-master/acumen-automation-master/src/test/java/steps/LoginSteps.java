package steps;

import org.openqa.selenium.chrome.ChromeDriver;

import groovyjarjarantlr4.v4.parse.BlockSetTransformer.setAlt_return;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import pages.BasePage;
import pages.LoginPage;

public class LoginSteps extends BasePage {

	public LoginPage loginPage;

	@Given("^I launch the URL$")
	public void iLaunchTheUrl() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\My\\acumen automation\\acumen automation\\src\\test\\resources\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost:4080/");
		Thread.sleep(5000);
	}

	@And("I am on the login page")
	public void iAmOnTheLoginPage() {
		loginPage.verifyTitleOfThePage("Acumen");
	}

	@When("^I enter \"([^\"]*)\" in the username field$")
	public void iEnterValidUsername(String userName) {
		loginPage.enterUsername(userName);
	}

	@And("^I enter \\\"([^\\\"]*)\\\" in the password field$")
	public void iEnterValidPassword(String password) {
		loginPage.enterPassword(password);
	}

	@And("I click on submit button")
	public void iClickOnSubmitButton() {
		loginPage.clickOnLoginButton();
	}

	@Then("I should be logged in successfully")
	public void iShouldBeLoggedInSuccessfully() {
		loginPage.verifyDashboardIsDisplayed();
	}
}
