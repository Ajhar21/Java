package org.backbenchers.com;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

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

/******************  Fetching with filter & specific properties ******************
 * Query query=session.createQuery("from Laptop where name like ?1 and ram= ?2", Laptop.class);
 * query.setParameter(1,lap_brand);
 *  query.setParameter(2,ram);  -> have to pass parameter by serial
 *
 *  Fetching multiple properties will return an Object array
 *  Query query=session.createQuery("select model,id from Laptop where name like ?1");  -> will return Object array
 * ************************************************************************************/

/************************** find() vs getReference() or load()-> deprecated *************
 * find() is by default EAGER fetching, it will run query even when the result won't use
 * getReference() or laod() is by default LAZY fetching, it won't run query when the result won't use
 * *************************************************************************************/

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
        /*
        Laptop laptop=new Laptop();
        laptop.setLid(5);
        laptop.setName("hp");
        laptop.setModel("Silent Book");
        laptop.setRam(32);
    */

/*
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
      */

/*
        Alien alien2=new Alien();
        alien2.setAid(102);
        alien2.setAname("Rafi");
        alien2.setTech("C#");
*/
//        alien.setLaptops(new ArrayList<Laptop>(List.of(laptop,laptop1)));
//        alien.setLaptops(Arrays.asList(laptop,laptop1));
//        alien1.setLaptops(Arrays.asList(laptop,laptop2));
//        alien1.setLaptops(List.of(laptop2));
/*
        laptop.setAlien(Arrays.asList(alien,alien2));
        laptop1.setAlien(Arrays.asList(alien1,alien2));
        laptop2.setAlien(List.of(alien1));
*/
        SessionFactory sf=new Configuration()
//                .addAnnotatedClass(org.backbenchers.com.Alien.class)
                .addAnnotatedClass(org.backbenchers.com.Laptop.class)
                .configure("hibernate.cfg.xml")     //can go without name for default name
                .buildSessionFactory();

        Session session=sf.openSession();

        Transaction transaction=session.beginTransaction();
//        session.persist(laptop);    //it should call first, because laptop is parent table for OneToOne
        /*
        session.persist(laptop1);
        session.persist(laptop2);
        session.persist(alien);
        session.persist(alien1); */
//        session.persist(alien2);

        transaction.commit();
//        session.find(Alien.class,100);      //same session use cache, don't fire select query
//        System.out.println(alien);

//        Session session1=sf.openSession();
//        session1.find(Alien.class,100);      //different session fire query
//        System.out.println("Different session fire query:"+alien);

//        session.find(Alien.class, 1);
//        for(Laptop lap : alien.getLaptops()){
//            System.out.println(lap);
//        }

        /************************* HQL - Hibernate Query Language ***********************
         * SQL work with table & column, HQL work with Entity(Class) & Attributes
         * HQL is object-oriented, while SQL is table-oriented.
         * Native Query is pure SQL query
         * SQL -> select * from laptop where ram=32
         * HQL -> from Laptop where ram=32
         * ********************************************************************************/

        String lap_brand="hp";
        int ram=32;

//        Query query=session.createQuery("from Laptop where ram =32", Laptop.class);
//        Query query=session.createQuery("from Laptop where name like 'hp'", Laptop.class);
//        Query query=session.createQuery("from Laptop where name like ?1 and ram= ?2", Laptop.class);
//        Query query=session.createQuery("select model from Laptop where name like ?1 and ram= ?2"); //can't pass class here
        Query query=session.createQuery("select model,id from Laptop where name like ?1"); //can't pass class here
        query.setParameter(1,lap_brand);
//        query.setParameter(2,ram);
//        List<Laptop> laptops=query.getResultList();
//        List<String> models=query.getResultList();

        List<Object[]> laptops=query.getResultList();

//        System.out.println(laptops);
//        System.out.println(models);

        for(Object[] data : laptops){
            System.out.println((String)data[0] + " " + (int)data[1] );
        }

        Laptop lRef=session.getReference(Laptop.class, 1); //it's LAZY fetching
//        session.load(2, "hp");  //it's also lazy fetching but method deprecated in 7+
        Laptop lFind=session.find(Laptop.class, 3); //it's EAGER fetching

//        System.out.println("getReference: "+ lRef);
//        System.out.println("find: "+ lFind);

        /*********************** EHCACHE **************************/
        /* same session same query, Hibernate provide default cache -> Level 1 caching
        * different session same query, Hibernate won't provide cache, EHCACHE can handle it -> Level 2 Caching
        * *********************************************************************/
        System.out.println("CACHING");
        Laptop lapCache1=session.find(Laptop.class, 2);
        System.out.println("Cache chech:"+ lapCache1);
        Laptop lapCache2=session.find(Laptop.class, 2);     //Level 1 caching will work here
        System.out.println("Cache chech:"+ lapCache2);

        Session session2=sf.openSession();
        Laptop lapCache3=session2.find(Laptop.class, 2);     //different session, Level 1 caching won't work here
        System.out.println("Cache chech:"+ lapCache3);

        session.close();
        sf.close();

    }
}
