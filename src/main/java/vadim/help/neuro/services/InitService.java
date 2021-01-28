package vadim.help.neuro.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;
import vadim.help.neuro.jpa.models.Account;
import vadim.help.neuro.jpa.models.Animal;
import vadim.help.neuro.jpa.repository.AccountRepository;
import vadim.help.neuro.jpa.repository.AnimalRepository;

@Component
public class InitService {

    @Autowired
    AccountRepository accountRepository;
    @Autowired
    AnimalRepository animalRepository;

    @EventListener(ApplicationReadyEvent.class) // убрать после отключения in-memory h2, переходе на постгре, мускуль
    public void init() {
        accountRepository.save(new Account(1L, "admin", "admin"));
        accountRepository.save(new Account(2L, "test", "test"));
        accountRepository.save(new Account(3L, "123", "123"));

        animalRepository.save(new Animal(4L, "Медведь"));
        animalRepository.save(new Animal(5L, "Волчара"));
    }
}
