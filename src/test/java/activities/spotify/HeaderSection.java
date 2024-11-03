package activities.spotify;

import controls.Button;
import org.openqa.selenium.By;

public class HeaderSection {

    public Button Perfil = new Button(By.xpath("//android.widget.ImageView[@content-desc=\"Profile\"]"));
    public Button All = new Button(By.xpath("//androidx.compose.ui.platform.ComposeView[@resource-id=\"com.spotify.music:id/filter_chips_container\"]/android.view.View/android.view.View/android.view.View[3]/android.widget.Button"));
    public Button Music = new Button(By.xpath("//androidx.compose.ui.platform.ComposeView[@resource-id=\"com.spotify.music:id/filter_chips_container\"]/android.view.View/android.view.View/android.view.View[2]/android.widget.Button"));
    public Button Podcast = new Button(By.xpath("//androidx.compose.ui.platform.ComposeView[@resource-id=\"com.spotify.music:id/filter_chips_container\"]/android.view.View/android.view.View/android.view.View[1]/android.widget.Button"));
}
