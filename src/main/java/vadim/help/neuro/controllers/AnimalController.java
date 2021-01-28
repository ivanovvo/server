package vadim.help.neuro.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;
import vadim.help.neuro.services.AnimalService;

@Controller
@RequestMapping("/animal")
public class AnimalController {

    @Autowired
    AnimalService animalService;

    @PostMapping("/recognize")
    public ResponseEntity recognize(MultipartFile file) {
        return ResponseEntity.ok(animalService.recognize(file));
    }

}
