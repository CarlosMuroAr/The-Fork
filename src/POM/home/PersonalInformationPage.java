package POM.home;

import core.helpers.ClickHelpers;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PersonalInformationPage {

    ClickHelpers clickHelpers = new ClickHelpers();

    public By inputFirstName(){
        return By.xpath("//input[@name='firstName']");
    }

    public By inputLastName(){
        return By.xpath("//input[@name='lastName']");
    }
    public By inputPhoneNumber(){
        return By.xpath("//input[@data-testid='phone-input-number']");
    }


}
