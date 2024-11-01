package testSuite.whenDo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DeleteTaskTest extends BaseWhenDo {

    @Test
    public void deleteTask() {
        String Title = "Thompson";
        String Description = "This is a thompson task";

        mainScreen.addTask.click();
        createTaskScreen.createTask(Title, Description);
        mainScreen.getTaskLabel(Title).click();
        deleteTaskScreen.deleteTask();

        Assertions.assertFalse(mainScreen.getTaskLabel(Title).isControlDisplayed());
    }
}
