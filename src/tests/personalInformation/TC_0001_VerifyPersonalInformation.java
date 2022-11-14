package tests.personalInformation;

import POM.home.HomePage;
import POM.home.PersonalInformationPage;
import POM.login.LoginPage;
import core.helpers.AssertHelpers;
import core.utils.ReadExcelFile;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import tests.Hooks;


public class TC_0001_VerifyPersonalInformation extends Hooks {

    LoginPage loginPage = new LoginPage();
    PersonalInformationPage personalInformationPage = new PersonalInformationPage();
    HomePage homePage = new HomePage();
    AssertHelpers asserts = new AssertHelpers();
    ReadExcelFile readFile = new ReadExcelFile();

    @Test(dataProvider="PersonalInformation")
    public void TC_0001_VerifyPersonalInformation(String email, String pass, String firstName, String lastName,String phoneNumber)
    {

        //Login
        loginPage.login(this.driver, email, pass);
        asserts.assertEquals(driver, homePage.btnPersonalInformation(), "My personal information");

        //Go to Personal Information section
        homePage.openPersonalInformation(driver);

        //Validate Personal Information
        asserts.assertEqualsGetAttribute(driver, personalInformationPage.inputFirstName(), firstName);
        asserts.assertEqualsGetAttribute(driver, personalInformationPage.inputLastName(), lastName);
    }

    @DataProvider
    public Object[][] PersonalInformation() throws Exception{

        Object[][] testObjArray = readFile.getTableArray(System.getProperty("user.dir") + "/src/data/PersonalInformation.xlsx","personalInf");
        return (testObjArray);
    }
}