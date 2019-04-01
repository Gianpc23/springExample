package spring3;



import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring2.Imprimir;

public class Main3 {

	private static ApplicationContext context = null;

	static {
		context = new ClassPathXmlApplicationContext("beans3.xml");
	}

	public static void main(String[] args) {
		//Persona bean al ser prototype, cada vez que se pide una persona, sera nueva.
		Persona p1 = context.getBean("personaBean",Persona.class);
		Persona p2 = context.getBean("personaBean",Persona.class);
		Persona p3 = context.getBean("personaBean",Persona.class);
		//el ciclo de vida de essas personas depende de nosotros
		
		List<Persona> listaPersonas = context.getBean("listaPersonas", List.class);
		listaPersonas.add(p1);
		listaPersonas.add(p2);
		listaPersonas.add(p3);
		
		Persona carlos = context.getBean("carlos",Persona.class);
		System.out.println(carlos);
		
	}

}
