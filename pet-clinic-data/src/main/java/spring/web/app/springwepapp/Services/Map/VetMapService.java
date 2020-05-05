package spring.web.app.springwepapp.Services.Map;


import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import spring.web.app.springwepapp.Model.Speciality;
import spring.web.app.springwepapp.Model.Vet;
import spring.web.app.springwepapp.Services.SpecialitiesService;
import spring.web.app.springwepapp.Services.VetService;

import java.util.Set;

@Service
@Profile({"default","Map"})
public class VetMapService extends AbstractMapService<Vet,Long> implements VetService {

    private final SpecialitiesService specialitiesService;

    public VetMapService(SpecialitiesService specialitiesService) {
        this.specialitiesService = specialitiesService;
    }


    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteByID(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Vet vet) {
        super.delete(vet);
    }

    @Override
    public Vet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Vet save(Vet vet) {

        if(vet.getSpecialities().size() > 0){
            vet.getSpecialities().forEach(speciality ->{
                if(speciality.getId() == null){
                    Speciality savedSpeciality = specialitiesService.save(speciality);
                    speciality.setId(savedSpeciality.getId());
                }
            });
        }

        return super.save(vet.getId(),vet);
    }
}
