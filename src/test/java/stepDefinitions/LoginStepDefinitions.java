package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.DashboardPage;
import pages.LoginPage;
import setup.BrowserSetup;

public class LoginStepDefinitions extends BrowserSetup {
    LoginPage loginPage;
    DashboardPage dashboardPage;

    @Given("user visits the website")
    public void user_visits_the_website() {
        driver.get("https://www.saucedemo.com/");
    }

    @When("user enters valid username {string} and password {string}")
    public void userEntersValidUsernameAndPassword(String username, String password) {
        loginPage = new LoginPage(driver);
        loginPage.doLogin(username, password);
    }

    @Then("user enters into website dashboard")
    public void user_enters_into_website_dashboard() {
        dashboardPage = new DashboardPage(driver);
        dashboardPage.verifyLoginRedirectsToDashboardPage();
    }

    @Then("user cannot enter into website dashboard with invalid credentials")
    public void userCannotEnterIntoWebsiteDashboardWithInvalidCredentials() {
        loginPage = new LoginPage(driver);
        loginPage.errorMessageForInvalidCredentials();
    }

    @After
    public void tearDown() {
        driver.quit();
    }


}
