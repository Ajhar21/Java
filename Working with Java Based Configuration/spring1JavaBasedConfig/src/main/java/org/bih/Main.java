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
 * tight coupling is directly mention implementation/concrete class, not interface
 * loose coupling is mentioning interface type
 * pass dependency bean by constructor  e.x:public Alien alien( Computer com)
 * *******************************************************************************/

/************************** v-180 Primary & Qualifier ****************************
 * when there are multiple Beans available, we have to explicitly mention which one to use
 * the annotation @Primary will make bean primary
 * the annotation @Qualifier passes through Bean constructor work like reference to that bean
 * like ref attribute in xml e.x: in config -> public Alien alien(@Qualifier("desktop") Computer com)
 * *******************************************************************************/

/************************** v-181 Component Stereotype Annotation ****************************
 * annotation @Component  used on top of class to make the all beans of class managed by spring
 * annotation @ComponentScan used top of config class to instruct spring to scan all classes under @Component
 * has to mention base package of classes inside @ComponentScan. e.x: @ComponentScan("org.bih")
 * it will scan all classes under @Component
 * *******************************************************************************/

/*********************** tight coupling vs loose coupling ************************/

/************************** v-182 Autowire Field, Constructor, Setter ****************************
 * annotation @Autowired automatically inject bean
 * annotation @Qualifier("desktop") straight mention bean to be wired
 * default name of bean is lowercase class name
 * can also explicitly mention bean name by @Component("lap")
 * There are three types of injection: 1. Field Injection, 2. Constructor Injection, 3. Setter Injection
 * Setter Injection is the best approach
 * *******************************************************************************/

/************************** v-183 Component Stereotype Annotation ****************************
 * annotation @Primary make bean as primary
 * but @Qualifier gets priority over Primary
 * *******************************************************************************/

/************************** v-184 Scope & Value Annotation ****************************
 * annotation @Scope top of class used for scoping
 * annotation @Value is used to set default value of an attribute
 * *******************************************************************************/

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
        Alien al1 = context.getBean(Alien.class);

    }
}
