package modelo.entidades;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/*
 * Basicamente tenemos 4 estereotipos de anotaciones en Spring:
 * @Component
 * @Controller
 * @Service
 * @Repository
 * 
 * Con estas 4 anotaciones podemos dar objetos de alta en el conte-
 * nedor de Spring.
 * Las diferencias son basicamente semanticas (ya que todas ellas dan
 * de alta un objeto en Spring).
 * @Repository, da de alta un objeto en Spring de tipo persistencia.
 * @Service, estamos diciendo que es un objeto de negocio.
 * @Controller, lleva la logica de navegacion dentro de un modelo MVC.
 * @Component es la padre de los demas y se usa a nivel generico.
 * 
 * 
 * Inconvenientes: 
 * 	De esta manera tenemos que recompilar codigo cada vez que cambiemos algo(Si 
 * 	queremos cambiar el scope tenemos que tocar codigo, no solo el xml).
 * 	Con anotaciones solo se puede dar de alta un bean de un tipo a la vez.
 * 
 * 
 * 
 * */
@Component	//Por defecto los estereotipos son Singleton.
@Scope("prototype")//Porque sino seria por defecto Singleton.
public class Director {
	private int id;
	@Value("George Lucas")
	private String nombre;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	@Override
	public String toString() {
		return "Director [id=" + id + ", nombre=" + nombre + "]";
	}
	
}
