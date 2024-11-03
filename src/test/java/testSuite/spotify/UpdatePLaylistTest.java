package testSuite.spotify;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UpdatePLaylistTest extends BaseSpotify{

    @Test
    public void testUpdatePlaylist() throws InterruptedException {
        String nameLibrary = "ThompsonLibrary";
        String nameLibraryUpdate = "ThompsonLibraryUpdate";
        startScreen.LogIn();
        Thread.sleep(5000);
        homeScreen.laterButton.click();
        Assertions.assertTrue(headerSection.Perfil.isControlDisplayed());

        footerSection.yourLibrary.click();
        Thread.sleep(5000);
        libraryScreen.setCreatePlaylist(nameLibrary);

        Assertions.assertEquals(nameLibrary,pLayListScreen.getNamePLaylist(nameLibrary).getText(), "ERROR al crear la playlist");

        pLayListScreen.optionsPlaylistWithoutMusic.click();
        optionsPlaylistWithoutMusicSection.EditPlaylist.click();
        Thread.sleep(2000);
        editPLaylistScreen.updameName.clearSetText(nameLibraryUpdate);
        editPLaylistScreen.saveUpdate.click();

        Assertions.assertEquals(nameLibraryUpdate,pLayListScreen.getNamePLaylist(nameLibraryUpdate).getText(), "ERROR al actualizar la playlist");
    }
}
