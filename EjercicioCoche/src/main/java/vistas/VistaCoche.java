/**
 * 
 */
package vistas;

import java.util.Scanner;

import modelos.Coche;

/**
 * @author gianfranco.perez
 *
 */
public class VistaCoche {
	public Scanner sc;
	
	public VistaCoche() {
		 sc = new Scanner(System.in);
	}
	
	public int mostrarOpciones() {
		System.out.println("Selecciona una opcion:\n"
				+ "\t0: Add coche\n"
				+ "\t1: Listar coche\n"
				+ "\t2: Ordenar\n"
				+ "\t3: Salir");
		return sc.nextInt();
	}
	
	public Coche pedirCoche() {
		System.out.println("Introduce la matricula(7 caracteres) : ");
		String matricula = sc.next();
		System.out.println("Introduce la marca: ");
		String marca = sc.next();
		System.out.println("Introduce el modelo: ");
		String modelo = sc.next();
		System.out.println("Introduce los kilometros: ");
		double km = sc.nextDouble();
		return new Coche(matricula,marca,modelo,km);
	}
	
	
	 public static void main(String[] args) {
		VistaCoche vc = new VistaCoche();
		vc.mostrarOpciones();
	}
	
}
