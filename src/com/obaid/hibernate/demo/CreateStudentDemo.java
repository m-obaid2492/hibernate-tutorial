package com.obaid.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.obaid.hibernate.demo.entity.Student;

public class CreateStudentDemo {
	
	public static void main(String[] args) {
		
		
		SessionFactory factory= new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Student.class)
				.buildSessionFactory();
		
		
		Session session= factory.getCurrentSession();
		
		
		try {
			System.out.println("new Studet Object");
			
			Student newStu= new Student("PAul", "o conour", "assas@asadk.com");
			
			session.beginTransaction();
			
			//to delete
			//session.createQuery("delete from Student where id=1").executeUpdate()
			
			System.out.println("Sving stundet");
			
			session.save(newStu);
			
			session.getTransaction().commit();
			
			System.out.println("DONE");
		} finally {
			
			factory.close();
		}
	}

}
