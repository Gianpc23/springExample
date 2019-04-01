/**
 * 
 */
package spring1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author gianfranco.perez
 *
 */
public class Main1 {
	
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans1.xml");
		/*Un Objeto NO gestionado por el contexto de Spring*/
		//Mensaje mensajeNoGestionado = new Mensaje();
		
		Mensaje mensaje1 = context.getBean("mensaje1", Mensaje.class);
		mensaje1.setId(123);
		mensaje1.setCuerpo("Nuevo cuerpo de la policia");
		mensaje1.setFirma("Laura");
	
		Mensaje mensaje2 = context.getBean("mensaje2", Mensaje.class);
		System.out.println(mensaje2);
		mensaje2.setFirma("Ironman");
		
		System.out.println(mensaje2);
		
		funcion(context);
	}

	private static void funcion(ApplicationContext context) {
		Mensaje m1 = context.getBean("mensaje1",Mensaje.class);
		System.out.println(m1);
	}

}
