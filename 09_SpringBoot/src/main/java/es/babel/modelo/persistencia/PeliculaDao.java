package es.babel.modelo.persistencia;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import es.babel.modelo.entidades.Pelicula;

//Pelicula seria el tipo de dato con el que vamos a trabajar
//Integer seria el tipo de clave primaria de la tabla peliculas
public interface PeliculaDao extends JpaRepository<Pelicula, Integer>{
	//Aqui prima la convencion frente a la programacion y la configuracion
	//Si empieza por findBy hacemos busquedas por ese campo
		List<Pelicula> findByTitulo(String titulo);
		
		//Adminte operadores logicos And y Or entre atributos
		List<Pelicula> findByTituloAndGenero(String titulo, String genero);
		
		//Ordenar OrderBy y ademas en Asc o Desc
		//podrimos usar findBy tambien
		//public List<Pelicula> findAllOrderByTituloAsc();
		
		//Si queremos que busque por cadenas que contanga el titulo o el genero
		List<Pelicula> findByTituloContaining(String titulo);
		List<Pelicula> findByTituloAndGeneroContaining(String titulo, String genero);
		
		//Si queremos que busque por cadenas ignorando mayusculas y minusculas
		List<Pelicula> findByTituloIgnoreCase(String titulo);
		List<Pelicula> findByTituloAndGeneroIgnoreCase(String titulo, String genero);
		
		//Si queremos que busque por cadenas que contanga el titulo o el genero
		//y que no importa que sean mayusculas y minusculas
		List<Pelicula> findByTituloIgnoreCaseContaining(String titulo);
		List<Pelicula> findByTituloAndGeneroIgnoreCaseContaining(String titulo, String genero);
			
}
