package controladores;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.context.annotation.RequestScope;
import org.springframework.web.servlet.ModelAndView;

import entidades.Persona;
import entidades.Saludos;

@Controller		//Le dice a Spring que tendra funciones de Controlador.
@RequestScope	//Que se cree uno por cada peticion.
public class ControladorSaludos {
	
	@Autowired
	private Saludos saludosSesion;
	
	/*Por defecto, las peticiones que procesamos son GET, asi que 
	 * no ponemos GetMapping*/
	@RequestMapping(path="verFormularioSaludo",
					method=RequestMethod.GET)
	//@GetMapping("verFormularioSaludos")
	public String getFormulario() {
		return "formularioSaludos";	//->/WEB-INF/vistas/formularioSaludos.jsp
	}
	
	/*Estos metodos estan muy sobrecargados en spring (realmente no es sobrecargam
	 * se hace por reflectacion), por lo que podemos inyectar muchos tipos de objetos
	 * en el metodo*/
	@PostMapping("altaSaludo")
	public ModelAndView alta(HttpSession session, HttpServletRequest request,
			@RequestParam("nombre") String nombre) {
		/*Normalmente siempre que se ejecute un POST se hace un redirect
		 * Siempre que se hace un GET se hace un forward*/
		ModelAndView mav = new ModelAndView("redirect:verSaludos");
		/*Aqui podriamos hacer las llamadas a los gestores.*/
		String nombreRequest = request.getParameter("nombre");
		System.out.println(nombreRequest);
		System.out.println(nombre);
		session.setAttribute("atributoSession", "valor 1");
		//Saludos saludosSession = (Saludos) session.getAttribute("saludos");
		saludosSesion.getSaludos().add(nombre);
		System.out.println(saludosSesion.getSaludos());
		/*Ya que estamos haciendo un redirect, el nombre se va a mandar como 
		 * parametro de la request. Si no hicieramos un redirect, el nombre se 
		 * guardaria en el objeto Request. */
		mav.addObject("nombre",nombre);
		return mav;
	}
	
	@GetMapping("verSaludos")
	public ModelAndView mostrarSaludos(@RequestParam("nombre") String nombre) {
		ModelAndView mav = new ModelAndView();
		/*Como pasar datos del controlador a la vista*/
		Persona p = new Persona();
		
		p.setNombre(nombre);
		
		mav.addObject("persona",p);
		mav.addObject("listaSaludos", saludosSesion.getSaludos());
		mav.addObject("saludo", nombre);
		return mav;
	}	
	
	
	
}
