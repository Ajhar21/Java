package com.bih.app;

//import com.bih.app.model.Alien;
import com.bih.app.model.Laptop;
import com.bih.app.service.LaptopService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

/******************************* Spring getting started ***********************
 * from main we can access ApplicationContext, but from other files it's not possible
 * use @Autowired top of object, it will configure the object by Spring IoC
 * bean is object managed by spring
 * ******************************************************************************/

/******************************* v-185 Spring To Spring Boot ***********************
 * spring boot project doesn't need any configuration file
 * spring boot has some opinionated way of working
 * configuration done automatically
 * Annotation @SpringBootApplication enough for configuration to run the application
 * ******************************************************************************/

/******************************* v-186 Using Annotations In Spring Boot **********
 * all annotations from Spring supported by spring boot
 * ******************************************************************************/

/******************************* v-187 Different Layers **********
 * request-response flow--> client <-> server <-> database
 * server has three layers --> controller <-> service <-> Repository/DAO
 * controller -> handle request-response, call service for a request
 * service -> process/business logic
 * repository -> interact with database
 * DAO stands for Data Access Object
 * ******************************************************************************/

/******************************* v-188 Service Class **********
 * service layer is responsible for data processing/business logic
 * annotation @Service works same as @Component
 * good practice to use @Service instead of @Component in service classes
 * service, controller, repository should be worked in different packages
 * ******************************************************************************/

/******************************* v-189 Repository Layer **********
 * service layer calls repository layer
 * annotation @Repository is used for repository class
 * it works same as @Component
 * ******************************************************************************/

@SpringBootApplication
public class AppApplication {

	public static void main(String[] args) {

        ApplicationContext context=SpringApplication.run(AppApplication.class, args);

        Laptop lap=context.getBean(Laptop.class);
        LaptopService service=context.getBean(LaptopService.class);
        service.addLaptop(lap);

    }
}
