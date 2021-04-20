package vadim.help.neuro.services;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class UserServiceTest {
    @Autowired
    UserService userService;

    @Test
    void register() {
        //String log1 = "t_7";
        //String pass1 = "t_7";

        //String t1 = String.valueOf(userService.register(log1, pass1));

        //Assert.assertEquals("0", t1);

        String log2 = "t_2";
        String pass2 = "t_2";

        String t2 = String.valueOf(userService.register(log2, pass2));

        Assert.assertEquals("1", t2);

        String log3 = null;
        String pass3 = null;

        String t3 = String.valueOf(userService.register(log3, pass3));

        Assert.assertEquals("2", t3);
    }
}
