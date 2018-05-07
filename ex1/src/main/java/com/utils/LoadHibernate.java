package com.utils;

import org.hibernate.cfg.Configuration;

public class LoadHibernate {
	
	public static Configuration configureHib() {
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		return cfg;
		
	}
	
}
