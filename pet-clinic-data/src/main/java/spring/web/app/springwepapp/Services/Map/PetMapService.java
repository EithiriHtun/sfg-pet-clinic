package spring.web.app.springwepapp.Services.Map;

import org.springframework.stereotype.Service;
import spring.web.app.springwepapp.Model.Owner;
import spring.web.app.springwepapp.Model.Pet;
import spring.web.app.springwepapp.Services.CrudService;
import spring.web.app.springwepapp.Services.PetService;

import java.util.Set;

@Service
public class PetMapService extends AbstractMapService<Pet,Long> implements PetService {

    @Override
    public Set<Pet> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteByID(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Pet pet) {
        super.delete(pet);
    }

    @Override
    public Pet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Pet save(Pet pet) {
        return super.save(pet.getId(),pet);
    }
}
