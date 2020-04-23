package spring.web.app.springwepapp.Controller;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import spring.web.app.springwepapp.Services.GreetingService;

@Controller
public class ConstructorInjectedController {

    private final GreetingService myService;

   /* public MyService myService;*/

    public ConstructorInjectedController(@Qualifier("constructorGreetingServiceImpl") GreetingService myService) {
        this.myService = myService;
    }

    public String getGreeting(){
        return myService.SayGreeting();
    }
}
