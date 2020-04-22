package spring.web.app.springwepapp.Controller;

import org.springframework.stereotype.Controller;
import spring.web.app.springwepapp.Services.GreetingService;

@Controller
public class MyController {

   private final GreetingService greetingService;

    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello(){

        //System.out.println("Hello World!Welcome to My World:");

        /*return "Hi Eithiri:";*/

        return  greetingService.SayGreeting();
    }
}
