package activities.spotify;

import controls.Button;
import org.openqa.selenium.By;

public class FooterSeccion {

    public Button home = new Button(By.xpath("//android.widget.ImageView[@content-desc=\"Home\"]"));
    public Button search = new Button(By.xpath("//android.widget.ImageView[@content-desc=\"Search\"]"));
    public Button yourLibrary = new Button(By.xpath("//android.widget.ImageView[@content-desc=\"Your Library\"]"));
    public Button premium = new Button(By.xpath("//android.widget.ImageView[@content-desc=\"Premium\"]"));

}
