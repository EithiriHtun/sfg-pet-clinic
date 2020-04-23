package Spring.web.app.springwepapp.Controller;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import spring.web.app.springwepapp.Controller.SetterInjectedController;
import spring.web.app.springwepapp.Services.ConstructorGreetingServiceImpl;

class SetterInjectedControllerTest {

    SetterInjectedController controller;

    @BeforeEach
    void setUp() {
        controller = new SetterInjectedController();
        controller.setMyService(new ConstructorGreetingServiceImpl());
    }

    @Test
    void getGreeting() {
        System.out.println("Setter>>" + controller.getGreeting());
    }
}