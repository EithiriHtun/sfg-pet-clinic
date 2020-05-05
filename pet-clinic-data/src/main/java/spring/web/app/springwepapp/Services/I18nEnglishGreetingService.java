package spring.web.app.springwepapp.Services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("EN")
@Service("i18nService")
class I18nEnglishGreetingService implements GreetingService{
    @Override
    public String SayGreeting() {
        return "Hello Eithiri: - Welcome From English:";
    }
}
