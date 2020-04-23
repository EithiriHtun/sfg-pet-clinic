package spring.web.app.springwepapp.Services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/* Profile default */
@Profile({"ES","default"})
@Service("i18nService")
public class I18nSpanishGreetingService implements GreetingService {
    @Override
    public String SayGreeting() {
        return "Hello Eithiri: - Welcome From Spanish:";
    }
}
