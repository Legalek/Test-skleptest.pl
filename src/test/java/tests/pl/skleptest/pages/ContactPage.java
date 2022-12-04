package tests.pl.skleptest.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import tests.pl.skleptest.models.Contact;

public class ContactPage {

    private final WebDriver driver;

    @FindBy(name = "your-name")
    private WebElement yourNameInput;

    @FindBy(name = "your-email")
    private WebElement yourEmailInput;

    @FindBy(name = "your-subject")
    private WebElement yourSubjectInput;

    @FindBy(name = "your-message")
    private WebElement yourMassageInput;

    @FindBy(xpath = "//p/input")
    private WebElement submitButton;

    @FindBy(xpath = "//div[@class='wpcf7-response-output wpcf7-display-none wpcf7-mail-sent-ng']")
    private WebElement errorMessageContact;

    public ContactPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public ContactPage fillContactDetails(Contact contact) {
        yourNameInput.sendKeys(contact.getYourName());
        yourEmailInput.sendKeys(contact.getYourEmail());
        yourSubjectInput.sendKeys(contact.getYourSubject());
        yourMassageInput.sendKeys(contact.getYourMSG());
        submitButton.click();
        return new ContactPage(driver);
    }

    public WebElement getErrorMessageContact() {
        return errorMessageContact;
    }
}
