package activities.spotify;

import controls.Button;
import org.openqa.selenium.By;

public class HomeScreen {

    public Button laterButton = new Button(By.xpath("//android.widget.Button[@resource-id=\"com.spotify.music:id/later_button\"]"));
}
