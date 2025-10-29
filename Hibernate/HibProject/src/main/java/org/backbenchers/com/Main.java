package org.backbenchers.com;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

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
        Student s=new Student();
        s.setRollNo(22);
        s.setsName("Rabbi");
        s.setsAge(29);

        Student s2=null;
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


    }
}
