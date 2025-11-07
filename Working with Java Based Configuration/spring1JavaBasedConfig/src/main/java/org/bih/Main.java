package org.bih;

import org.bih.config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/************************** v-176 Java Based Config ****************************
 * use class AnnotationConfigApplicationContext for creating/loading IOC container or start the application
 * pass config class as parameter e.x: new AnnotationConfigApplicationContext(AppConfig.class);
 * create package config, a class under config. e.x: AppConfig.class
 * use @Configuration annotation for config class
 * use @Bean annotation for injecting bean
 * *******************************************************************************/
public class Main {
    public static void main(String[] args) {
        ApplicationContext context= new AnnotationConfigApplicationContext(AppConfig.class);

        Desktop desktop=context.getBean(Desktop.class);
        desktop.compile();
        }
}
