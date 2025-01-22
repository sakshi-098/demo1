package com.client;

import org.hibernate.Session;

import com.config.HibernateUtil;
import com.model.Department;
import com.model.Employee;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Session session1=HibernateUtil.getSessionFactory().openSession();
		
		//child object
		Employee e1=new Employee();
		e1.setEid(1);
		e1.setEname("abc");
		
		Employee e2=new Employee();
		e2.setEid(2);
		e2.setEname("pqr");
		
		Employee e3=new Employee();
		e3.setEid(3);
		e3.setEname("abcd");
		
		
		// parent object
		Department d1=new Department();
		d1.setDid(101);
		d1.setDname("pqr");

		Department hr=new Department();
		hr.setDid(102);
		hr.setDname("hr");
		
		
		d1.getE().add(e2);
		d1.getE().add(e2);
		d1.getE().add(e1);
		d1.getE().add(e1);
		d1.getE().add(e3);
		hr.getE().add(e1);
		hr.getE().add(e2);
		
		session1.persist(d1);
		session1.beginTransaction().commit();
		
	}

}
