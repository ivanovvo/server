package vadim.help.neuro.controllers;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;
import vadim.help.neuro.controllers.dto.RegisterDto;
import vadim.help.neuro.services.UserService;

@RunWith(SpringRunner.class)
@Import({UserController.class, UserService.class})
@SpringBootTest
class UserControllerTest {
    @Autowired
    UserController userController;



    @Test
    void register() {
        RegisterDto registerDto1 = new RegisterDto();
        RegisterDto registerDto2 = new RegisterDto();
        RegisterDto registerDto3 = new RegisterDto();
        //registerDto1.setLogin("tttrrr");
        //registerDto1.setPassword("tttrrr");

        //ResponseEntity<String> isUserCreated1 = userController.register(registerDto1);
        //System.out.println(isUserCreated1.getBody());

        //Assert.assertEquals("User created", isUserCreated1.getBody());

        registerDto2.setLogin("t");
        registerDto2.setPassword("t");

        ResponseEntity<String> isUserCreated2 = userController.register(registerDto2);

        Assert.assertEquals("User exist", isUserCreated2.getBody());

        registerDto3.setLogin(null);
        registerDto3.setPassword(null);

        ResponseEntity<String> isUserCreated3 = userController.register(registerDto3);

        Assert.assertEquals("Unknown error", isUserCreated3.getBody());
    }

    @Test
    void login() {
        Assert.assertEquals(ResponseEntity.ok("logged"), userController.login());
    }
}
