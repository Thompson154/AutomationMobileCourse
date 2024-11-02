package testSuite.spotify;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CreateLibraryTest extends BaseSpotify{

    @Test
    public void testCreateLibrary() throws InterruptedException {

        String library = "ThompsonLibrary";
        startScreen.LogIn();
        Thread.sleep(5000);

        footerSection.yourLibrary.click();
        libraryScreen.createLibrary.click();
        libraryScreen.setNamePlaylist.clearSetText(library);
        libraryScreen.confirmCreatePlaylist.click();

        Assertions.assertEquals(library,pLayListScreen.getNamePLaylist(library), "ERROR al crear la playlist");
    }
}
