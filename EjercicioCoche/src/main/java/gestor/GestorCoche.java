/**
 * 
 */
package gestor;

import daos.DAOCocheImpl;
import modelos.Coche;
import vistas.VistaCoche;
import main.Main;
/**
 * @author gianfranco.perez
 *
 */
public class GestorCoche {
	//DAOCocheImpl cocheImpl = new DAOCocheImpl();
	DAOCocheImpl cocheImpl;
	//VistaCoche vs = new VistaCoche();
	VistaCoche vs;
	
	public GestorCoche() {
	}
	
	public DAOCocheImpl getCocheImpl() {
		return cocheImpl;
	}

	public void setCocheImpl(DAOCocheImpl cocheImpl) {
		this.cocheImpl = cocheImpl;
	}

	public VistaCoche getVs() {
		return vs;
	}

	public void setVs(VistaCoche vs) {
		this.vs = vs;
	}

	public int obtenerOpcion() {
		return vs.mostrarOpciones();
	}
	
	public void gestionar() {
		boolean continuar = true;
		while(continuar) {
			int opcion = obtenerOpcion();
			switch(opcion) {
			case 0:
				addCoche();
				break;
			case 1:
				listarCoches();
				break;
			case 2: 
				continuar = false;
				break;
			}
		}
		
	}

	private void listarCoches() {
		this.cocheImpl.listarCoches();
	}

	private void addCoche() {
		Coche coche = vs.pedirCoche();
		if(validaCoche(coche)==0)
			this.cocheImpl.addCoche(coche);
		else
			System.out.println("NO es un coche valido");
	}

	private int validaCoche(Coche coche) {
		int valido = 0;
		if(coche.getMatricula().length()!=7) {
			valido = -1;
		}
		return valido;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}//MAIN

