package tests.pl.skleptest.tests;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import tests.pl.skleptest.models.Contact;
import tests.pl.skleptest.pages.HomePage;

public class ContactTest extends BaseTest {

    //  Until the assertion passes, the contact form doesn't work properly

   @Test
    public void ContactTest() {
       Contact contact = new Contact();
    WebElement error = new HomePage(BaseTest.driver)
            .openContactPage()
            .fillContactDetails(contact)
            .getErrorMessageContact();
       Assert.assertEquals(error.getText(),"There was an error trying to send your message. Please try again later.");

   }
}
