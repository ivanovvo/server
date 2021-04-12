package vadim.help.neuro.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import vadim.help.neuro.controllers.dto.RegisterDto;
import vadim.help.neuro.services.UserService;

@Controller
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("/login")
    public ResponseEntity login() {
         return ResponseEntity.ok("logged");
    }

    @RequestMapping("/register")
    public ResponseEntity register(@RequestBody RegisterDto credits) {
        switch (userService.register(credits.getLogin(), credits.getPassword())) {
            case 0:
                return ResponseEntity.ok("User created");
            case 1:
                return ResponseEntity.badRequest().body("User exist");
            case 2:
                return ResponseEntity.badRequest().body("Unknown error");
            default:
                return ResponseEntity.noContent().build();
        }
    }

}
