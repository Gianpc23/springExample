package spring5;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main5 {
	private static ApplicationContext context = null;

	static {
		context = new ClassPathXmlApplicationContext("beans5.xml");
	}
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		List<String> listaStrings = context.getBean("listaStrings",List.class);
		System.out.println(listaStrings);
		
		Colecciones colecciones = context.getBean("colecciones",Colecciones.class);
		System.out.println(colecciones.getConjuntoStrings());
		System.out.println(colecciones.getListaString());
		System.out.println(colecciones.getMapaStrings());
		System.out.println(colecciones.getMapaCoches());
	}
}
