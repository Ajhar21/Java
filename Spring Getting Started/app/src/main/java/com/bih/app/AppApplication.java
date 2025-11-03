package com.bih.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

/******************************* Spring getting started ***********************
 * from main we can access ApplicationContext, but from other files it's not possible
 * use @Autowired top of object, it will configure the object by Spring IoC
 * bean is object managed by spring
 * ******************************************************************************/

@SpringBootApplication
public class AppApplication {

	public static void main(String[] args) {
//		SpringApplication.run(AppApplication.class, args);
//        System.out.println("Hello World!");
        ApplicationContext context=SpringApplication.run(AppApplication.class, args);
//	    Alien obj=new Alien();  //wants created by Spring
        Alien obj=context.getBean(Alien.class);     //creating object by Spring IoC
        obj.code();

//        Alien obj1=context.getBean(Alien.class);
//        obj1.code();
    }
}
