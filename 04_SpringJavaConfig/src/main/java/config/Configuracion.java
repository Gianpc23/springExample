package config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import modelo.entidades.Director;
import modelo.entidades.Pelicula;
import modelo.negocio.GestorPelicula;
import modelo.persistencia.DaoPelicula;

/*
 * Con esta anotacion le decimos a Spring (en caso de que sea escaneada)
 * que esta clase va a llevar la creacion de beans de Spring.
 * 
 * */
@Configuration
//@ComponentScan("modelo")//Equivalente a poner <context:component-scan>
public class Configuracion {
	
	/*
	 * Con esta anotacion estamos diciendo que este metodo va a llevar la creacion
	 * de un objeto en el contenedor de Spring. Sus scope por defecto será Singleton.
	 * */
	@Bean
	@Scope("prototype")
	public Pelicula pelicula(Director director) {
		/*
		 * El id con el que se da de alta el bean tipo Pelicula es el nombre del METODO, es decir,
		 * pelicula.
		 * Por defecto va a hacer un autowired POR TIPO al parametro de entrada director.
		 * Si no existe director, sera null.
		 * */
		Pelicula p = new Pelicula();
		p.setDirector(director);
		return p;
	}
	@Bean
	@Scope("prototype")
	public Director director() {
		Director d = new Director();
		d.setNombre("George Lucas");
		return d;
	}
	
	@Bean("daoPelicula")	//Asi le damos un nombre al id que no sea el nombre del metodo.
	public DaoPelicula crearDaoPelicula() {
		DaoPelicula daoPelicula = new DaoPelicula();
		return daoPelicula;
	}
	
	@Bean
	public GestorPelicula gestorPelicula(@Qualifier("daoPelicula") DaoPelicula daoPelicula) {
		//@Quealifier hace un autowired BY NAME y pues busca el daoPelicula
		GestorPelicula gp = new GestorPelicula();
		gp.setDaoPelicula(daoPelicula);
		return gp;
	}
	
	
	
}
