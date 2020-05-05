package spring.web.app.springwepapp.Services.Map;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import spring.web.app.springwepapp.Model.Pet;
import spring.web.app.springwepapp.Model.Visit;
import spring.web.app.springwepapp.Respositories.OwnerRepository;
import spring.web.app.springwepapp.Respositories.PetRepository;
import spring.web.app.springwepapp.Services.VisitService;

import java.util.Set;

@Service
@Profile({"default","Map"})
public class VisitMapService extends AbstractMapService<Visit,Long> implements VisitService {

    @Override
    public Set<Visit> findAll() {
        return super.findAll();
    }

    @Override
    public void delete(Visit visit) {
    super.delete(visit);
    }

    @Override
    public Visit save(Visit visit) {

            if(visit.getPet() == null || visit.getPet().getOwner() == null ||
                    visit.getPet().getId() == null || visit.getPet().getOwner().getId() == null) {
            throw new RuntimeException("Invalid Visit!!.");
            }
        return super.save(visit.getId(),visit);
    }

    @Override
    public void deleteByID(Long id) {
    super.deleteById(id);
    }

    @Override
    public Visit findById(Long id) {
        return super.findById(id);
    }
}
