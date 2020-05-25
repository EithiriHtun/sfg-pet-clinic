package spring.web.app.springwepapp.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.method.support.ModelAndViewContainer;
import org.springframework.web.servlet.ModelAndView;
import spring.web.app.springwepapp.Services.OwnerService;

@RequestMapping("/owners")
@Controller
public class OwnerController {

    private final OwnerService ownerService;

    public OwnerController(OwnerService ownerService) {
        this.ownerService = ownerService;
    }

    @RequestMapping({"","/","/index","/index.html"})
    public String listOwner(Model model){
        model.addAttribute("owners",ownerService.findAll());
        return "owners/index";
    }

    @RequestMapping("/find")
    public String findOwner(){

        return "notiImplement";
    }

    @GetMapping("/{ownerid}")
    public ModelAndView showOwner(@PathVariable("ownerid") String ownerid){
    ModelAndView modelAndView = new ModelAndView("owners/ownerDetails");
    modelAndView.addObject(ownerService.findById(Long.valueOf(ownerid)));
    return modelAndView;
    }

}
