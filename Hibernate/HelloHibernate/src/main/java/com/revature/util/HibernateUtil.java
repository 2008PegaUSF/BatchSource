package com.revature.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	
	/*
	 * Hiberante important objects and interfaces 
	 * 
	 * Configuration (class)
	 * 		Configuration's job is to gather information from the hibernate.cfg.xml and use that information to create 
	 * 			a session factory. 
	 * 
	 * SessionFactory (interface)
	 * 		It's job is to create sessions and store information on HOW to make connctions to your database. 
	 * 		Once it's configured, it's immutable.
	 * 
	 * Session (interface)
	 * 		Sessions manage the connection to your database and provides create, read, update and delete operations. 
	 * 
	 * Transactions (interface)
	 * 		Transactions manage .... your transactions (and cache). Must be ACID. 
	 * 
	 * What is ACID?
	 * 		Atomicity : 
	 * 					An atomic operation, smallest logical unit of work. All or nothing - all of the transaction must execute or none of them do. 
	 * 		Consistency :
	 * 					After a transactions, the database schema will be intact and the current model still properly represents your data.  
	 * 		Isolated :
	 * 					Transactions cannot interfere with one another. 
	 * 		Durability :
	 * 					Data will persist through issues (like power loss)
	 * 
	 * 
	 */
	
	private static SessionFactory sf = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
	
	public static Session getSession() {
		return sf.openSession();
	}

}
