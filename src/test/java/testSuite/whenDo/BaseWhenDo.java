package testSuite.whenDo;

import activities.whenDo.CreateTaskScreen;
import activities.whenDo.DeleteTaskScreen;
import activities.whenDo.MainScreen;
import activities.whenDo.UpdateTaskScreen;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import session.Session;

public class BaseWhenDo {
    MainScreen mainScreen = new MainScreen();
    CreateTaskScreen createTaskScreen = new CreateTaskScreen();
    UpdateTaskScreen updateTaskScreen = new UpdateTaskScreen();
    DeleteTaskScreen deleteTaskScreen = new DeleteTaskScreen();


    @BeforeEach
    public void before() {}

    @AfterEach
    public void after() {
        Session.getInstance().closeApp();
    }
}
