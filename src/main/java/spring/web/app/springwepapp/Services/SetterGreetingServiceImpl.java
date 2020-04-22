package spring.web.app.springwepapp.Services;

import org.springframework.stereotype.Service;

@Service
public class SetterGreetingServiceImpl implements GreetingService {

    @Override
    public String SayGreeting() {
        return "Hello Eithiri Htun: For Setter";
    }
}
