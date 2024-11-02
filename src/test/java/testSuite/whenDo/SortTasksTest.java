package testSuite.whenDo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SortTasksTest extends BaseWhenDo{

    @Test
    public void testSortTasks() {
        String firstTaskT = "Armando";
        String firstDescriptionT = "Antagonista";
        String secondTaskT = "Caballo";
        String secondDescriptionT = "Corredor";

        mainScreen.addTask.click();
        createTaskScreen.createTask(firstTaskT, firstDescriptionT);
        mainScreen.addTask.click();
        createTaskScreen.createTask(secondTaskT, secondDescriptionT);
        mainScreen.sortTasks.click();

        sortSection.optionAlphabetic.click();

        Assertions.assertEquals(firstTaskT,mainScreen.getTaskLabel(firstTaskT).getText(), "ERRO al ordenar alfabeticamente");
    }
}
