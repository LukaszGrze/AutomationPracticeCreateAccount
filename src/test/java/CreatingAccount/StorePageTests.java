package CreatingAccount;

import org.junit.Assert;
import org.junit.Test;

public class StorePageTests extends StorePageBase {

    @Test
    public void createAccount() {
        authenticationPage = mainPage.signIn();
        createAnAccountPage = authenticationPage.createAccount(email);
        myAccountPage = createAnAccountPage.enterNewAddressData(firstName, lastName, password, address, city, postalCode, info, mobile);
        Assert.assertEquals(userName, myAccountPage.checkUser());
        myAddressesPage = myAccountPage.goToAddresses();
        Assert.assertTrue(myAddressesPage.checkAddress().contains(expectedAddress));
    }

}
