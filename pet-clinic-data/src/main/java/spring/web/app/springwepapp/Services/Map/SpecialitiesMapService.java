package spring.web.app.springwepapp.Services.Map;

import org.springframework.stereotype.Service;
import spring.web.app.springwepapp.Model.Speciality;
import spring.web.app.springwepapp.Services.SpecialitiesService;

import java.util.Set;

@Service
public class SpecialitiesMapService extends AbstractMapService<Speciality, Long> implements SpecialitiesService {

    @Override
    public Set<Speciality> findAll() {
        return super.findAll();
    }

    @Override
    public void delete(Speciality speciality) {
        super.delete(speciality);
    }

    @Override
    public Speciality save(Speciality speciality) {
        return super.save(speciality.getId(),speciality);
    }

    @Override
    public void deleteByID(Long id) {
        super.deleteById(id);
    }

    @Override
    public Speciality findById(Long id) {
        return super.findById(id);
    }
}
