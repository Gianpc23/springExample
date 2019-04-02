/**
 * 
 */
package ejercicioCasa;

/**
 * @author gianfranco.perez
 *
 */
public class Persona {
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", altura=" + altura + ", edad=" + edad + ", dir=" + dir + "]";
	}
	private String nombre;
	private double altura;
	private int edad;
	private Direccion dir;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public Direccion getDir() {
		return dir;
	}
	public void setDir(Direccion dir) {
		this.dir = dir;
	}
	
	
	
}
