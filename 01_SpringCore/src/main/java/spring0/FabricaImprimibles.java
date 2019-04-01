package spring0;

public class FabricaImprimibles {
/*Aplicando la interfaz, se puede returnear Objetos del tipo 
 * de las clases que implementan la Interfaz.*/
	public static Imprimir crear(String tipo) {
		switch (tipo) {
		case "fichero":
			Imprimir ipf = new ImprimirPorFichero();
			return ipf;
			
		case "pantalla":
			Imprimir ipp = new ImprimirPorPantalla();
			return ipp;
		default:
			return null;
		}
	}
	
}
