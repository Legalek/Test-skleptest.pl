package tests.pl.skleptest.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
    protected static WebDriver driver;

    @FindBy(xpath = "//i[@class='fa fa-user']")
    private WebElement accountLink;

    @FindBy(id = "searchform_topbar")
    private WebElement searchInput;

    @FindBy(xpath = "//li[@class='top-cart']")
    private WebElement myCartButton;

    @FindBy(xpath = "//a[contains(@href,'/?add-to-cart=17')]")
    private WebElement addFirstProduct;

    @FindBy(xpath = "//a[contains(@href,'/?add-to-cart=15')]")
    private WebElement addSecondProduct;
    @FindBy(xpath = "//a[contains(@href,'/?add-to-cart=19')]")
    private WebElement addThirdProduct;

    @FindBy(tagName = "//a[@class='added_to_cart wc-forward']")
    private WebElement viewCartButton;

    @FindBy(xpath = "//a[@title='Contact']")
    private WebElement contactButton;

    public HomePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public MyAccountPage openMyAccountPage() {
        accountLink.click();
        return new MyAccountPage(driver);

    }

    public ContactPage openContactPage() {
        contactButton.click();
        return new ContactPage(driver);
    }
//    public static void waitForClickable(WebElement element, WebDriver driver) {
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
//        wait.until(ExpectedConditions.elementToBeClickable(element));
//    }

    public CartPage addProductsAndOpenCartPage() throws InterruptedException {


        addFirstProduct.click();
        Thread.sleep(3000);
        addSecondProduct.click();
        Thread.sleep(3000);
        addThirdProduct.click();
        Thread.sleep(3000);
        myCartButton.click();

        return new CartPage(driver);
    }


}
