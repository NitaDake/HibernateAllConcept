package com.csi.hibernateconcept;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Service {
	public static SessionFactory factory = new Configuration().configure().buildSessionFactory();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		saveData();
	}

	public static void saveData() {

		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the employee name:");

		String name = sc.next();
		System.out.println("enter the employee salary:");
		double salary = sc.nextDouble();
		Employee e1 = new Employee();
		e1.setEmpName(name);
		e1.setEmpSalary(salary);
		session.save(e1);
		transaction.commit();
	}

}
