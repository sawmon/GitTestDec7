package action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.springframework.web.struts.ActionSupport;

import pojo.Employee;

import daointerface.UserDao;

import form.LoginForm;

public class LoginCheck  extends ActionSupport{
	
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		LoginForm loginForm=(LoginForm)form;
		String userid=loginForm.getUserid();
		String password=loginForm.getPassword();
		String logintypes=loginForm.getLogintypes();
		if(logintypes.equals("admin")){
			if(userid.equals("administrator")&&password.equals("admin")){
				HttpSession adminsession = request.getSession();
				adminsession.setAttribute("AdminId",userid);
				request.setAttribute("admin",userid);
				return mapping.findForward("adminpage");
			}
			else{
				return mapping.findForward("loginfail");
			}
		}
		if(logintypes.equals("user")){
		UserDao udao=(UserDao)getWebApplicationContext().getBean("userDao");
		Employee e=udao.getEmployee(userid, password);
		String position=e.getPosition();
		if(!(e.equals(null))){
			HttpSession usersession = request.getSession();
			usersession.setAttribute("Position",position);
			if(position.equals("ceo")){
				return mapping.findForward("ceopage");
			}
			if(position.equals("manager")){
				return mapping.findForward("managerpage");
			}
			if(position.equals("assistant")){
				return mapping.findForward("assistantpage");
			}
			else{
				return mapping.findForward("userpage");
			}
		}
		else{
			return mapping.findForward("loginpage");
		}
		}
		return null;	
		
	}
	
}

