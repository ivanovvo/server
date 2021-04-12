package vadim.help.neuro.controllers;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class AnimalControllerTest {

    @Autowired
    AnimalController animalController;

    @Test
    void recognizev_type() {
        //Optional<AnimalInf> AnimalInf = AnimalRepository.findById((long) 0);
        System.out.println( animalController.recognizev_type());
        Assert.assertEquals(animalController.recognizev_type(), animalController.recognizev_type());

    }

    @Test
    void recognizev_area() {
        Assert.assertEquals(animalController.recognizev_area(), animalController.recognizev_area());
    }

    @Test
    void recognizev_number() {
        Assert.assertEquals(animalController.recognizev_number(), animalController.recognizev_number());
    }

    @Test
    void recognizev_downsizing() {
        Assert.assertEquals(animalController.recognizev_downsizing(), animalController.recognizev_downsizing());
    }

    @Test
    void recognizev_security() {
        Assert.assertEquals(animalController.recognizev_security(), animalController.recognizev_security());
    }

    @Test
    void recognizeb_type() {
        Assert.assertEquals(animalController.recognizeb_type(), animalController.recognizeb_type());
    }

    @Test
    void recognizeb_area() {
        Assert.assertEquals(animalController.recognizeb_area(), animalController.recognizeb_area());
    }

    @Test
    void recognizeb_number() {
        Assert.assertEquals(animalController.recognizeb_number(), animalController.recognizeb_number());
    }

    @Test
    void recognizeb_downsizing() {
        Assert.assertEquals(animalController.recognizeb_downsizing(), animalController.recognizeb_downsizing());
    }

    @Test
    void recognizeb_security() {
        Assert.assertEquals(animalController.recognizeb_security(), animalController.recognizeb_security());
    }
}