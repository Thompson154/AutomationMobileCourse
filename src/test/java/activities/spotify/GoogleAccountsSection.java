package activities.spotify;

import controls.Button;
import org.openqa.selenium.By;

public class GoogleAccountsSection {

    public Button EnableAccount = new Button(By.xpath("(//android.widget.LinearLayout[@resource-id=\"com.google.android.gms:id/container\"])[1]"));

}
