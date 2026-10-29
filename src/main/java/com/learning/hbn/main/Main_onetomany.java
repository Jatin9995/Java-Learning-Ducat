package com.learning.hbn.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import com.learning.hbn.configuration.HibernateConfiguration;
import com.learning.hbn.entity.Addresses;
import com.learning.hbn.entity.Employeee;

public class Main_onetomany {

	public static void main(String[] args) {

		Addresses add1 = new Addresses("Mathura", "Uttar Pradesh");
		Addresses add2 = new Addresses("Dehradun", "UttaraKhand");

		Employeee e = new Employeee();
		e.setName("Jayant");
		e.setGender("male");
		e.setCountry("India");
		e.setSalary(110000000);
		e.setAddress(add1);

		Employeee e2 = new Employeee();
		e2.setName("jatin");
		e2.setGender("male");
		e2.setCountry("India");
		e2.setSalary(190000000);
		e2.setAddress(add2);

		SessionFactory sf = HibernateConfiguration.getSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();

		session.persist(add1);
		session.persist(add2);
		session.persist(e);
		session.persist(e2);
		tx.commit();
		session.close();
		sf.close();
		System.out.println("Employee added successfully");
	}

}
