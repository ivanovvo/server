package vadim.help.neuro.jpa.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import vadim.help.neuro.jpa.models.AnimalInf;

@Repository
public interface AnimalRepository extends CrudRepository<AnimalInf, Long> {
}
