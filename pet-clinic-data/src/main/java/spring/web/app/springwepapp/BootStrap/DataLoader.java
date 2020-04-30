package spring.web.app.springwepapp.BootStrap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import spring.web.app.springwepapp.Model.Owner;
import spring.web.app.springwepapp.Model.Pet;
import spring.web.app.springwepapp.Model.PetType;
import spring.web.app.springwepapp.Model.Vet;
import spring.web.app.springwepapp.Services.OwnerService;
import spring.web.app.springwepapp.Services.PetService;
import spring.web.app.springwepapp.Services.PetTypeService;
import spring.web.app.springwepapp.Services.VetService;

import java.time.LocalDate;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerservice;
    private final VetService vetService;
    private final PetTypeService petTypeService;


    //@Service pr yin use tr..
    @Autowired
    public DataLoader(OwnerService ownerservice, VetService vetService, PetTypeService petTypeService){
        this.ownerservice = ownerservice;
        this.vetService = vetService;
        this.petTypeService = petTypeService;


        //@Service ma pr yin use tr..
        /*ownerservice = new OwnerMapService();
        vetService = new VetMapService();
        petTypeService = new PetTypeMapService();*/

    }

    @Override
    public void run(String... args) throws Exception {

        PetType dog = new PetType();
        dog.setName("Dog");

        PetType saveDog = petTypeService.save(dog);

        PetType cat = new PetType();
        cat.setName("Cat");

        PetType saveCat =  petTypeService.save(cat);

        System.out.println("Load PetTypes.....");

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

        Vet vet1 = new Vet();
        vet1.setId(1L);
        vet1.setFirstName("Nan Mo");
        vet1.setLastName("Kham");

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setId(2L);
        vet2.setFirstName("Aung Ko");
        vet2.setLastName("Min");

        vetService.save(vet2);

        System.out.println("Load Vets.....");

    }

}
