package ejercicioCasa;

public class Habitacion {
	@Override
	public String toString() {
		return "Habitacion [m2=" + m2 + ", tipo=" + tipo + "]";
	}
	private double m2;
	private String tipo;
	
	public Habitacion() {}
	
	public Habitacion(double m2, String tipo) {
		this.m2 = m2;
		this.tipo = tipo;
	}
	public double getM2() {
		return m2;
	}
	public void setM2(double m2) {
		this.m2 = m2;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
}
