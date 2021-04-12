package vadim.help.neuro.jpa.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import vadim.help.neuro.jpa.models.Account;

import java.util.Optional;

@Repository
public interface AccountRepository extends CrudRepository<Account, Long> {

    public Optional<Account> findAccountByLogin(String login); //////////

}
