package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static utilities.DriverSetup.getDriver;

public class LoginPage extends BasePage {

   HomePage homePage= new HomePage();
    public By RegisterName=By.xpath("//input[@id='reg_billing_first_name']");
    public By RegisterPhone=By.xpath("//input[@id='reg_billing_phone']");
    public By RegisterEmail=By.xpath("//input[@id='reg_email']");
    public By Registerpassword =By.xpath("//input[@id='reg_password']");
    public By RegisterConfirmPassword=By.xpath("//input[@id='reg_confirm_password']");
    public By RegisterButton=By.xpath("//input[@name='register']");
    public By NameErrMsg=By.xpath("//li[contains(text(),'The username')]");
    public By EmailErrMsg=By.xpath("//li[contains(text(),'Unknown email address. Check again or try your use')]");
    public By PasswordErrMsg=By.xpath("//li[contains(text(),'The password you entered for the email address')]");
    public By LogOut=By.xpath("//a[contains(text(),'লগ অউট করুন')]");
    public String  loginPageURL = "https://www.wafilife.com/my-account";
    public String MyAccountPageTitle = "//h1[contains(text(),'আমার অ্যাকাউন্ট')]";
    public By emailInputBox =  By.xpath("//input[@id='username']");
    public By passwordInputBox =  By.xpath("//input[@id='password']");
    public By errorMsg =  By.xpath("//li[contains(text(),'Unknown email address. Check again or try your use')]");
    public By loginButton =  By.xpath("//input[@name='login']");

    public void doLogin(String email, String password){
        loadAWebPage(loginPageURL);
        writeOnElement(emailInputBox, email);
        writeOnElement(passwordInputBox, password);
        clickOnElement(loginButton);

    }
    public void navigateToLoginPage(){
        homePage.loadHomePage();
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(100));
        wait.until(ExpectedConditions.presenceOfElementLocated(homePage.loginorReg)).click();

    }

}
