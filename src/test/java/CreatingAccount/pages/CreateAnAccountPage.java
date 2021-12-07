package CreatingAccount.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CreateAnAccountPage {
    private final WebDriver driver;

    public CreateAnAccountPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy (id = "id_gender1")
    WebElement genderButton;
    @FindBy (id = "customer_firstname")
    WebElement firstNameField;
    @FindBy (id = "customer_lastname")
    WebElement lastNameField;
    @FindBy (id = "passwd")
    WebElement passwordField;
    @FindBy (id = "days")
    WebElement daysSelect;
    @FindBy (id = "months")
    WebElement monthsSelect;
    @FindBy (id = "years")
    WebElement yearsSelect;
    @FindBy (id = "newsletter")
    WebElement newsletterButton;
    @FindBy (id = "address1")
    WebElement addressField;
    @FindBy (id = "city")
    WebElement cityField;
    @FindBy (id = "id_state")
    WebElement stateSelect;
    @FindBy (id = "postcode")
    WebElement postalCodeField;
    @FindBy (id = "other")
    WebElement informationField;
    @FindBy (id = "phone_mobile")
    WebElement mobileField;
    @FindBy (id = "submitAccount")
    WebElement registerButton;



public MyAccountPage enterNewAddressData(String firstName, String lastName, String password, String address, String city, String postalCode, String info, String mobile){
    genderButton.click();
    firstNameField.sendKeys(firstName);
    lastNameField.sendKeys(lastName);
    passwordField.sendKeys(password);
    daysSelect.click();
    new Select(daysSelect).selectByValue("7");
    monthsSelect.click();
    new Select(monthsSelect).selectByValue("8");
    yearsSelect.click();
    new Select(yearsSelect).selectByValue("1999");
    newsletterButton.click();
    addressField.sendKeys(address);
    cityField.sendKeys(city);
    stateSelect.click();
    new Select(stateSelect).selectByValue("5");
    postalCodeField.sendKeys(postalCode);
    informationField.sendKeys(info);
    mobileField.sendKeys(mobile);
    registerButton.click();
    return new MyAccountPage(driver);
}

}
