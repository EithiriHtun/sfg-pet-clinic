package spring.web.app.springwepapp.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import spring.web.app.springwepapp.Services.GreetingService;

@Controller
public class SetterInjectedController {

    @Qualifier("setterGreetingServiceImpl")
    @Autowired
    private GreetingService myService;

    public void setMyService(GreetingService myService) {
        this.myService = myService;
    }
    public String getGreeting(){
        return myService.SayGreeting();
    }
}
