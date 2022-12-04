package tests.pl.skleptest.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import tests.pl.skleptest.models.Customer;
import tests.pl.skleptest.pages.HomePage;
import tests.pl.skleptest.pages.OrderDetailsPage;

public class CheckoutTest extends BaseTest {
// After placing an order, the names of the ordered products are not displayed

    @Test
    public void checkoutTest() throws InterruptedException {
        Customer customer = new Customer();
        OrderDetailsPage orderDetailsPage = new HomePage(BaseTest.driver)
                .addProductsAndOpenCartPage()
                .openAddressDetails()
                .fillAddressDetails(customer, "area11");

        Assert.assertEquals(orderDetailsPage.getOrderNotice().getText(), "Thank you. Your order has been received.");


    }

}
