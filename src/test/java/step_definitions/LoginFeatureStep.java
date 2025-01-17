package step_definitions;

import Pages.LoginPage;
import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import static utilities.DriverSetup.getDriver;

public class LoginFeatureStep {
    LoginPage loginPage = new LoginPage();
    @Given("User should be on the login screen and Register")
    public void userShouldBeOnTheLoginScreen() {
        loginPage.loadAWebPage(loginPage.loginPageURL);
        loginPage.writeOnElement(loginPage.RegisterName, "Fara");
        loginPage.writeOnElement(loginPage.RegisterPhone, "01798178034");
        loginPage.writeOnElement(loginPage.RegisterEmail, "farihahoque1610@gmail.com");
        loginPage.writeOnElement(loginPage.Registerpassword, "Farihahoque123");
        loginPage.writeOnElement(loginPage.RegisterConfirmPassword, "Farihahoque123");
        loginPage.clickOnElement(loginPage.RegisterButton);
    }

    @When("User enter valid username and password")
    public void userEnterValidUsernameAndPassword() {
        loginPage.writeOnElement(loginPage.emailInputBox, "farihahoque1610@gmail.com");
        loginPage.writeOnElement(loginPage.passwordInputBox, "Farihahoque123");
    }

    @And("User click on the login button")
    public void userClickOnTheLoginButton() {
        loginPage.clickOnElement(loginPage.loginButton);
    }


    @But("User should not be on the login page")
    public void userShouldNotBeOnTheMyAccountPage() {
        Assert.assertEquals(loginPage.loginPageURL,getDriver().getCurrentUrl());
        Assert.assertEquals(getDriver().getTitle(),"আমার অ্যাকাউন্ট");
    }

    @When("User enter {string} on the username filed")
    public void userEnterOnTheUsernameFiled(String username) {
        loginPage.writeOnElement(loginPage.emailInputBox, username);
    }

    @And("User enter {string} on the password filed")
    public void userEnterOnThePasswordFiled(String arg0) {
        loginPage.writeOnElement(loginPage.passwordInputBox, arg0);
    }

    @Then("User should see {string} error message for wrong username")
    public void userShouldSeeErrorMessage(String arg0) {
        Assert.assertEquals(loginPage.getElementText(loginPage.NameErrMsg), arg0);
    }

    @Then("User should see {string} error message for wrong email")
    public void userShouldSeeErrorMessageWrongEmail(String arg0) {
        Assert.assertEquals(loginPage.getElementText(loginPage.EmailErrMsg), arg0);
    }

    @Then("User should see {string} error message for wrong password")
    public void userShouldSeeErrorMessageWrongPassword(String arg0) {
        Assert.assertEquals(loginPage.getElementText(loginPage.PasswordErrMsg), arg0);
    }


}