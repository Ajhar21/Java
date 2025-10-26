package org.backbenchers.com;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {

    private static SessionFactory createSessionFactory(){
        try {
            SessionFactory sf = new Configuration()
                    .addAnnotatedClass(org.backbenchers.com.Student.class)
                    .configure("hibernate.cfg.xml")     //load xml configuration file
                    .buildSessionFactory();
            return sf;
        }
        catch (Throwable t){
            System.out.println("Session Factory creation failed: " +t);
        }
        return null;
    }

    // Single, shared SessionFactory for the whole application
    private static final SessionFactory sessionFactory= createSessionFactory();

    public static SessionFactory getSessionFactory(){
        return sessionFactory;
    }

    public static void shutdownSession(){
        if (sessionFactory != null) getSessionFactory().close();
    }
}
