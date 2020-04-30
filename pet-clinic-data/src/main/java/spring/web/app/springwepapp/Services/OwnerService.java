package spring.web.app.springwepapp.Services;

import spring.web.app.springwepapp.Model.Owner;

import java.util.Set;

public interface OwnerService extends  CrudService<Owner, Long> {

    Owner findByLastName(String lastName);

    /*Owner findById(Long id);

    Owner save(Owner owner);

    Set<Owner> findAll();*/

}
