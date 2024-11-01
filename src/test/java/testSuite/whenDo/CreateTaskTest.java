package testSuite.whenDo;

import activities.whenDo.CreateTaskScreen;
import activities.whenDo.MainScreen;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CreateTaskTest extends BaseWhenDo{


    @Test
    public void createTask() {
        String Title = "TitleThompson";
        String Description = "DescriptionThompson";

        mainScreen.addTask.click();
        createTaskScreen.addTitle.setText(Title);
        createTaskScreen.addDescription.setText(Description);
        createTaskScreen.submit.click();

        String TitleMainScreen = mainScreen.getTaskLabel(Title).getText();

        Assertions.assertEquals(TitleMainScreen, Title, "Error, no se creo el task correctamente");
    }


}
