package testSuite.spotify;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LogInTest extends BaseSpotify {

    @Test
    public void testLogIn() throws InterruptedException {
        startScreen.withGoogle.click();
        googleAccountsSection.EnableAccount.click();
        Thread.sleep(5000);

        homeScreen.laterButton.click();

        Assertions.assertTrue(headerSection.Perfil.isControlDisplayed());
    }
}
