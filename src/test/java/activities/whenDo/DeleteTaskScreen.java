package activities.whenDo;

import controls.Button;
import org.openqa.selenium.By;

public class DeleteTaskScreen {
    public Button delete = new Button(By.xpath("//android.widget.TextView[@content-desc=\"Delete\"]"));
    public Button confirmDelete = new Button(By.xpath("//android.widget.Button[@resource-id=\"android:id/button1\"]"));

    public void deleteTask(){
        delete.click();
        confirmDelete.click();
    }
}
