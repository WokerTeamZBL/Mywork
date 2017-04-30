package Login;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import com.opensymphony.xwork2.ActionSupport;

import Factory.*;
public class Login extends ActionSupport{
	private String password;
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	private String name;
	
	@Override
	public void validate() {
			
		if(getPassword().equals(""))
		{
			
			addFieldError(password, "不能为空");
		}
		if(getName().equals(""))
		{
			
			addFieldError(name, "不能为空");
		}
	}
	
	
	/**
	 * 登录
	 * @return
	 */
	public String Login()
	{
		
		Session session= HibernateSessionFactory.getSession();
		session.beginTransaction();
		String hql="from works";
		Query query= session.createQuery(hql);
		List<user> list=query.list();
		if(list.size()==0)
			return "error";
		return "success";
	}

}
