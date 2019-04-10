package entidades;

import java.util.ArrayList;
import java.util.List;

//import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

@Component(value="saludos")
@SessionScope	// == @Scope("session")
public class Saludos {
	private List<String> saludos = new ArrayList<>();

	public List<String> getSaludos() {
		return saludos;
	}

	public void setSaludos(List<String> saludos) {
		this.saludos = saludos;
	}

	@Override
	public String toString() {
		return "Saludos [saludos=" + saludos + "]";
	}
	
}
