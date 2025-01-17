package step_definitions;

import Pages.HomePage;
import Pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class BookDetFeatureStep {
    LoginPage loginPage= new LoginPage();
    HomePage homepage=new HomePage();

    @Given("User should be on the load website")
    public void userShouldBeOnTheLoadWebsite() {
        HomePage.loadHomePage();


    }

    @When("User is able to click book option")
    public void userIsAbleToClickBookOption() {
        homepage.clickOnElement(homepage.ClickBook);
    }

    @When("User is able to click anybook")
    public void userIsAbleToClickAnybook() {
        homepage.clickOnElement(homepage.AnyBook);
    }

    @When("User should able to see readbook option")
    public void userShouldAbleToSeeReadbookOption() {
        homepage.getDisplayStatus(homepage.ReadBook);
    }
}
