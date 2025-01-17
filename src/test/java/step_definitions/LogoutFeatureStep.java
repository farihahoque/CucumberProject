package step_definitions;

import Pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class LogoutFeatureStep {

    LoginPage loginPage = new LoginPage();
    @Given("User should be on the login screen and Register Initially")
    public void userShouldBeOnTheLoginScreen() {
        loginPage.loadAWebPage(loginPage.loginPageURL);
        loginPage.writeOnElement(loginPage.RegisterName, "Fara");
        loginPage.writeOnElement(loginPage.RegisterPhone, "01798178034");
        loginPage.writeOnElement(loginPage.RegisterEmail, "farihahoque1610@gmail.com");
        loginPage.writeOnElement(loginPage.Registerpassword, "Farihahoque123");
        loginPage.writeOnElement(loginPage.RegisterConfirmPassword, "Farihahoque123");
        loginPage.clickOnElement(loginPage.RegisterButton);
    }


    @When("User enter valid username and password for login")
    public void userEnterValidUsernameAndPassword() {
        loginPage.writeOnElement(loginPage.emailInputBox, "farihahoque1610@gmail.com");
        loginPage.writeOnElement(loginPage.passwordInputBox, "Farihahoque123");
    }

    @And("User click on the login button first")
    public void userClickOnTheLoginButton() {
        loginPage.clickOnElement(loginPage.loginButton);
    }

    @But("User click on the logout button then")
    public void userClickOnTheLogoutButton() {
        loginPage.clickOnElement(loginPage.LogOut);
    }
}
