/**
 * 
 */
package ejercicioCasa;

/**
 * @author gianfranco.perez
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Persona p1 = new Persona();
		p1.setNombre("Ana");
		p1.setAltura(1.76);
		p1.setEdad(33);
		
		Persona p2 = new Persona();
		p2.setNombre("Pepe");
		p2.setAltura(1.80);
		p2.setEdad(44);
		
		p1 = p2;
		p2.setEdad(55);
		
		modificarEdad(p2);
		System.out.println(p1.getEdad());
		
		Direccion d1 = new Direccion();
		d1.setNombreVia("Gran Via");
		d1.setTipoVia("Calle");
		d1.setCp("28223");
		d1.setPais("España");
		
		p1.setDir(d1);
		d1.setPais("Francia");
		System.out.println(p1);
		System.out.println(d1);
		
		/*CASAAA*/
		Habitacion[] habitaciones = {new Habitacion(10,"cocina"),
				new Habitacion(10,"baño")};
		Persona[] inquilinos = {p1,p2};
		Casa casa = new Casa(80000,d1,p1,true,habitaciones,inquilinos);
		System.out.println(casa);
	}
	
	public static void modificarEdad(Persona p) {
		p.setEdad(77);
	}

}
