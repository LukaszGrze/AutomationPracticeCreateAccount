package CreatingAccount.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage {
    private final WebDriver driver;

    public MainPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
@FindBy (css = ".login")
    WebElement signInButton;


public AuthenticationPage signIn(){
    signInButton.click();
    return new AuthenticationPage(driver);

}

}
