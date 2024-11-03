package testSuite.spotify;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DeletePlaylistTest extends BaseSpotify{

    @Test
    public void testDeletePlaylist() throws InterruptedException {

        String nameLibrary = "ThompsonLibrary";
        startScreen.LogIn();
        Thread.sleep(5000);
        homeScreen.laterButton.click();
        Assertions.assertTrue(headerSection.Perfil.isControlDisplayed());

        footerSection.yourLibrary.click();
        Thread.sleep(5000);
        libraryScreen.setCreatePlaylist(nameLibrary);
        Assertions.assertEquals(nameLibrary,pLayListScreen.getNamePLaylist(nameLibrary).getText(), "ERROR al crear la playlist");

        pLayListScreen.optionsPlaylistWithoutMusic.click();
        optionsPlaylistWithoutMusicSection.DeletPlaylist.click();
        optionsPlaylistWithoutMusicSection.confirmDelete.click();
        Assertions.assertFalse(pLayListScreen.getNamePLaylist(nameLibrary).isControlDisplayed(), "ERROR al eliminar la playlist");


    }
}
