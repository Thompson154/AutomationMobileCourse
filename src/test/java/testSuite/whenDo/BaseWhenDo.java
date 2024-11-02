package testSuite.whenDo;

import activities.whenDo.CreateTaskScreen;
import activities.whenDo.MainScreen;
import activities.whenDo.SortSection;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import session.Session;

public class BaseWhenDo {
    SortSection sortSection = new SortSection();
    MainScreen mainScreen = new MainScreen();
    CreateTaskScreen createTaskScreen = new CreateTaskScreen();

    @BeforeEach
    public void before() {}

    @AfterEach
    public void after() {
        Session.getInstance().closeApp();
    }
}
