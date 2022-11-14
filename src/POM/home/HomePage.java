package POM.home;

import core.helpers.ClickHelpers;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    ClickHelpers clickHelpers = new ClickHelpers();

    public By btnPersonalInformation(){
        return By.xpath("//button[@aria-controls='user-space-user-information']");
    }

    public void openPersonalInformation(WebDriver driver){

        clickHelpers.click(driver, btnPersonalInformation());
    }

}
