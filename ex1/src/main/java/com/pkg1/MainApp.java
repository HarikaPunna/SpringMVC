package com.pkg1;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

import com.dao.Employee;



public class MainApp {
	
	@SuppressWarnings({ "deprecation", "rawtypes" })
	public static void main(String[] args) {
		/*ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
	    Configuration cfg=new Configuration();
	    cfg.configure("hibernate.cfg.xml");
	    SessionFactory sf=cfg.buildSessionFactory();
	    Session session=sf.openSession();
	    Employee employee=(Employee)context.getBean("employee");
	    System.out.println(employee.getId());
	    System.out.println(employee.getName());
	    Transaction tx=session.beginTransaction();
	    session.save(employee);
	    
	    Employee got=(Employee)session.load(Employee.class,employee.getId());
	    System.out.println(got.getId());
	    System.out.println(got.getName());
	    got.setName("moni");
	    session.update(got);
	    //session.delete(got);
	    
	    tx.commit();
	    session.close();
	    sf.close();*/
		/*
		Class1 c= new Class1();
		Class2 c2=new Class2();
		System.out.println(c.var1);
		System.out.println(c.print());
		System.out.println(c2.var1);
		System.out.println(c2.print());
		Class1 c1=new Class2();
		System.out.println(c1.var1);
		System.out.println(c1.print());
		
		Class2 c3=(Class2) new Class1();
		System.out.println(c3.var1);
		System.out.println(c3.print());*/
		
		//HQL
		/*Configuration cfg=new Configuration();
	    cfg.configure("hibernate.cfg.xml");
	    SessionFactory sf=cfg.buildSessionFactory();
	    Session session=sf.openSession();
	    Transaction tx=session.beginTransaction();
	    Query query=session.createQuery("select e.id from Employee e");
	    List<Integer> list=query.list();
	    for(int obj: list) {
	    	System.out.println(obj);
	    }
	    tx.commit();
	    session.close();
	    sf.close();*/
		
		//Crtieria and Criterion
		/*Configuration cfg=new Configuration();
	    cfg.configure("hibernate.cfg.xml");
	    SessionFactory sf=cfg.buildSessionFactory();
	    Session session=sf.openSession();
	    Transaction tx=session.beginTransaction();
	    Criteria crit=session.createCriteria(Employee.class);
		Criterion crt=Restrictions.eq("id", 33);
		crit.add(crt);
		List i=crit.list();
		System.out.println(i.size());
		tx.commit();
	    session.close();
	    sf.close();*/
		
		//Using Annotations and 
	    
		
	}
}
