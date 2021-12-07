package CreatingAccount;

import CreatingAccount.pages.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class StorePageBase {

    MyAccountPage myAccountPage;
    CreateAnAccountPage createAnAccountPage;
    AuthenticationPage authenticationPage;
    MainPage mainPage;
    MyAddressesPage myAddressesPage;


    WebDriver driver;
    String URL = "http://automationpractice.com/";
    String email = "\\w{10}\\@gmail\\.com";
    String firstName = "Luke";
    String lastName = "Skywalker";
    String password = "andromeda";
    String address = "Lucas Street 77";
    String city = "London";
    String postalCode = "11111";
    String info = "Some random text";
    String mobile = "123456789";
    String userName = "Luke Skywalker";
    String expectedAddress = "MY ADDRESS\n" + "Luke Skywalker\n" + "Lucas Street 77\n" + "London, California 11111\n" +
            "United States\n" + "123456789\n";


    @Before
    public void setupDriver() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get(URL);
        mainPage = new MainPage(driver);
    }

    @After
    public void driverQuit() {
        driver.quit();
    }

}
