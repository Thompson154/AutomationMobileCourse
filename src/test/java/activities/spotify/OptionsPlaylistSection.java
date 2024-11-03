package activities.spotify;

import controls.Button;
import org.openqa.selenium.By;

public class OptionsPlaylistSection {

    public Button AddToPlaylist = new Button(By.xpath("//androidx.recyclerview.widget.RecyclerView[@resource-id=\"com.spotify.music:id/context_menu_rows\"]/android.view.ViewGroup[1]"));
    public Button EditPlaylist = new Button(By.xpath("//androidx.recyclerview.widget.RecyclerView[@resource-id=\"com.spotify.music:id/context_menu_rows\"]/android.view.ViewGroup[2]"));
    public Button DeletPlaylit = new Button(By.xpath("//androidx.recyclerview.widget.RecyclerView[@resource-id=\"com.spotify.music:id/context_menu_rows\"]/android.view.ViewGroup[3]"));
    public Button AddToQueue = new Button(By.xpath("//androidx.recyclerview.widget.RecyclerView[@resource-id=\"com.spotify.music:id/context_menu_rows\"]/android.view.ViewGroup[4]"));
    public Button AddAnothePlaylist = new Button(By.xpath("//androidx.recyclerview.widget.RecyclerView[@resource-id=\"com.spotify.music:id/context_menu_rows\"]/android.view.ViewGroup[5]"));
    public Button Share = new Button(By.xpath("//androidx.recyclerview.widget.RecyclerView[@resource-id=\"com.spotify.music:id/context_menu_rows\"]/android.view.ViewGroup[6]"));
    public Button InviteCollaborators = new Button(By.xpath("//androidx.recyclerview.widget.RecyclerView[@resource-id=\"com.spotify.music:id/context_menu_rows\"]/android.view.ViewGroup[7]"));
    public Button RemoveFromProfile = new Button(By.xpath("//androidx.recyclerview.widget.RecyclerView[@resource-id=\"com.spotify.music:id/context_menu_rows\"]/android.view.ViewGroup[8]"));
    public Button Makeprivate = new Button(By.xpath("//androidx.recyclerview.widget.RecyclerView[@resource-id=\"com.spotify.music:id/context_menu_rows\"]/android.view.ViewGroup[9]"));
    public Button ExcludeFromYourTasteProfile = new Button(By.xpath("//androidx.recyclerview.widget.RecyclerView[@resource-id=\"com.spotify.music:id/context_menu_rows\"]/android.view.ViewGroup[10]"));
    public Button ShowSpotifyCode = new Button(By.xpath("//androidx.recyclerview.widget.RecyclerView[@resource-id=\"com.spotify.music:id/context_menu_rows\"]/android.view.ViewGroup[11]"));

    public Button confirmDelete = new Button(By.xpath("//android.widget.Button[@resource-id=\"android:id/button1\"]"));
}
