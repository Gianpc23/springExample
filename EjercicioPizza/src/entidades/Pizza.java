package entidades;

import java.util.List;

public class Pizza {
	private List<String> ingredientes;
	private String size;
	private double precio=0;
	
	public List<String> getIngredientes() {
		return ingredientes;
	}
	public void setIngredientes(List<String> ingredientes) {
		this.ingredientes = ingredientes;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public double getPrecio() {
		return this.precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public double calcularPrecio() {
		double aux = 0;
		if(this.size.equals("small"))
			aux = 5.0;
		else if(this.size.equals("medium"))
			aux = 10.0;
		else if(this.size.equals("large"))
			aux = 15.0;
		this.precio = this.ingredientes.size() * 2.0+aux;
		return this.precio;
	}
	@Override
	public String toString() {
		return "Pizza [ingredientes=" + ingredientes + ", size=" + size + ", precio=" + precio + "]";
	}
	
	

	
}
