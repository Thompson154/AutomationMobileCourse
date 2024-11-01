package activities.whenDo;

import controls.Button;
import controls.TextBox;
import org.openqa.selenium.By;

public class UpdateTaskScreen {

    public TextBox updateTitle = new TextBox(By.xpath("//android.widget.EditText[@resource-id=\"com.vrproductiveapps.whendo:id/noteTextTitle\"]"));
    public TextBox updateDescription = new TextBox(By.xpath("//android.widget.EditText[@resource-id=\"com.vrproductiveapps.whendo:id/noteTextNotes\"]"));
    public Button submitUpdate = new Button(By.xpath("//android.widget.TextView[@content-desc=\"Save\"]"));

    public void updateTask(String title, String description) {
        updateTitle.clearSetText(title);
        updateDescription.clearSetText(description);
        submitUpdate.click();
    }
}
