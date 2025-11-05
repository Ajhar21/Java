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

/************************ v-168 Reference attribute Injection ***************************
 * Reference setter can be injected by ref attribute
 * primitive variable-> name="age" value="21"
 * reference variable -> name="age" ref="21"
 * it can be achieved by adding property tag in xml under bean e.x: <property name="lap" ref="lap1"></property>
 * but lap1 bean must be injected in xml file
 * ***************************************************************************/

/************************ v-169 Constructor Injection ***************************
 * ref, value concept also work here
 *
 *<constructor-arg value="21"/>     ->close tag when there is no body
 *         <constructor-arg ref="lap1"/>    -> it will work with default sequence
 *
 * <constructor-arg type="int" value="21"/>    -> it will work with type
 *         <constructor-arg type="org.bih.Laptop" ref="lap1"/>  -> work with type
 *
 * <constructor-arg index="2" ref="lap1"/>
 *         <constructor-arg index="0" value="21"/>
 *         <constructor-arg index="1" value="10000"/>   -> work with index
 * ****index is the ideal way for constructor injection***
 *
 *<constructor-arg name="lap" ref="lap1"/>
 *         <constructor-arg name="salary" value="10000"/>
 *         <constructor-arg name="age" value="21"/>     -> have to use @ConstructorProperties({"age","salary","lap"})
 *         on constructor
 *
 * when parameter are mandatory use @ConstructorProperties in constructor & name in xml
 * when parameter are optionals use index in xml
 * ***************************************************************************/

/************************ v-171 Autowiring ***************************
 *autowiring -> not mentioning property under bean, but it will get the property from desired bean byName or byType
 * autowiring byName -> <bean id="alien" class="org.bih.Alien" autowire="byName">
 * autowiring byType -> <bean id="alien" class="org.bih.Alien" autowire="byType">
 * **autowiring won't work when property injected explicitly under bean**
 * ***************************************************************************/

/************************ v-172 primary bean ***************************
 * <bean id="com1" class="org.bih.Laptop" primary="true"/>
 * when autowiring byType & there are multiple beans with same type, then primary bean being called
 * but for explicit mention of property, autowiring concept never woks, always go for explicit one
 ****************************************************************************/



public class Main {
    public static void main(String[] args) {
        ApplicationContext context= new ClassPathXmlApplicationContext("spring.xml");   //have to pass file name
        /****** ClassPathXmlApplicationContext for xml based project *************/
//        Alien obj=context.getBean(Alien.class);
        Alien obj=(Alien) context.getBean("alien"); //by typecasting Alien
//        obj.setAge(21);
        System.out.println(obj.getAge());
        obj.code();
        System.out.println(obj.getSalary());

//        Alien obj1=(Alien) context.getBean("alien"); //by typecasting Alien
//        System.out.println(obj1.age);
//        obj1.code();
        }
}
