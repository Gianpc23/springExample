package vista;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import config.Configuracion;
import modelo.entidades.Pelicula;
import modelo.negocio.GestorPelicula;

public class MainCapas {

	public static ApplicationContext context;
	
	static {
		context = new AnnotationConfigApplicationContext(Configuracion.class);
	}
	
	public static void main(String[] args) {
		Pelicula p = context.getBean("pelicula",Pelicula.class);
		p.setTitulo("La guerra de las galaxias");
		p.setGenero("Sci-fi");
		p.setYear(1975);
		//p.getDirector().setNombre("Pinocho");
		
		System.out.println(p);
		
		GestorPelicula gp = context.getBean("gestorPelicula",GestorPelicula.class);
		gp.insertar(p);
		
		p = context.getBean("pelicula",Pelicula.class);
		p.setTitulo("La guerra de las galaxias segunda parte");
		p.setGenero("Sci-fi");
		p.setYear(1980);
		gp.insertar(p);
		
		p = context.getBean("pelicula",Pelicula.class);
		p.setTitulo("La guerra de las galaxias tercera parte");
		p.setGenero("Sci-fi");
		p.setYear(1980);
		gp.insertar(p);
		
		System.out.println(gp.listar());
		
	}

}
