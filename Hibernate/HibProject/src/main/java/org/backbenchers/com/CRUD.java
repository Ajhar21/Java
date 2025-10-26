package org.backbenchers.com;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/*****************Steps to establish connection*************
 * session.find() is used in Hibernate 7.1 +
 * it returns an object type
 * s1 = session.find(Student.class, id);  pass object type, then primary key
 * */

public class CRUD {

    public static Student getFetchById (int id){
        Student s1 = null;
        try (SessionFactory sf = new Configuration().
                addAnnotatedClass(Student.class).
                configure().buildSessionFactory(); Session session = sf.openSession()) {

            s1 = session.find(Student.class, id);
            session.close();
            sf.close();

        } catch (HibernateException HE) {
            System.out.println("Exception occurred: " + HE.getMessage());
        } catch (Exception e) {
            System.out.println("Unexpected Error: " + e.getMessage());
        }
        //            if (sf != null) sf.close();
        System.out.println(s1);
        return s1;
    }

    public static int insertNewStudent(Student s){
        Transaction transaction=null;
        try(Session session=HibernateUtil.getSessionFactory().openSession()){
            transaction=session.beginTransaction();
            session.persist(s);     //create student table & student , if table exists add new student
            transaction.commit();
            return GlobalVars.SUCCESS;
        }
        catch (Exception e){
            System.out.println("Unexpected Error: "+e.getMessage());
        }
        return GlobalVars.ERROR;
    }

}

