package testSuite.spotify;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CreateLibraryTest extends BaseSpotify{

    @Test
    public void testCreateLibrary() throws InterruptedException {

        String library = "ThompsonLibrary";
        startScreen.LogIn();
        Thread.sleep(5000);
        homeScreen.laterButton.click();
        Assertions.assertTrue(headerSection.Perfil.isControlDisplayed());


        footerSection.yourLibrary.click();
        Thread.sleep(5000);
        libraryScreen.createLibrary.click();
        Thread.sleep(2000);
        libraryScreen.createPlaylist.click();
        Thread.sleep(2000);
        libraryScreen.setNamePlaylist.clearSetText(library);
        Thread.sleep(2000);
        libraryScreen.confirmCreatePlaylist.click();

        Assertions.assertEquals(library,pLayListScreen.getNamePLaylist(library), "ERROR al crear la playlist");
    }
}
