package org.backbenchers.com;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
/******************** CRUD method mapping ***************
 * create -> session.persist(object)
 * Read -> session.find(Stduent.class, id)  //return object
 * update -> session.merge(object) //can create also
 * delete -> session.remove(object)
* ******************************************************/

/*****************Steps to establish connection*************
 * session.find() is used in Hibernate 7.1 +
 * it returns an object type
 * s1 = session.find(Student.class, id);  pass object type, then primary key
 *
 * session.merge(s); can update, in case no record it will create new record
 * */

public class CRUD {


    public static Student getFetchById (int id){
        Student s1 = null;

        try (Session session=HibernateUtil.getSession()) {

            s1 = session.find(Student.class, id);

        } catch (HibernateException HE) {
            System.out.println("Exception occurred: " + HE.getMessage());
        } catch (Exception e) {
            System.out.println("Unexpected Error: " + e.getMessage());
        }
        //            if (sf != null) sf.close();
        return s1;
    }

    public static int insertNewStudent(Student s){
        Transaction transaction=null;
        try {
            assert HibernateUtil.getSessionFactory() != null;
            try(Session session=HibernateUtil.getSession()){
                transaction=session.beginTransaction();
                session.persist(s);     //create student table & student , if table exists add new student
                transaction.commit();
                return GlobalVars.SUCCESS;
            }
        }
        catch (Exception e){
            System.out.println("Unexpected Error: "+e.getMessage());
        }
        return GlobalVars.ERROR;
    }

    public static int updateStudentAge(int id, int age){
        Session session=HibernateUtil.getSession();
        Student s=CRUD.getFetchById(id);
        if (s==null || s.getsAge()==age)
            return GlobalVars.ERROR;
        s.setsAge(age);
        Transaction transaction=session.beginTransaction();
        session.merge(s);      // can update, in case no record found it will create new record
        transaction.commit();
        return GlobalVars.SUCCESS;
    }

    public static int deleteStudent(int id){
        Session session=HibernateUtil.getSession();
        Student s=CRUD.getFetchById(id);
        Transaction transaction=session.beginTransaction();
        session.remove(s);      //it will delete s object from DB
        transaction.commit();
        if (s==null)
            return GlobalVars.ERROR;
        return GlobalVars.SUCCESS;
    }

}

