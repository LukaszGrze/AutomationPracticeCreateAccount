package CreatingAccount.pages;


import com.mifmif.common.regex.Generex;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AuthenticationPage  {
    private final WebDriver driver;

    public AuthenticationPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "email_create")
    WebElement emailFiled;
    @FindBy(id = "SubmitCreate")
    WebElement createAccountButton;


    public CreateAnAccountPage createAccount(String email) {
        emailFiled.sendKeys(new Generex(email).random());
        createAccountButton.click();
        return new CreateAnAccountPage(driver);
    }


}
