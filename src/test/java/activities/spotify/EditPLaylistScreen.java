package activities.spotify;

import controls.Button;
import controls.TextBox;
import org.openqa.selenium.By;

public class EditPLaylistScreen {
    public TextBox updameName = new TextBox(By.xpath("//android.widget.EditText[@resource-id=\"com.spotify.music:id/title_edit_text\"]"));
    public Button saveUpdate = new Button(By.xpath("//android.widget.TextView[@text=\"Save\"]"));

    public void updatePLaylistName(String newName) {
        updameName.setText(newName);
        saveUpdate.click();
    }
}
