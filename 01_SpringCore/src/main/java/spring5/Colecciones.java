package spring5;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Colecciones {
	private List<String> listaString;
	private Set<String> conjuntoStrings;
	private Map<Integer,String> mapaStrings;
	private List<Coche> listaCoches;
	private Map<Integer,Coche> mapaCoches;
	
	public Colecciones() {}
	
	public List<String> getListaString() {
		return listaString;
	}
	public void setListaString(List<String> listaString) {
		this.listaString = listaString;
	}
	public Set<String> getConjuntoStrings() {
		return conjuntoStrings;
	}
	public void setConjuntoStrings(Set<String> conjuntoStrings) {
		this.conjuntoStrings = conjuntoStrings;
	}
	public Map<Integer, String> getMapaStrings() {
		return mapaStrings;
	}
	public void setMapaStrings(Map<Integer, String> mapaStrings) {
		this.mapaStrings = mapaStrings;
	}
	
	@Override
	public String toString() {
		return "Colecciones [listaString=" + listaString + ", conjuntoStrings=" + conjuntoStrings + ", mapaStrings="
				+ mapaStrings + "]";
	}

	public List<Coche> getListaCoches() {
		return listaCoches;
	}

	public void setListaCoches(List<Coche> listaCoches) {
		this.listaCoches = listaCoches;
	}

	public Map<Integer,Coche> getMapaCoches() {
		return mapaCoches;
	}

	public void setMapaCoches(Map<Integer,Coche> mapaCoches) {
		this.mapaCoches = mapaCoches;
	}
	
}
