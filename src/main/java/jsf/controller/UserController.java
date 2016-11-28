package jsf.controller;

import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;

@ManagedBean
public class UserController {
	private String login, password;
	private static final String LOGIN = "admin";
	private static final String PWD = "admin";

	public String checkUser() {

		if (LOGIN.equals(password) && (PWD.equals(password))) {
			HttpSession session = (HttpSession) FacesContext.getCurrentInstance().getExternalContext().getSession(true);

			return "welcome";
		}
		return "";

	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
