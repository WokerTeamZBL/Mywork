package action;

import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

public class exit {
	/**
	 * �˳�
	 */
	HttpSession sessions = ServletActionContext.getRequest().getSession();
	public String exit()
	{
		sessions.setAttribute("name", null);
		sessions.setAttribute("password", null);
		return "success";
	}

}
