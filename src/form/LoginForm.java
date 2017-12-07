package form;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

public class LoginForm extends ActionForm{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String userid;
	private String password;
	private String logintypes;
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getLogintypes() {
		return logintypes;
	}
	public void setLogintypes(String logintypes) {
		this.logintypes = logintypes;
	}
	
	public ActionErrors validate(ActionMapping mapping,HttpServletRequest request){
		ActionErrors actionErrors = new ActionErrors();

		if(userid.equals("")){
			actionErrors.add("no.userid",new ActionMessage("no.userid"));
		}
		if(password.equals("")){
			actionErrors.add("no.password",new ActionMessage("no.password"));
		}
		if(logintypes==null){
			actionErrors.add("no.logintypes",new ActionMessage("no.logintypes"));
		}
				return actionErrors;
		
	}

}
