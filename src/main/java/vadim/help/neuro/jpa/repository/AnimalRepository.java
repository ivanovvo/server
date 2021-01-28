package vadim.help.neuro.jpa.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import vadim.help.neuro.jpa.models.Animal;

@Repository
public interface AnimalRepository extends CrudRepository<Animal, Long> {
}
