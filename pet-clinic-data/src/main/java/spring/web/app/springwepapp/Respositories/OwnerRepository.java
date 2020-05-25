package spring.web.app.springwepapp.Respositories;

import org.springframework.data.repository.CrudRepository;
import spring.web.app.springwepapp.Model.Owner;

import java.util.List;

public interface OwnerRepository extends CrudRepository<Owner, Long> {

    Owner findByLastName(String lastName);

    List<Owner> findAllByLastNameLike(String anyString);

}