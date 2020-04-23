package spring.web.app.springwepapp.Controller;

import spring.web.app.springwepapp.Services.MyService;

public class SomeController {

    private final MyService myService;

    public SomeController(MyService myService) {
        this.myService = myService;
    }
}
