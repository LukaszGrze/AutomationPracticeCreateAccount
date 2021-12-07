package CreatingAccount.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyAccountPage {

    private final WebDriver driver;

    public MyAccountPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = ".account")
    WebElement userInfo;
    @FindBy(css = ".icon-building")
    WebElement myAddresses;

    public String checkUser() {

        return userInfo.getText();
    }

    public MyAddressesPage goToAddresses() {
        myAddresses.click();
        return new MyAddressesPage(driver);
    }

}
