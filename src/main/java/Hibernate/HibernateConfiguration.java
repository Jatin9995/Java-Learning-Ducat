package Hibernate;

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
        properties.put(Environment.JAKARTA_JDBC_URL, "jdbc:mysql://localhost:3306/mydb");
        properties.put(Environment.JAKARTA_JDBC_USER, "root");
        properties.put(Environment.JAKARTA_JDBC_PASSWORD, "root");
        properties.put(Environment.HBM2DDL_AUTO, "update");
        properties.put("hibernate.show_sql", "true");

        // ---------------------------------------------------------------------------------
        // yaha hum ek helping method bana rahe hai session factory ka or use hum main
        // method me call karentge taaki waha jayada code na likhna pade.
        // StandardServiceRegistry ssr = new
        // StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
        StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().applySettings(properties).build();

        // Metadata metadata = new MetadataSources(ssr).getMetadataBuilder().build();

        // Metadata metadata = new
        // MetadataSources(ssr).addAnnotatedClass(Hibernate.Employee.class).getMetadataBuilder().build();

        // 2 classes ka data chahea islye isme dono class ko add kia hai
        Metadata metadata = new MetadataSources(ssr).addAnnotatedClasses(Employee.class, Address.class)
                .getMetadataBuilder().build(); // yaha hum ek

        return metadata.buildSessionFactory(); // session factory bana rahe hai

    }

}
