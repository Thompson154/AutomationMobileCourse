package activities.spotify;

import controls.Button;
import org.openqa.selenium.By;

public class OptionsPlaylistWithoutMusicSection {

    public Button ListenToMusicAdFree = new Button(By.xpath("//androidx.recyclerview.widget.RecyclerView[@resource-id=\"com.spotify.music:id/context_menu_rows\"]/android.view.ViewGroup[1]"));
    public Button EditPlaylist = new Button(By.xpath("//androidx.recyclerview.widget.RecyclerView[@resource-id=\"com.spotify.music:id/context_menu_rows\"]/android.view.ViewGroup[2]"));
    public Button DeletPlaylist = new Button(By.xpath("//androidx.recyclerview.widget.RecyclerView[@resource-id=\"com.spotify.music:id/context_menu_rows\"]/android.view.ViewGroup[3]"));
    public Button Share = new Button(By.xpath("//androidx.recyclerview.widget.RecyclerView[@resource-id=\"com.spotify.music:id/context_menu_rows\"]/android.view.ViewGroup[4]"));
    public Button InviteCollaborators = new Button(By.xpath("//androidx.recyclerview.widget.RecyclerView[@resource-id=\"com.spotify.music:id/context_menu_rows\"]/android.view.ViewGroup[5]"));
    public Button RemoveFromProfile = new Button(By.xpath("//androidx.recyclerview.widget.RecyclerView[@resource-id=\"com.spotify.music:id/context_menu_rows\"]/android.view.ViewGroup[6]"));
    public Button Makeprivate = new Button(By.xpath("//androidx.recyclerview.widget.RecyclerView[@resource-id=\"com.spotify.music:id/context_menu_rows\"]/android.view.ViewGroup[7]"));
    public Button ExcludeFromYourTasteProfile = new Button(By.xpath("//androidx.recyclerview.widget.RecyclerView[@resource-id=\"com.spotify.music:id/context_menu_rows\"]/android.view.ViewGroup[8]"));
    public Button ShowSpotifyCode = new Button(By.xpath("//androidx.recyclerview.widget.RecyclerView[@resource-id=\"com.spotify.music:id/context_menu_rows\"]/android.view.ViewGroup[9]"));

    public Button confirmDelete = new Button(By.xpath("//android.widget.Button[@resource-id=\"android:id/button1\"]"));

    public void delete(){
        DeletPlaylist.click();
        confirmDelete.click();
    }
}
