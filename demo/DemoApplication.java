

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
	ConfigurableApplicationContext context = 	SpringApplication.run(DemoApplication.class, args);
//	Mycomponent a = context.getBean(Mycomponent.class);
	Myapp a = context.getBean(Myapp.class);
	//a.getMsg();
	a.run();
		//Mycomponent c = new Mycomponent();
		
	}

}
