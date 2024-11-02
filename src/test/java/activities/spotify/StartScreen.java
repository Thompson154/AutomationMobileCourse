package activities.spotify;

import controls.Button;
import org.openqa.selenium.By;

public class StartScreen {
    GoogleAccountsSection googleAccountsSection = new GoogleAccountsSection();

    public Button withGoogle = new Button(By.xpath("//android.widget.Button[@text=\"Continue with Google\"]"));
    public Button withFacebook = new Button(By.xpath("//android.widget.Button[@text=\"Continue with Facebook\"]"));
    public Button SignUpFree = new Button(By.xpath("//android.widget.Button[@text=\"Sign up free\"]"));
    public Button LogIn = new Button(By.xpath("//android.widget.Button[@text=\"Log in\"]"));

    public void LogIn(){
        withGoogle.click();
        googleAccountsSection.EnableAccount.click();
    }
}
