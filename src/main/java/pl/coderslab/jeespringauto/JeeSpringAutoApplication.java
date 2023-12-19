package pl.coderslab.jeespringauto;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import pl.coderslab.beans.PersonService;

@SpringBootApplication
public class JeeSpringAutoApplication {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		PersonService person = context.getBean(PersonService.class);
		System.out.println(person.getPersonRepo().getClass().getName());
	}

}
