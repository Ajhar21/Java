package org.bih;

import org.bih.config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.ArrayList;

/************************** v-176 Java Based Config ****************************
 * use class AnnotationConfigApplicationContext for creating/loading IOC container or start the application
 * pass config class as parameter e.x: new AnnotationConfigApplicationContext(AppConfig.class);
 * create package config, a class under config. e.x: AppConfig.class
 * use @Configuration annotation for config class
 * use @Bean annotation for injecting bean
 * *******************************************************************************/

/************************** v-177 Bean Name ****************************
 * default name of bean is actually the method name under @Bean annotation
 * Define bean name by attribute name. e.x:  @Bean(name = "com") //single bean name
 * then @Bean(name = {"com1","Weapon","Desktop"})   //multiple bean name
 * *******************************************************************************/

/************************** v-178 Scope annotation ****************************
 * by default scope is singleton
 * to make scope prototype use annotation @Scope under @Bean
 * e.x: @Scope(value = "prototype")
 * *******************************************************************************/

/************************** v-179 Autowire ****************************
 * coupling between objects
 * tight coupling is directly mention implementation class, not interface
 * pass dependency bean by constructor  e.x:public Alien alien( Computer com)
 * *******************************************************************************/

/************************** v-180 Primary & Qualifier ****************************
 * when there are multiple Beans available, we have to explicitly which one to use
 * the annotation @Primary will make bean primary
 * the annotation @Qualifier passes through Bean constructor work like reference to that bean
 * like ref attribute in xml e.x: in config -> public Alien alien(@Qualifier("desktop") Computer com)
 * *******************************************************************************/

/*********************** tight coupling vs loose coupling ************************/


public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

//        Desktop desktop=context.getBean(Desktop.class);
//        Desktop desktop=context.getBean("com",Desktop.class);
//        desktop.compile();
//
//        Desktop desktop1=context.getBean(Desktop.class);
//        desktop1.compile();

        Alien al = context.getBean(Alien.class);
//        al.setAge(25);
        System.out.println(al.getAge());
        al.code();

    }
}
