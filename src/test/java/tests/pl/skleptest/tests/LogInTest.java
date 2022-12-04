package tests.pl.skleptest.tests;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import tests.pl.skleptest.pages.HomePage;

public class LogInTest extends BaseTest {

    @Test
    public void logInTest() {
        WebElement dashboardCheck = new HomePage(driver)
                .openMyAccountPage()
                .logInValidDate("test2@test2.pl", "test2@test2.pl")
                .getDashboardLink();

        Assert.assertEquals(dashboardCheck.getText(), "MY ACCOUNT");

    }

    @Test
    public void logInTestWithInvalidEmail() {
        int random = (int) (Math.random() * 1003);
        WebElement dashboardCheck = new HomePage(driver)
                .openMyAccountPage()
                .logInInvalidDate("random" + random + "@test2.om", "test2@test2.pl")
                .getError();

        Assert.assertEquals(dashboardCheck.getText(), "Error: A user could not be found with this email address.");
    }
}