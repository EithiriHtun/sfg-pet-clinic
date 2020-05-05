package spring.web.app.springwepapp.Services.Map;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import spring.web.app.springwepapp.Model.PetType;
import spring.web.app.springwepapp.Services.PetTypeService;

import java.util.Set;

@Service
@Profile({"default","Map"})
public class PetTypeMapService extends  AbstractMapService<PetType, Long> implements PetTypeService {

    @Override
    public Set<PetType> findAll() {
        return super.findAll();
    }

    @Override
    public void delete(PetType petType) {
        super.delete(petType);
    }

    @Override
    public PetType save(PetType petType) {
        return super.save(petType.getId(),petType);
    }

    @Override
    public void deleteByID(Long id) {
        super.deleteById(id);
    }

    @Override
    public PetType findById(Long id) {
        return super.findById(id);
    }
}
