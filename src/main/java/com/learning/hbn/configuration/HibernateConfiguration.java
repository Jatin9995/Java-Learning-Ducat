package com.learning.hbn.configuration;

import java.util.Properties;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Environment;

public class HibernateConfiguration {

    public static SessionFactory getSessionFactory() {

        // isme hum hibernate.cfg.xml file to hatane k liye yahi configuration likh rahe
        // hai
        Properties properties = new Properties();
        properties.put(Environment.JAKARTA_JDBC_URL, "jdbc:mysql://localhost:3306/testdb");
        properties.put(Environment.JAKARTA_JDBC_USER, "root");
        properties.put(Environment.JAKARTA_JDBC_PASSWORD, "root");
        properties.put(Environment.HBM2DDL_AUTO, "update");
        properties.put("hibernate.show_sql", "true");

        StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().applySettings(properties).build();
        Metadata metadata = new MetadataSources(ssr)
                .addAnnotatedClasses(com.learning.hbn.entity.Employeee.class, com.learning.hbn.entity.Addresses.class)
                .getMetadataBuilder().build();

        return metadata.buildSessionFactory();
    }

}
