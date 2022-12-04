package tests.pl.skleptest.tests;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import tests.pl.skleptest.pages.HomePage;

public class RegisterTest extends BaseTest {

    @Test
    public void registerUserTest() {
        int random = (int) (Math.random() * 1000);
        WebElement dashboardCheck = new HomePage(driver)
                .openMyAccountPage()
                .registerUserValidData("test" + random + "@test2.pl", "test2@test2.pl")
                .getDashboardLink();

        Assert.assertEquals(dashboardCheck.getText(), "MY ACCOUNT");

    }
//You can register with the same e-mail and password several times

    @Test
    public void registerUserWithSameEmail() {

        new HomePage(driver)
                .openMyAccountPage()
                .registerUserValidData("test2@test2.pl", "test2@test2.pl")
                .getDashboardLink();

    }
}