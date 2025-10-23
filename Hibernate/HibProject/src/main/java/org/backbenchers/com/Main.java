package org.backbenchers.com;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/*****************Steps to establish connection*************
 * 1. create Configuration object, Configuration is a class
 * 2. create an object of SessionFactory by passing Configuration object
 * 3. create an object of Session by passing SessionFactory object
 *
 * */
/****************** Notes ******************
 * SessionFactory has multiple session, better used once
 * Configuration should be done once in an application
 * Session create one session
 * ********************************************/
public class Main {
    public static void main(String[] args){
        Student s=new Student();
        s.setRollNo(12);
        s.setsName("Ajhar");
        s.setsAge(27);

        Configuration cfg=new Configuration();
//        SessionFactory sf=null; //interface
        SessionFactory sf= cfg.buildSessionFactory();
//        Session session=null;   //interface
        Session session=sf.openSession();

        session.persist(s);     //persist used in Hibernate 7+, save was in Hibernate 6

        System.out.println(s);

    }
}
