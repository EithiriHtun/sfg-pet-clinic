package spring.web.app.springwepapp.Respositories;

import org.springframework.data.repository.CrudRepository;
import spring.web.app.springwepapp.Model.Pet;

public interface PetRepository extends CrudRepository<Pet, Long> {
}
