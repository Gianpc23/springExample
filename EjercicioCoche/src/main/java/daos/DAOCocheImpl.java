/**
 * 
 */
package daos;

import java.util.ArrayList;
import java.util.Collection;

import modelos.Coche;

/**
 * @author gianfranco.perez
 *
 */
public class DAOCocheImpl implements DAOCocheInt,Comparable<Coche>{
	ArrayList<Coche> coches = new ArrayList<Coche>();

	@Override
	public int addCoche(Coche coche) {
		this.coches.add(coche);
		return 0;
	}

	@Override
	public void listarCoches() {	
		for(Coche c : coches) {
			System.out.println(c);
		}
	}

	@Override
	public int compareTo(Coche o) {
		
		return 0;
	}

}
