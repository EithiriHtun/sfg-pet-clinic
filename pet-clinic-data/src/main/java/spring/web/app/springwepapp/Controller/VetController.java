package spring.web.app.springwepapp.Controller;

import org.dom4j.rule.Mode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import spring.web.app.springwepapp.Services.VetService;

@Controller
public class VetController {

    private final VetService vetService;

    @Autowired
    public VetController(VetService vetService) {
        this.vetService = vetService;
    }

    @RequestMapping({"/vet","/vets/index","vets/index.html","/vets.html"})
    public  String listVet(Model model){
        model.addAttribute("vets",vetService.findAll());
        return "vets/index";
    }

    }
