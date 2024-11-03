package testSuite.spotify;

import activities.spotify.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import session.Session;

public class BaseSpotify {
    StartScreen startScreen = new StartScreen();
    HomeScreen homeScreen = new HomeScreen();
    GoogleAccountsSection googleAccountsSection = new GoogleAccountsSection();
    HeaderSection headerSection = new HeaderSection();
    FooterSeccion footerSection = new FooterSeccion();
    LibraryScreen libraryScreen = new LibraryScreen();
    PLayListScreen pLayListScreen = new PLayListScreen();
    OptionsPlaylistSection optionsPlaylistSection = new OptionsPlaylistSection();
    OptionsPlaylistWithoutMusicSection optionsPlaylistWithoutMusicSection = new OptionsPlaylistWithoutMusicSection();
    EditPLaylistScreen editPLaylistScreen = new EditPLaylistScreen();

    @BeforeEach
    public void before() {}

    @AfterEach
    public void after() {
        Session.getInstance().closeApp();
    }
}
