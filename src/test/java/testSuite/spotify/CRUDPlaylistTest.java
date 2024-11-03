package testSuite.spotify;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CRUDPlaylistTest extends BaseSpotify{

    @Test
    public void CRUDPlaylistTest() throws InterruptedException {
        String nameLibrary = "ThompsonLibrary";
        String nameLibraryUpdate = "ThompsonLibraryUpdate";
        startScreen.LogIn();
        Thread.sleep(5000);
        homeScreen.laterButton.click();
        Assertions.assertTrue(headerSection.Perfil.isControlDisplayed());

        footerSection.yourLibrary.click();
        Thread.sleep(5000);
        libraryScreen.setCreatePlaylist(nameLibrary);
        Thread.sleep(2000);
        Assertions.assertEquals(nameLibrary,pLayListScreen.getNamePLaylist(nameLibrary).getText(), "ERROR al crear la playlist");

        pLayListScreen.optionsPlaylistWithoutMusic.click();
        optionsPlaylistWithoutMusicSection.EditPlaylist.click();
        editPLaylistScreen.updatePLaylistName(nameLibraryUpdate);
        Assertions.assertEquals(nameLibraryUpdate,pLayListScreen.getNamePLaylist(nameLibraryUpdate).getText(), "ERROR al actualizar la playlist");

        pLayListScreen.optionsPlaylistWithoutMusic.click();
        optionsPlaylistWithoutMusicSection.delete();
        Assertions.assertFalse(pLayListScreen.getNamePLaylist(nameLibraryUpdate).isControlDisplayed(), "ERROR al eliminar la playlist");
    }


}
