package spring.web.app.springwepapp.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import spring.web.app.springwepapp.Services.GreetingService;

@Controller
public class PropertyInjectedController {

    @Qualifier("propertyGreetingServiceImpl")
    @Autowired
    public GreetingService myService;

    public String getGreeting(){
        return myService.SayGreeting();
    }
}
