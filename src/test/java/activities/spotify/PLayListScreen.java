package activities.spotify;

import controls.Button;
import controls.Label;
import org.openqa.selenium.By;

public class PLayListScreen {

    public Button addMusic = new Button(By.xpath("//android.widget.Button[@resource-id=\"com.spotify.music:id/action_button\"]"));
    public Button optionsPlaylistWithoutMusic = new Button(By.xpath("//androidx.compose.ui.platform.ComposeView[@resource-id=\"com.spotify.music:id/actions_slot\"]/android.view.View/android.view.View/android.widget.Button"));
    public Button optionsPlaylist = new Button(By.xpath("//androidx.compose.ui.platform.ComposeView[@resource-id=\"com.spotify.music:id/actions_slot\"]/android.view.View/android.view.View[2]/android.widget.Button"));
    public Button closePlaylits = new Button(By.xpath("//android.widget.Button[@content-desc=\"Close\"]"));

    public void addNumberMusic(int numbersMusic) throws InterruptedException {
        addMusic.click();
        for (int i = 1; i <= numbersMusic; i++) {
            Button selectToAdd = new Button(By.xpath("(//android.widget.ImageButton[@content-desc=\"Add item\"])[1]"));
            selectToAdd.click();
            Thread.sleep(2000);
        }
    }

    public Label getNamePLaylist(String namePlaylist){
        Label namePLayList = new Label(By.xpath("//android.widget.TextView[@resource-id=\"com.spotify.music:id/title\" and @text=\""+namePlaylist+"\"]"));
        return namePLayList;
    }
}
