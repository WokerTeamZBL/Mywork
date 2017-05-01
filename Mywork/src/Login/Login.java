package Login;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;
import org.hibernate.Query;
import org.hibernate.Session;

import com.opensymphony.xwork2.ActionSupport;

import Factory.*;


public class Login extends ActionSupport {
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

	/**
	 * 校验
	 */
	@Override
	public void validate() {

		if (getPassword().equals("")) {

			addFieldError(password, "不能为空");
		}
		if (getName().equals("")) {

			addFieldError(name, "不能为空");
		}
	}
	
	

	/**
	 * 登录
	 * 
	 * @return
	 */
	public String Login() {

		Session session = HibernateSessionFactory.getSession();
		
		session.beginTransaction();
		
		String hql = "select * from Works  s where s.name=? and s.password=? ";
		
		Query query = session.createSQLQuery(hql);
		
		query.setParameter(0, getName());
		
		query.setParameter(1, getPassword());
		
		List<Works> list = query.list();
		
		session.getTransaction().commit();
		
		if (list.size() == 0) {

			return "error";

		} else {
			HttpSession sessions = ServletActionContext.getRequest().getSession();
			sessions.setAttribute("name", getName());
			sessions.setAttribute("password", getPassword());
			return "success";
		}
	}

}
