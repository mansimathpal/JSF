package grantuniversity;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class bean {
	private String id;
	private String pass;

	public bean() {
	}

	public String Action() {
		if (getId().equals("student") && getPass().equals("password@123")) {
			return "student";
		} else {
			return "error";
		}
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

}


