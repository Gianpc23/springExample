package modelo.negocio;

import java.util.List;

import modelo.entidades.Pelicula;
import modelo.persistencia.DaoPelicula;

public class GestorPelicula {
	/*Observar que en ningun momento de esta clase
	 * he creado un objbeto daoPelicula (new daoPelicula).*/
	private DaoPelicula daoPelicula;
	
	public boolean insertar(Pelicula p) {
		if(!"".equals(p.getTitulo()))
			return daoPelicula.insertar(p);
		else
			return false;
	}
	
	public List<Pelicula> listar(){
		return daoPelicula.listar();
	}

	public DaoPelicula getDaoPelicula() {
		return daoPelicula;
	}

	public void setDaoPelicula(DaoPelicula daoPelicula) {
		this.daoPelicula = daoPelicula;
	}
	
	
}
