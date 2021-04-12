package vadim.help.neuro.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import vadim.help.neuro.jpa.repository.AccountRepository;
import vadim.help.neuro.jpa.repository.AnimalRepository;

@Component
public class InitService {

    @Autowired
    AccountRepository accountRepository;
    @Autowired
    AnimalRepository animalRepository;

    //@EventListener(ApplicationReadyEvent.class)
    //public void init() {



        //System.out.println("1");
        //accountRepository.save(new Account("1","admin", "admin"));
        //accountRepository.save(new Account(2L, "test", "test"));
       // accountRepository.save(new Account(3L, "123", "123"));

       // animalRepository.save(new AnimalInf(4L, "Медведь"));
       // animalRepository.save(new Animal(5L, "Волчара"));
    //}
}
