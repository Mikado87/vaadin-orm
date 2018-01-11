package ru.amaev.Data;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Created by Mikado on 04.01.2018.
 */
public class HybernateConfigHelper {
    private static final String PERSISTENCE_UNIT_NAME = "wttmPool";
    private static SessionFactory factory;

    public static SessionFactory getEntityManagerFactory() {
        if (factory == null) {
            factory = new Configuration().configure("persistence.xml").buildSessionFactory();
        }
        return factory;
    }

    public static void shutdown() {
        if (factory != null) {
            factory.close();
        }
    }
}
