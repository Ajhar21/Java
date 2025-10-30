package org.backbenchers.com;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.Arrays;
import java.util.List;

/*****************Steps to establish connection*************
 * 1. create Configuration object, Configuration is a class
 * 2. create an object of SessionFactory by passing Configuration object
 * 3. create an object of Session by passing SessionFactory object
 *
 * */
/****************** Notes ******************
 * SessionFactory has multiple session, better used once. It's a heavy weight object
 * Configuration should be done once in an application
 * Session create one session
 * ********************************************/
public class Main {
    public static void main(String[] args){
        /*
        Student s=new Student();
        s.setRollNo(22);
        s.setsName("Rabbi");
        s.setsAge(29);

        Student s2=null; */
        /*
/*
        *** can be done with one line *******
        Configuration cfg=new Configuration();
        cfg.addAnnotatedClass(org.backbenchers.com.Student.class);  //add the object
        cfg.configure();    //this load the xml file

 */
        /*


        SessionFactory sf=null; //interface
        Session session=null;   //interface
        Transaction transaction=null;
        try{
            sf= new Configuration().
                    addAnnotatedClass(org.backbenchers.com.Student.class).
                    configure().buildSessionFactory();//cfg.buildSessionFactory();

            session=sf.openSession();

            s2=CRUD.getFetchById(15);  //fetch data by id

            transaction=session.beginTransaction();
            session.persist(s);     // Marks it for saving, persist used in Hibernate 7+, save was in Hibernate 6
            transaction.commit();
        }
        catch (HibernateException HE){
            System.out.println("Exception occurred: " + HE.getMessage());
            if(transaction != null) transaction.rollback();
        }
        catch (Exception e){
            System.out.println("Unexpected Error: " + e.getMessage());
            if(transaction != null) transaction.rollback();
        }

        finally {
            if(session != null) session.close();
            if(sf != null) sf.close();
        }
        System.out.println(s);
        System.out.println(s2);
        */
//
//        try(Session session=HibernateUtil.getSessionFactory().openSession()){
//            int insertStudent=CRUD.insertNewStudent(s);
//            if (insertStudent == GlobalVars.SUCCESS)
//                System.out.println("Stduent added successfully");
//            else
//                System.out.println("Stduent Failed to add");
//            s2=CRUD.getFetchById(17);
//        }
//        catch (NullPointerException n){
//            System.out.println("Session Error: " + n.getMessage());
//        }
//        catch (Exception e){
//            System.out.println("Unexpected Error: " + e.getMessage());
//           if(transaction != null) transaction.rollback();
//        }
        /************************** Using classes, OOP concept *****************************/
/*
        HibernateUtil.initializeFactory(Student.class);

        int insertStudent=CRUD.insertNewStudent(s);
        if (insertStudent == GlobalVars.SUCCESS)
            System.out.println("Stduent added successfully");
        else
            System.out.println("Stduent Failed to add");

        s2=CRUD.getFetchById(21);

        int updateAge=CRUD.updateStudentAge(17,28);     //update
        if (updateAge == GlobalVars.SUCCESS)
            System.out.println("Stduent Age updated successfully");
        else
            System.out.println("Stduent age update failed");
        System.out.println("Fetched Data: "+s2);
        System.out.println("Fetched Data: "+CRUD.getFetchById(17));

        int deleteStudent=CRUD.deleteStudent(16);     //delete a record
        if (deleteStudent == GlobalVars.SUCCESS)
            System.out.println("Stduent deleted successfully");
        else
            System.out.println("Stduent delete failed");

        HibernateUtil.shutdownSessionFactory();

//        HibernateUtil.getSession(Student.class);

*/
        Laptop laptop=new Laptop();
        laptop.setLid(1);
        laptop.setName("hp");
        laptop.setModel("intel core i7");
        laptop.setRam(16);

        Laptop laptop1=new Laptop();
        laptop1.setLid(2);
        laptop1.setName("Dell");
        laptop1.setModel("intel core i8");
        laptop1.setRam(32);

        Laptop laptop2=new Laptop();
        laptop2.setLid(3);
        laptop2.setName("Macbook");
        laptop2.setModel("Apple Air");
        laptop2.setRam(32);

        Alien alien=new Alien();
        alien.setAid(100);
        alien.setAname("Ajhar");
        alien.setTech("Java");

        Alien alien1=new Alien();
        alien1.setAid(101);
        alien1.setAname("Ashraf");
        alien1.setTech("Javascript");
/*
        Alien alien2=new Alien();
        alien2.setAid(102);
        alien2.setAname("Rafi");
        alien2.setTech("C#");
*/
//        alien.setLaptops(new ArrayList<Laptop>(List.of(laptop,laptop1)));
        alien.setLaptops(Arrays.asList(laptop,laptop1));
//        alien1.setLaptops(Arrays.asList(laptop,laptop2));
        alien1.setLaptops(List.of(laptop2));
/*
        laptop.setAlien(Arrays.asList(alien,alien2));
        laptop1.setAlien(Arrays.asList(alien1,alien2));
        laptop2.setAlien(List.of(alien1));
*/
        SessionFactory sf=new Configuration()
                .addAnnotatedClass(org.backbenchers.com.Alien.class)
                .addAnnotatedClass(org.backbenchers.com.Laptop.class)
                .configure("hibernate.cfg.xml")     //can go without name for default name
                .buildSessionFactory();

        Session session=sf.openSession();

        Transaction transaction=session.beginTransaction();
        session.persist(laptop);    //it should call first, because laptop is parent table for OneToOne
        session.persist(laptop1);
        session.persist(laptop2);
        session.persist(alien);
        session.persist(alien1);
//        session.persist(alien2);

        transaction.commit();
        session.find(Alien.class,100);      //same session use cache, don't fire select query
        System.out.println(alien);

        Session session1=sf.openSession();
        session1.find(Alien.class,100);      //different session fire query
//        System.out.println("Different session fire query:"+alien);

//        session.find(Alien.class, 1);
//        for(Laptop lap : alien.getLaptops()){
//            System.out.println(lap);
//        }
        sf.close();

    }
}
