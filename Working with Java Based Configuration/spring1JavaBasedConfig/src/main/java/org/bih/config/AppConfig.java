package org.bih.config;

import org.bih.Alien;
import org.bih.Computer;
import org.bih.Desktop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {

    @Bean
//    public Alien alien(@Autowired Computer com){
    public Alien alien( Computer com){  //new version no need to mention Autowired
        Alien alien=new Alien();
        alien.setAge(26);
//        alien.setCom(desktop());    //tight coupling
        alien.setCom(com);
        return alien;
    }

    @Bean
//    @Bean(name = "com") //single bean name, better to use it
//    @Bean(name = {"com1","Weapon","Desktop"})   //multiple bean name
//    @Scope(value = "prototype")
    public Desktop desktop(){
        return new Desktop();
    }
}
