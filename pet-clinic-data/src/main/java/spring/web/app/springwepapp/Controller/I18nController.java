package spring.web.app.springwepapp.Controller;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import spring.web.app.springwepapp.Services.GreetingService;

@Controller
public class I18nController {

    private final GreetingService greetingService;

    public I18nController(@Qualifier("i18nService") GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String SayGreeting(){
       return greetingService.SayGreeting();
    }
}
