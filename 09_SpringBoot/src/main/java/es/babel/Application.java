package es.babel;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ImportResource;

import es.babel.modelo.entidades.Pelicula;
import es.babel.modelo.negocio.GestorPelicula;

/*
 * @SpringBootApplication engloba 3 anotaciones de spring
 * 
 * @Configuration, esta anotación dice que esta clase esta preparada para
 * llevar beans de spirng @Bean
 * 
 * @ComponentScan, esta anotación lo que hace es buscar anotaciones spring
 * de cualquier tipo desde este paquete base a todos los subpaquetes
 * 
 * @EnabledAutoConfiguration, decimos a spring que la arranque la app metiendo
 * en el contenedor de spring todos los beans que necesite para que la app funcione 
 * adecuadamente. Por ejemplo, le hemos dicho que va a ser una app jpa con lo cual 
 * va a llevar un datasource, bien, pues spring dara de alta un objeto automaticamente.
 * Basicamente como funciona es recorriendo el classpath y dando de alta los objetos que 
 * considere necesarios
 */
@SpringBootApplication
@ImportResource("classpath:beans.xml")
public class Application {

	public static void main(String[] args) {
		//ESto genera el contenedor de spring, basandose en la anotacion
		//@SpringBootApplication
		ApplicationContext context = SpringApplication.run(Application.class, args);
		
		Pelicula p1 = context.getBean("pelicula", Pelicula.class);
		p1.setTitulo("La bella y la bestia");
		p1.setDirector("Walt Disney");
		p1.setGenero("Amor");
		p1.setYear(2000);
		
		GestorPelicula gp = context.getBean("gestorPelicula", GestorPelicula.class);
		gp.insertar(p1);
		
		gp.insertar(context.getBean("peliculaSingleton",Pelicula.class));
		
		System.out.println(gp.buscar(1));
		System.out.println(gp.buscar(2));
	}


}
