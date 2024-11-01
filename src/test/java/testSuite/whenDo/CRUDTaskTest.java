package testSuite.whenDo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CRUDTaskTest extends BaseWhenDo{


    @Test
    public void CRUDTaskTest() {
        String Title = "TitleThompson";
        String Description = "DescriptionThompson";

        mainScreen.addTask.click();
        createTaskScreen.createTask(Title, Description);
        Assertions.assertEquals(Title, Title, "Error, no se creo el task correctamente");

        String TitleUpdate = "ThompsonUpdate";
        String DescriptionUpdate = "This is a thompson task Updated";

        mainScreen.getTaskLabel(Title).click();
        updateTaskScreen.updateTask(TitleUpdate, DescriptionUpdate);
        Assertions.assertEquals(TitleUpdate, mainScreen.getTaskLabel(TitleUpdate).getText(),"Error with Update Task");

        mainScreen.getTaskLabel(TitleUpdate).click();
        deleteTaskScreen.deleteTask();
        Assertions.assertFalse(mainScreen.getTaskLabel(Title).isControlDisplayed()); //Buscar una mejor forma de verificar ya que tarda mucho

    }
}
