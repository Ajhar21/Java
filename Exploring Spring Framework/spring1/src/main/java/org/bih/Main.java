package org.bih;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/************************ v-163 Spring 1st project ***************************
 * Only spring without spring boot needs ApplicationContext to create IoC-container manually
 * ClassPathXmlApplicationContext -> class for xml based project
 * ***************************************************************************/

/************************ v-164 Spring Bean Xml Config ***************************
 * 3 ways to configure with spring (xml, java based configuration, Annotations)
 * ClassPathXmlApplicationContext -> class for xml based project
 * create xml file under resources folder
 * configure beans from spring beans xml configuration documentation
 * configure bean with id & class under beans tag
 * ***************************************************************************/

/************************ v-165 Object creation ***************************
 * object creates here -> ApplicationContext context= new ClassPathXmlApplicationContext("spring.xml");
 * depends upon how many object/bean configured in xml file
 * ***************************************************************************/

/************************ v-166 Scopes ***************************
 * different types of scope: Singleton, Prototype, Request, Session
 * spring uses two types - Singleton & Prototype
 * Request, Session use for web or web socket
 * spring bean by default singleton scope
 * singleton -> under this scope object is created when loan/run application, but only one object no more
 * under singleton object is even created without calling getBean()
 * prototype -> no default object creation, object can be created any number of times
 * under prototype, object is created only when calling getBean()
 * can be achieved by scope attribute under bean in xml file
 * ***************************************************************************/

/************************ v-167 Setter Injection ***************************
 * when creating object,  it can by default call setter methods after creating object if setter injected.
 * it can be achieved by adding property tag in xml under bean e.x: <property name="age" value="21"></property>
 * ***************************************************************************/

public class Main {
    public static void main(String[] args) {
        ApplicationContext context= new ClassPathXmlApplicationContext("spring.xml");   //have to pass file name
        /****** ClassPathXmlApplicationContext for xml based project *************/
//        Alien obj=context.getBean(Alien.class);
        Alien obj=(Alien) context.getBean("alien"); //by typecasting Alien
//        obj.setAge(21);
        System.out.println(obj.getAge());
        obj.code();

//        Alien obj1=(Alien) context.getBean("alien"); //by typecasting Alien
//        System.out.println(obj1.age);
//        obj1.code();
        }
}
