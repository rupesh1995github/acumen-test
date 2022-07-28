package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class LoginPage extends PageObject{

	@FindBy(css = "input[name=\"username\"]")
	public static WebElement usernameField;
	
	@FindBy(css = "input[name=\"password\"]")
	public WebElement passwordField;
	
	@FindBy(xpath = "//button[contains(text(),'Login')]")
	public WebElement loginButton;
	
	@FindBy(css = "div#__next")
	public WebElement dashboard;
	
	public LoginPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	/**
	 * This will verify the title of the given page
	 * @param expectedTitle accepts a expected title in string
	 */
	public void verifyTitleOfThePage (String expectedTitle) {
		Assert.assertEquals(driver.getTitle(), expectedTitle);
	}
	
	/**
	 * This will enter the value in username field
	 * @param username accepts the any string value which needs to be pass into username field
	 */
	public void enterUsername(String username) {
		usernameField.sendKeys(username);
	}
	
	/**
	 * This will enter the value in password field
	 * @param password accepts the any string value which needs to be pass into password field
	 */
	public void enterPassword(String password) {
		passwordField.sendKeys(password);
	}
	
	/**
	 * This will click on the login button
	 */
	public void clickOnLoginButton() {
		loginButton.click();
	}	
	
	/*
	 * This will verify the dashboard is displayed or not
	 */
	public void verifyDashboardIsDisplayed() {
		boolean status = dashboard.isDisplayed();
		Assert.assertTrue(status);
	}
}
