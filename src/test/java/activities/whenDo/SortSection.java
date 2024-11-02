package activities.whenDo;

import controls.Button;
import org.openqa.selenium.By;

public class SortSection {
    public Button optionAlphabetic = new Button(By.xpath("//android.widget.CheckedTextView[@resource-id=\"android:id/text1\" and @text=\"Alphabetic\"]"));
    public Button optionOrder = new Button(By.xpath("//android.widget.CheckedTextView[@resource-id=\"android:id/text1\" and @text=\"Order\"]"));
    public Button optionDueDate = new Button(By.xpath("//android.widget.CheckedTextView[@resource-id=\"android:id/text1\" and @text=\"Due date\"]"));
    public Button optionUrget = new Button(By.xpath("//android.widget.CheckedTextView[@resource-id=\"android:id/text1\" and @text=\"Urgent\"]"));

}
