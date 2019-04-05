package vista;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import config.Configuracion;
import modelo.entidades.Pelicula;
import modelo.negocio.GestorPelicula;

public class MainJdbcTemplate {

	private static ApplicationContext context;
	
	static {
		context = new AnnotationConfigApplicationContext(Configuracion.class);
	}
	
	public static void main(String[] args) {
		GestorPelicula gp = context.getBean("gestorPelicula", GestorPelicula.class);
		Pelicula p = context.getBean("pelicula",Pelicula.class);
		p.setTitulo("La guerra de los mundos 2");
		p.setDirector("El silencioso 2");
		p.setYear(2001);
		p.setGenero("Sci-Fi 2");
		
		//gp.insertar(p);
		
		p.setId(2);
		p.setTitulo("Mallrats 3");
		
		gp.modificar(p);
		
		//Pelicula p2 = gp.buscar(1);
		//System.out.println(p2);
		
		System.out.println(gp.listar());
		//gp.borrar(1);
		//System.out.println("Tras borrar: "+gp.listar());
	}

}
