package action;

import java.util.ArrayList;

import org.hibernate.Query;
import org.hibernate.Session;

import modle.*;


import Factory.HibernateSessionFactory;

import com.opensymphony.xwork2.ActionSupport;

public class query extends ActionSupport {
	
	
	java.util.List<Books> booklist= null;

	
	/**
	 * 查询全部书
	 * @return
	 */
	
	public String queryall()
	{
		Session session = HibernateSessionFactory.getSession();
		try {

			session.beginTransaction();
			Query query = session.createSQLQuery("select * from Books");
			booklist = query.list();
		} catch (Exception e) {
			System.out.println("the query is failed" + e);
			return "error";
		} finally {

			session.close();
			
		}

		return "success";
	}
}
