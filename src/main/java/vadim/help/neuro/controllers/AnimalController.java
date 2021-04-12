package vadim.help.neuro.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;
import vadim.help.neuro.services.AnimalInfService;
import vadim.help.neuro.services.AnimalService;

@Controller
@RequestMapping("/animal")
public class AnimalController {

    @Autowired
    AnimalService animalService;

    @Autowired
    AnimalInfService animalInfService;

    @PostMapping("/recognize")
    public ResponseEntity recognize(MultipartFile file) {
        return ResponseEntity.ok(animalService.recognize(file));
    }

    @PostMapping("/infv_type")
    public ResponseEntity recognizev_type() {
        return ResponseEntity.ok(animalInfService.recognizev_type());
    }
    @PostMapping("/infv_area")
    public ResponseEntity recognizev_area() {
        return ResponseEntity.ok(animalInfService.recognizev_area());
    }
    @PostMapping("/infv_number")
    public ResponseEntity recognizev_number() {
        return ResponseEntity.ok(animalInfService.recognizev_number());
    }
    @PostMapping("/infv_downsizing")
    public ResponseEntity recognizev_downsizing() {
        return ResponseEntity.ok(animalInfService.recognizev_downsizing());
    }
    @PostMapping("/infv_security")
    public ResponseEntity recognizev_security() {
        return ResponseEntity.ok(animalInfService.recognizev_security());
    }

    @PostMapping("/infb_type")
    public ResponseEntity recognizeb_type() {
        return ResponseEntity.ok(animalInfService.recognizeb_type());
    }
    @PostMapping("/infb_area")
    public ResponseEntity recognizeb_area() {
        return ResponseEntity.ok(animalInfService.recognizeb_area());
    }
    @PostMapping("/infb_number")
    public ResponseEntity recognizeb_number() {
        return ResponseEntity.ok(animalInfService.recognizeb_number());
    }
    @PostMapping("/infb_downsizing")
    public ResponseEntity recognizeb_downsizing() {
        return ResponseEntity.ok(animalInfService.recognizeb_downsizing());
    }
    @PostMapping("/infb_security")
    public ResponseEntity recognizeb_security() {
        return ResponseEntity.ok(animalInfService.recognizeb_security());
    }

}
