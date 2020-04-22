package spring.web.app.springwepapp.Services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary
@Service
public class PrimaryGreetingServiceImpl implements GreetingService {
    @Override
    public String SayGreeting() {
        return "Hello Eithiri Htun - From the PRIMARY BEAN:";
    }
}
