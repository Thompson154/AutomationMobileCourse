package activities.whenDo;

import controls.Button;
import controls.TextBox;
import org.openqa.selenium.By;

public class CreateTaskScreen {
    public TextBox addTitle = new TextBox(By.xpath("//android.widget.EditText[@resource-id=\"com.vrproductiveapps.whendo:id/noteTextTitle\"]"));
    public TextBox addDescription = new TextBox(By.xpath("//android.widget.EditText[@resource-id=\"com.vrproductiveapps.whendo:id/noteTextNotes\"]"));
    public Button submit = new Button(By.xpath("//android.widget.TextView[@content-desc=\"Save\"]"));

    public void createTask(String title, String description) {
        addTitle.setText(title);
        addDescription.setText(description);
        submit.click();
    }
}
