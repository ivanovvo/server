package vadim.help.neuro.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vadim.help.neuro.jpa.models.AnimalInf;
import vadim.help.neuro.jpa.repository.AnimalRepository;

import java.util.Optional;

@Service
public class AnimalInfService {

    @Autowired
    AnimalRepository AnimalRepository;

    public String recognizev_type() {
        Optional<AnimalInf> AnimalInf = AnimalRepository.findById((long) 1);

        return AnimalInf.get().getInf_of_type();
    }
    public String recognizev_area() {
        Optional<AnimalInf> AnimalInf = AnimalRepository.findById((long) 1);

        return AnimalInf.get().getInf_of_area();
    }
    public String recognizev_number() {
        Optional<AnimalInf> AnimalInf = AnimalRepository.findById((long) 1);

        return AnimalInf.get().getInf_of_number();
    }
    public String recognizev_downsizing() {
        Optional<AnimalInf> AnimalInf = AnimalRepository.findById((long) 1);

        return AnimalInf.get().getInf_of_downsizing();
    }
    public String recognizev_security() {
        Optional<AnimalInf> AnimalInf = AnimalRepository.findById((long) 1);

        return AnimalInf.get().getInf_of_security();
    }

    public String recognizeb_type() {
        Optional<AnimalInf> AnimalInf = AnimalRepository.findById((long) 0);

        return AnimalInf.get().getInf_of_type();
    }
    public String recognizeb_area() {
        Optional<AnimalInf> AnimalInf = AnimalRepository.findById((long) 0);

        return AnimalInf.get().getInf_of_area();
    }
    public String recognizeb_number() {
        Optional<AnimalInf> AnimalInf = AnimalRepository.findById((long) 0);

        return AnimalInf.get().getInf_of_number();
    }
    public String recognizeb_downsizing() {
        Optional<AnimalInf> AnimalInf = AnimalRepository.findById((long) 0);

        return AnimalInf.get().getInf_of_downsizing();
    }
    public String recognizeb_security() {
        Optional<AnimalInf> AnimalInf = AnimalRepository.findById((long) 0);

        return AnimalInf.get().getInf_of_security();
    }
}
