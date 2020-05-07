package spring.web.app.springwepapp.BootStrap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import spring.web.app.springwepapp.Model.*;
import spring.web.app.springwepapp.Services.*;

import java.time.LocalDate;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerservice;
    private final VetService vetService;
    private final PetTypeService petTypeService;
    private final SpecialitiesService specialitiesService;
    private final VisitService visitService;


    //@Service pr yin use tr..
    @Autowired
    public DataLoader(OwnerService ownerservice, VetService vetService, PetTypeService petTypeService, SpecialitiesService specialitiesService, VisitService visitService){
        this.ownerservice = ownerservice;
        this.vetService = vetService;
        this.petTypeService = petTypeService;
        this.specialitiesService = specialitiesService;
        this.visitService = visitService;

        //@Service ma pr yin use tr..
        /*ownerservice = new OwnerMapService();
        vetService = new VetMapService();
        petTypeService = new PetTypeMapService();*/

    }

    @Override
    public void run(String... args) throws Exception {

        int count = petTypeService.findAll().size();
        if(count == 0){
            LoadData();
        }


    }

    private void LoadData() {
        PetType dog = new PetType();
        dog.setName("Dog");

        PetType saveDog = petTypeService.save(dog);

        PetType cat = new PetType();
        cat.setName("Cat");

        PetType saveCat =  petTypeService.save(cat);

        System.out.println("Load PetTypes.....");

        Speciality radiology = new Speciality();
        radiology.setDescription("RadipLogy");

        Speciality savedRadiology = specialitiesService.save(radiology);

        Speciality surgey = new Speciality();
        surgey.setDescription("Surgey");

        Speciality savedSurgey = specialitiesService.save(surgey);

        Speciality dinesty = new Speciality();
        dinesty.setDescription("Dinesity");

        Speciality savedDinesty = specialitiesService.save(dinesty);

        System.out.println("Load Specialities......");

        Owner owner1 = new Owner();
        owner1.setId(1L);
        owner1.setFirstName("Chan Myae");
        owner1.setLastName("Thu");
        owner1.setAddress("Minbu");
        owner1.setCity("Magway");
        owner1.setTelephone("93838338");



        Pet mikesPet = new Pet();
        mikesPet.setPetType(saveDog);
        mikesPet.setOwner(owner1);
        mikesPet.setBirthDate(LocalDate.now());
        mikesPet.setName("Rosco");
        owner1.getPets().add(mikesPet);

        ownerservice.save(owner1);

        Owner owner2 = new Owner();
        owner2.setId(2L);
        owner2.setFirstName("Ei Thiri");
        owner2.setLastName("Htun");
        owner2.setAddress("TaungTwin");
        owner2.setCity("Magway");
        owner2.setTelephone("98776578");

        Pet fionasCat = new Pet();
        fionasCat.setPetType(saveCat);
        fionasCat.setOwner(owner2);
        fionasCat.setBirthDate(LocalDate.now());
        fionasCat.setName("Just Cat");
        owner2.getPets().add(fionasCat);

        ownerservice.save(owner2);

        System.out.println("Load Owners.....");

        Visit catvisit = new Visit();
        catvisit.setPet(fionasCat);
        catvisit.setDate(LocalDate.now());
        catvisit.setDescription("Sneezy Kitty");
        catvisit.getPet().setId((long) 1);
        catvisit.getPet().getOwner().setId((long) 1);

        visitService.save(catvisit);

        System.out.println("Load Visit.....");

        Vet vet1 = new Vet();
        vet1.setId(1L);
        vet1.setFirstName("Nan Mo");
        vet1.setLastName("Kham");
        vet1.getSpecialities().add(savedRadiology);

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setId(2L);
        vet2.setFirstName("Aung Ko");
        vet2.setLastName("Min");
        vet2.getSpecialities().add(savedSurgey);

        vetService.save(vet2);

        System.out.println("Load Vets.....");
    }

}
