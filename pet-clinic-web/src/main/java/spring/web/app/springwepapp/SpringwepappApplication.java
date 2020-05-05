package spring.web.app.springwepapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import spring.web.app.springwepapp.Controller.*;

@SpringBootApplication
public class SpringwepappApplication {

	public static void main(String[] args) {

		ApplicationContext ctx = SpringApplication.run(SpringwepappApplication.class, args);

 	}

}
