package es.babel.modelo.negocio;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import es.babel.modelo.entidades.Pelicula;
import es.babel.modelo.persistencia.PeliculaDao;

@Service
public class GestorPelicula {

	@Autowired
	PeliculaDao peliculaDao;
	
	@Transactional
	public Pelicula insertar(Pelicula p) {
		return peliculaDao.save(p);
	}
	
	@Transactional
	public Pelicula modificar(Pelicula p) {
		return peliculaDao.save(p);
	}
	
	@Transactional
	public void borrar(int id) {
		peliculaDao.deleteById(id);;
	}
	
	public Pelicula buscar(int id) {
		//optional es una caracteristica de java 1.8
		//y se desarrollo para evitar en la medida de lo posible 
		//los null pointer exceptions
		
		Optional<Pelicula> optional = peliculaDao.findById(id);
		if(optional.isPresent())
			return optional.get();//me devuelve el objeto real
		else
			return null;
		
		//return peliculaDao.findById(id);
	}
	
	public List<Pelicula> listar(){
		return peliculaDao.findAll();
	}
	
}
