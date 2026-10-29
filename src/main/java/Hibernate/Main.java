package Hibernate;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.MutationQuery;
import org.hibernate.query.Query;

/*
Hibernate me mapping file and configuration file banana padta hai. iske liye wo xml file resources me daalte hai. src/main/resources/ directory me daalna padta hai.
session factory wo entity hai jiske andar saare method hote hai or session factory configuration k andar hoti hai.
configuration naam ki class hoti hai hibernate me.
 */

public class Main {
    public static void main(String[] args) {

        Address add1 = new Address("Delhi", "GreaterNoida");

        Employee emp1 = new Employee("testAnjali", "female", 9100000, "India", add1);
        /*
         * // configuration naam ki class hoti hai hibernate me. hibernate.cfg.xml me db
         * ki
         * // details hai jo wo configure karega.
         * Configuration cfg = new Configuration().configure("hibernate.cfg.xml");
         * 
         * // cfg k andar buildsession factory method hota hai jo session factory ko
         * call
         * // karta hai.
         * SessionFactory sessionfactory = cfg.buildSessionFactory();
         * 
         * // SessionFactory k paas open session naam ka method hota hai jis se multiple
         * // session create kr sakte hai. jab table create hota hai hibernate me to
         * auto
         * // -commit by-default disbaled hota hai.
         * 
         * Session session = sessionfactory.openSession();
         * 
         * // auto-commit enable karne k liye. By-default auto-commit disable hota hai
         * // hibernate me. to enable karne k liye session.beginTransaction() method use
         * // karte hai.
         * Transaction transaction = session.beginTransaction();
         * 
         * // persist command se execution hota hai.
         * session.persist(emp1);
         * 
         * transaction.commit();
         * 
         */

        // ------------------------------------New Way to use hibername

        /*
         * 
         * Deprecated:
         * private static SessionFactory factory= new Configuration()
         * configure().buildSessionFactory()
         * So we will now use new way.
         * Standard Service RegistryBuilder creates and uses an instance of
         * BootstrapServiceRegistry.
         * StandardServiceRegistryBuilder(). configure("hibernate.cfg.xmI"). build();
         * 
         * Metadata: to provide the representation of the application's domain model and
         * its database mapping.
         * Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();
         */

        // StandardServiceRegistry Ye ek Hibernate ka registry object hai jo Hibernate
        // ki saari services (database connection, dialect, transaction management,
        // etc.) ko manage karta hai.
        // StandardServiceRegistryBuilder()Ye ek class hai jo Hibernate ka builder
        // object create karta hai. Iska kaam registry ko configure karke build karna
        // hota hai.
        // .configure: Ye hibernate.cfg.xml file ko read karta hai.

        // StandardServiceRegistry ssr = new
        // StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();

        // Metadata Hibernate me application ke entities (tables/classes) aur database
        // mapping ki information store karta hai. Yeh hibernate.cfg.xml aur entity
        // classes ko read karke database structure ka representation banata hai.
        // Metadata metadata = new MetadataSources(ssr).getMetadataBuilder().build();

        // SessionFactory sessionFactory = metadata.buildSessionFactory();

        // Session session = sessionFactory.openSession(); isko change karenge kyu ki
        // static class banayi hai humne sessionfactory ki alag se

        Session session = HibernateConfiguration.getSessionFactory().openSession();

        Transaction transaction = session.beginTransaction();

        // persist command se execution hota hai.
        session.persist(add1);
        session.persist(emp1);

        transaction.commit();
        session.close();
        // -----------------------------------------------------------------------------------
        // Get all records from db using HQL

        /*
         * Query<Employee> query = session.createQuery("from Employee", Employee.class);
         * List<Employee> list = query.list();
         * 
         * for (Employee e : list) {
         * System.out.println(e);
         * 
         * // if want to search for spefic person
         * if (e.getName().equals("Rahul")) {
         * System.out.println("Yes we found in db");
         * 
         * }
         * 
         * }
         * 
         * System.out.println(
         * ">>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<")
         * ;
         * // Get all records from db using HQL
         * Query<Employee> query2 = session.createQuery("from Employee",
         * Employee.class);
         * query2.setFirstResult(5);
         * query2.setMaxResults(15);
         * List<Employee> list2 = query2.list();
         * for (Employee e : list2) {
         * System.out.println(e);
         * }
         * 
         * // update a query using HQL
         * MutationQuery query3 =
         * session.createMutationQuery("update Employee set name=:n where id=:i");
         * query3.setParameter("n", "testRahul");
         * query3.setParameter("i", 1);
         * query3.executeUpdate();
         * 
         * System.out.println(">>>>>>>>>>>>>>>>>>>><");
         * 
         * // delete a query using HQL
         * MutationQuery query4 =
         * session.createMutationQuery("delete Employee where id=:i");
         * query4.setParameter("i", 20);
         * query4.executeUpdate();
         * 
         * transaction.commit();
         * 
         * // After deletion, total list of data availabel in DB
         * Query<Employee> query5 = session.createQuery("from Employee",
         * Employee.class);
         * List<Employee> list3 = query5.list();
         * for (Employee e : list3) {
         * System.out.println(e);
         * 
         * }
         * 
         */
    }

}
