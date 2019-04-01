/**
 * 
 */
package spring0;

/**
 * @author gianfranco.perez
 *
 */
public class MainFabrica {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//String modo = args[0];
		/*
		if(modo.equals("1")) {
			ImprimirPorFichero ipm = new ImprimirPorFichero();
			ipm.imprimir("ola ke ase");
		}else {
			ImprimirPorPantalla ipp = new ImprimirPorPantalla();
			ipp.imprimir("ola ke ase");
		}
		*/
		Imprimir i = FabricaImprimibles.crear("pantalla");
		i.imprimir("Ola kease");

	}

}
