package entidades;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

@Component(value="pedido")
@SessionScope
public class Pedido {
	private String usuario;
	private double precio;
	private String direccion;
	private Pizza pizza;
	
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public double getPrecio() {
		this.precio = pizza.getPrecio();
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	public Pizza getPizza() {
		return pizza;
	}
	public void setPizza(Pizza pizza) {
		this.pizza = pizza;
	}
	
	
	
	@Override
	public String toString() {
		return "Pedido [usuario=" + usuario + ", precio=" + precio + ", direccion=" + direccion + "]";
	}

	
}
