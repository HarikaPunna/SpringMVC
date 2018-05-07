package com.controller;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.dao.Employee;
import com.utils.LoadHibernate;

@RestController
public class EmployeesController {

	@RequestMapping(value="/user/{id}", method=RequestMethod.GET)
	public Employee getUserById(@PathVariable("id") int id) {
		Configuration cfg=LoadHibernate.configureHib();
		SessionFactory sf=cfg.buildSessionFactory();
		Session session=sf.openSession();
		Transaction txn=session.beginTransaction();
		Employee e= session.get(Employee.class, id);
		txn.commit();
		session.close();
		sf.close();
		return e;
	}
	
	@SuppressWarnings("unchecked")
	@RequestMapping(value="/users", method=RequestMethod.GET)
	public List<Employee> getAllUsers() {
		Configuration cfg=LoadHibernate.configureHib();
		SessionFactory sf=cfg.buildSessionFactory();
		Session session=sf.openSession();
		Transaction txn=session.beginTransaction();
		List<Employee> e= session.createCriteria(Employee.class).list();
		txn.commit();
		session.close();
		sf.close();
		return e;
	}
	
	@RequestMapping(value="/user/", method=RequestMethod.POST)
	public Employee postUser(@RequestBody Employee e) {
		Configuration cfg=LoadHibernate.configureHib();
		SessionFactory sf=cfg.buildSessionFactory();
		Session session=sf.openSession();
		Transaction txn=session.beginTransaction();
		session.save(e);
		txn.commit();
		session.close();
		sf.close();
		return e;
	}
	
	@RequestMapping(value="/user/{id}", method=RequestMethod.DELETE)
	public void deleteUser(@PathVariable("id") int id) {
		Configuration cfg=LoadHibernate.configureHib();
		SessionFactory sf=cfg.buildSessionFactory();
		Session session=sf.openSession();
		Transaction txn=session.beginTransaction();
		session.delete(session.get(Employee.class, id));
		txn.commit();
		session.close();
		sf.close();
	}
	
	@RequestMapping(value="/user/{id}", method=RequestMethod.PUT)
	public void updateUser(@RequestBody Employee e, @PathVariable("id") int id) {
		Configuration cfg=LoadHibernate.configureHib();
		SessionFactory sf=cfg.buildSessionFactory();
		Session session=sf.openSession();
		Transaction txn=session.beginTransaction();
		session.update(e);
		txn.commit();
		session.close();
		sf.close();
		//return e;
	}
	

}
