package vadim.help.neuro.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vadim.help.neuro.jpa.models.Account;
import vadim.help.neuro.jpa.repository.AccountRepository;

import java.util.Optional;

@Service
public class UserService {

    @Autowired
    AccountRepository accountRepository;

    public Integer register(String login, String password) {
        Optional<Account> userExist = accountRepository.findAccountByLogin(login);
        if (userExist.isPresent()) return 1;
        try {
            accountRepository.save(new Account(null, login, password)); ////////////
        } catch (Exception e) {
            e.printStackTrace();
            return 2;
        }
        return 0;
    }

}
