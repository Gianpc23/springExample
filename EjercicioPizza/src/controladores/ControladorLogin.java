package controladores;

import java.util.HashMap;
import java.util.Map;


public class ControladorLogin {
	private Map<String,String> userPwd;
	
	public ControladorLogin() {
		this.userPwd = new HashMap<String, String>();
		for(int i = 0 ; i < 5; i++) {
			this.userPwd.put("gian"+i, "gianpwd"+i);
		}
	}
	
	public boolean comprueba(String user, String pwd) {
		boolean aux = false;
		if(this.userPwd.containsKey(user)) 
			if(this.userPwd.get(user).equals(pwd)) 
				aux = true;
		return aux ;
	}
	
}
