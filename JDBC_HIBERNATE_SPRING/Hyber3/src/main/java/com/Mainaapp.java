package com;

import java.util.Arrays;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Mainaapp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			Configuration cfg= new Configuration();
			cfg.configure("hibernate.cfg.xml");
			
			SessionFactory factory=cfg.buildSessionFactory();
			Session session = factory.openSession();
			Transaction tx=session.beginTransaction();
			
			//department
			Department dept= new Department();
			dept.setName("IT");
			
			//employee
			Employee emp1= new Employee();
			emp1.setName("Rahul");
			emp1.setAge(22);
			emp1.setDepartment(dept);
			
			Employee emp2=new Employee();
			emp2.setName("Balu");
			emp2.setAge(23);
			emp2.setDepartment(dept);
			
			dept.setEmployees(Arrays.asList(emp1,emp2));
			
			session.save(dept);
			
			tx.commit();
			session.close();
			factory.close();
			
			System.out.println("department and employees inserted successfully");
			
			
			
		}catch(Exception e) {
			System.out.println(e);
		}

	}

}
