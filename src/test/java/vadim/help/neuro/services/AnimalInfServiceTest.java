package vadim.help.neuro.services;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import vadim.help.neuro.jpa.models.AnimalInf;
import vadim.help.neuro.jpa.repository.AnimalRepository;

import java.util.Optional;

@RunWith(SpringRunner.class)
@SpringBootTest
class AnimalInfServiceTest {
    @Autowired
    AnimalRepository animalRepository;
    @Autowired
    AnimalInfService animalInfService;

    @Test
    void recognizev_type() {
        Optional<AnimalInf> AnimalInf = animalRepository.findById((long) 1);
        Assert.assertEquals(AnimalInf.get().getInf_of_type(), animalInfService.recognizev_type());
    }

    @Test
    void recognizev_area() {
        Optional<AnimalInf> AnimalInf = animalRepository.findById((long) 1);
        Assert.assertEquals(AnimalInf.get().getInf_of_area(), animalInfService.recognizev_area());
    }

    @Test
    void recognizev_number() {
        Optional<AnimalInf> AnimalInf = animalRepository.findById((long) 1);
        Assert.assertEquals(AnimalInf.get().getInf_of_number(), animalInfService.recognizev_number());
    }

    @Test
    void recognizev_downsizing() {
        Optional<AnimalInf> AnimalInf = animalRepository.findById((long) 1);
        Assert.assertEquals(AnimalInf.get().getInf_of_downsizing(), animalInfService.recognizev_downsizing());
    }

    @Test
    void recognizev_security() {
        Optional<AnimalInf> AnimalInf = animalRepository.findById((long) 1);
        Assert.assertEquals(AnimalInf.get().getInf_of_security(), animalInfService.recognizev_security());
    }

    @Test
    void recognizeb_type() {
        Optional<AnimalInf> AnimalInf = animalRepository.findById((long) 0);
        Assert.assertEquals(AnimalInf.get().getInf_of_type(), animalInfService.recognizeb_type());
    }

    @Test
    void recognizeb_area() {
        Optional<AnimalInf> AnimalInf = animalRepository.findById((long) 0);
        Assert.assertEquals(AnimalInf.get().getInf_of_area(), animalInfService.recognizeb_area());
    }

    @Test
    void recognizeb_number() {
        Optional<AnimalInf> AnimalInf = animalRepository.findById((long) 0);
        Assert.assertEquals(AnimalInf.get().getInf_of_number(), animalInfService.recognizeb_number());
    }

    @Test
    void recognizeb_downsizing() {
        Optional<AnimalInf> AnimalInf = animalRepository.findById((long) 0);
        Assert.assertEquals(AnimalInf.get().getInf_of_downsizing(), animalInfService.recognizeb_downsizing());
    }

    @Test
    void recognizeb_security() {
        Optional<AnimalInf> AnimalInf = animalRepository.findById((long) 0);
        Assert.assertEquals(AnimalInf.get().getInf_of_downsizing(), animalInfService.recognizeb_downsizing());
    }
}