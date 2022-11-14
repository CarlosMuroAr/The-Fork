package POM.login;

import core.helpers.ClickHelpers;
import core.helpers.SendKeyHelpers;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    ClickHelpers clickHelpers = new ClickHelpers();
    SendKeyHelpers sendKeyHelpers = new SendKeyHelpers();

    public By btnOpenLogin(){return By.xpath("//button[@data-testid='user-space']");}
    public By inputEmail(){return By.id("identification_email");}

    public By btnCookies(){return By.id("_evidon-accept-button");}
    public By btnContinue(){return By.xpath("//button[@data-testid='checkout-submit-email']");}
    public By inputPassword(){return By.id("password");}
    public By btnContinuePass(){return By.xpath("//button[@data-testid='submit-password']");}

    public void login(WebDriver driver, String email, String password){

        clickHelpers.click(driver, btnCookies());
        clickHelpers.click(driver, btnOpenLogin());
        sendKeyHelpers.write(driver, inputEmail(), email);
        clickHelpers.click(driver, btnContinue());
        sendKeyHelpers.write(driver, inputPassword(), password);
        clickHelpers.click(driver, btnContinuePass());
    }
}
