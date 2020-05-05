package spring.web.app.springwepapp.Respositories;

import org.springframework.data.repository.CrudRepository;
import spring.web.app.springwepapp.Model.PetType;

public interface PetTypeRepository extends CrudRepository<PetType, Long> {
}
