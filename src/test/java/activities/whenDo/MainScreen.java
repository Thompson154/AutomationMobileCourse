package activities.whenDo;

import controls.Button;
import controls.Label;
import org.openqa.selenium.By;

public class MainScreen {
    public Button addTask = new Button(By.xpath("//android.widget.ImageButton[@resource-id=\"com.vrproductiveapps.whendo:id/fab\"]"));

    public Label getTaskLabel(String name) {
        Label projectLabel = new Label(By.xpath("//android.widget.ListView[@resource-id=\"com.vrproductiveapps.whendo:id/notesList\"]//android.widget.TextView[@resource-id=\"com.vrproductiveapps.whendo:id/home_list_item_text\" and @text='"+name+"'][1]\n"));
        return projectLabel;
    }
}
