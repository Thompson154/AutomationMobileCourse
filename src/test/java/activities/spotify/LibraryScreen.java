package activities.spotify;

import controls.Button;
import controls.TextBox;
import org.openqa.selenium.By;

public class LibraryScreen {

    public Button createLibrary = new Button(By.xpath("//android.widget.Button[@content-desc=\"Create playlist\"]"));
    public Button createPlaylist  = new Button(By.xpath("//android.view.ViewGroup[@resource-id=\"com.spotify.music:id/create_playlist_row\"]"));
    public TextBox setNamePlaylist = new TextBox(By.xpath("//android.widget.EditText[@text=\"My playlist #1\"]/android.view.View[2]"));
    public Button confirmCreatePlaylist = new Button(By.xpath("//androidx.compose.ui.platform.ComposeView[@resource-id=\"com.spotify.music:id/compose_view\"]/android.view.View/android.view.View[2]/android.widget.Button"));

    public void setCreatePlaylist(String namePlaylist){
        createLibrary.click();
        createPlaylist.click();
        setNamePlaylist.setText(namePlaylist);
        confirmCreatePlaylist.click();
    }

}
