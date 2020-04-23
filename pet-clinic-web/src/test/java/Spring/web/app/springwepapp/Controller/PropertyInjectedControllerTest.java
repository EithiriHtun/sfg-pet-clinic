package Spring.web.app.springwepapp.Controller;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import spring.web.app.springwepapp.Controller.PropertyInjectedController;
import spring.web.app.springwepapp.Services.ConstructorGreetingServiceImpl;

class PropertyInjectedControllerTest {

    PropertyInjectedController controller;

    @BeforeEach
    void setUp() {
        controller = new PropertyInjectedController();
        controller.myService = new ConstructorGreetingServiceImpl();
    }

    @Test
    void getGreeting() {
        System.out.println("Property>>" + controller.getGreeting());
    }
}