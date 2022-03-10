import app.App;
import app.model.User;
import app.service.UserServiceImpl;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import java.util.*; 

@SpringBootTest(classes = App.class)
public class UserServiceImplTest {

    @Autowired
    UserServiceImpl userService;

    @Test
    public void queryAll() {
        userService.queryAll().forEach(System.out::println);
    }


}