/**
 * 
 */
package main;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import config.Configuracion;
import gestor.GestorCoche;

/**
 * @author gianfranco.perez
 *
 */
public class Main {
	
public static ApplicationContext context;
	
	static {
		context = new AnnotationConfigApplicationContext(Configuracion.class);
	}
	public static void main(String[] args) {
		//GestorCoche gc = new GestorCoche();
		GestorCoche gc = context.getBean("gestorCoche",GestorCoche.class);
		gc.gestionar();
	}
}
