package com.learning.hbn.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import com.learning.hbn.configuration.HibernateConfiguration;
import com.learning.hbn.entity.Addresses;
import com.learning.hbn.entity.Employeee;

/*
Hybernate ki life cycle k state hote hai: Transcient, persistant, detached.
*/
public class Main {

	public static void main(String[] args) {

		Addresses add1 = new Addresses("Noida sector 37", "Uttar Pradesh");//// abhi object transient state me hai
		Addresses add2 = new Addresses("Greater Noida", "Noida Extension");

		Employeee e = new Employeee(); // abhi object transient state me hai
		e.setName("Jatin Rout");
		e.setGender("male");
		e.setCountry("India");
		e.setSalary(110000000);
		e.setAddress(add1);

		Employeee e2 = new Employeee();
		e2.setName("Kavita rout");
		e2.setGender("female");
		e2.setCountry("India");
		e2.setSalary(190000000);
		e2.setAddress(add2);

		SessionFactory sf = HibernateConfiguration.getSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();

		// employee add or update karne k liye niche k codes use kiye gaye hai
		// agar @OneToOne(cascade = CascadeType.ALL) employee class me lagate hai to
		// addi & add2 ko persist karne ki jarurat nahi. jo bhi changes hum employee
		// table me karenge to automatically address table me chale jayenge

		// session.persist(add1);
		// session.persist(add2);
		session.persist(e);
		session.persist(e2);
		tx.commit();
		session.close();

		// agar table me data ban gaya hai or hume data get karna hai to. pehle uper
		// ki update and create command ko commend of karna hoga, uske baad he hum get
		// karenge. Employee ki details get karne k liye
		// Employeee employee = session.get(Employeee.class, 9);
		// System.out.println(employee);

		// System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		// // Addresses ki details get karne k liye
		// Addresses address = session.get(Addresses.class, 9);
		// System.out.println(address);
	}

}
