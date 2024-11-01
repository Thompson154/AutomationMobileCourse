package testSuite.whenDo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UpdateTaskTest extends BaseWhenDo{

    @Test
    public void updateTask() {
        String Title = "Thompson";
        String Description = "This is a thompson task";

        mainScreen.addTask.click();
        createTaskScreen.createTask(Title, Description);
        mainScreen.getTaskLabel(Title).click();

        String TitleUpdate = "ThompsonUpdate";
        String DescriptionUpdate = "This is a thompson task Updated";

        updateTaskScreen.updateTitle.clearSetText(TitleUpdate);
        updateTaskScreen.updateDescription.clearSetText(DescriptionUpdate);
        updateTaskScreen.submitUpdate.click();

        Assertions.assertEquals(TitleUpdate, mainScreen.getTaskLabel(TitleUpdate).getText(),"Error with Update Task");
    }

}
