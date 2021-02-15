package vadim.help.neuro.jpa.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import vadim.help.neuro.jpa.models.NameOfType;

@Repository
public interface NameOfTypeRepository extends CrudRepository<NameOfType, Long> {
}
