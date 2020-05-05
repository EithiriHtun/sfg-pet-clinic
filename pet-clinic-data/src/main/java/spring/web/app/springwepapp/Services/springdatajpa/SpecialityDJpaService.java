package spring.web.app.springwepapp.Services.springdatajpa;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import spring.web.app.springwepapp.Model.Speciality;
import spring.web.app.springwepapp.Respositories.SpecialityRepository;
import spring.web.app.springwepapp.Services.SpecialitiesService;

import java.util.HashSet;
import java.util.Set;

@Service
@Profile("springdatajpa")
public class SpecialityDJpaService implements SpecialitiesService {

    private final SpecialityRepository specialityRepository;

    public SpecialityDJpaService(SpecialityRepository specialityRepository) {
        this.specialityRepository = specialityRepository;
    }

    @Override
    public Set<Speciality> findAll() {
        Set<Speciality> specialities = new HashSet<>();
        specialityRepository.findAll().forEach(specialities::add);
        return specialities;
    }

    @Override
    public Speciality findById(Long id) {
        return specialityRepository.findById(id).orElse(null);
    }

    @Override
    public Speciality save(Speciality speciality) {
        return specialityRepository.save(speciality);
    }

    @Override
    public void delete(Speciality speciality) {
        specialityRepository.delete(speciality);
    }

    @Override
    public void deleteByID(Long id) {
        specialityRepository.deleteById(id);
    }
}
