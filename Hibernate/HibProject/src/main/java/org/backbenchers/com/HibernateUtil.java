package org.backbenchers.com;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {

    private static SessionFactory sessionFactory;

    //  Create the SessionFactory once, for one or more entity classes
    private static SessionFactory createSessionFactory(Class<?>... annotatedClasses) {
        try {
            Configuration configuration = new Configuration()
                    .configure("hibernate.cfg.xml"); // Load hibernate.cfg.xml

            // Dynamically add all annotated entity classes
            for (Class<?> clazz : annotatedClasses) {
                configuration.addAnnotatedClass(clazz);
            }

            return configuration.buildSessionFactory();

        } catch (Throwable t) {
            System.err.println("Session Factory creation failed: " + t);
            throw new ExceptionInInitializerError(t);
        }
    }

    //  Initialize the SessionFactory (once at application start)
    public static void initializeFactory(Class<?>... annotatedClasses) {
        if (sessionFactory == null) {
            sessionFactory = createSessionFactory(annotatedClasses);
        }
    }

    //  Get existing SessionFactory
    public static SessionFactory getSessionFactory() {
        if (sessionFactory == null) {
            throw new IllegalStateException("SessionFactory not initialized! Call initializeFactory() first.");
        }
        return sessionFactory;
    }

    //  Open new session
    public static Session getSession() {
        return getSessionFactory().openSession();
    }

    // Close SessionFactory cleanly
    public static void shutdownSessionFactory() {
        if (sessionFactory != null) {
            sessionFactory.close();
            sessionFactory = null;
        }
    }
}
