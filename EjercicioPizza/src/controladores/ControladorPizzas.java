package controladores;

import java.util.ArrayList;
import java.util.Arrays;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.context.annotation.RequestScope;
import org.springframework.web.servlet.ModelAndView;

import entidades.Pedido;
import entidades.Pizza;


@Controller()		//Le dice a Spring que tendra funciones de Controlador.
@RequestScope	//Que se cree uno por cada peticion.
public class ControladorPizzas {
	
	@PostMapping("/login")
	public ModelAndView login(@RequestParam("usuario")String usuario,
			@RequestParam("password")String password) {
		ModelAndView mav;
		ControladorLogin cl = new ControladorLogin();
		if(cl.comprueba(usuario, password)==true) {
			mav = new ModelAndView("redirect:pedir");
			mav.addObject("usuario",usuario);
		}else {
			mav = new ModelAndView("redirect:/");
			System.out.println("USUARIO Y PWD INCORRECTOS");
		}
		return mav;
	}
	
	@GetMapping("/pedir")
	public ModelAndView pedir(@RequestParam("usuario")String usuario,
			HttpSession session) {
		ModelAndView mav = new ModelAndView();
		System.out.println("Estamos en pedir");
		System.out.println("Usuario: "+usuario);
		mav.addObject("usuario",usuario);
		session.setAttribute("usuario", usuario);
		return mav;
	}
	
	@PostMapping("/creaPedido")
	public ModelAndView creaPedido(@RequestParam()String direccion,
			@RequestParam()String size,
			@RequestParam()String[] ingrediente,
			HttpSession session
			) {
		ModelAndView mav = new ModelAndView();
		
		Pizza pizza = new Pizza();
		pizza.setSize(size);
		ArrayList<String> arrayList = 
				new ArrayList<String>(Arrays.asList(ingrediente));
		pizza.setIngredientes(arrayList);
		pizza.calcularPrecio();
		Pedido pedido = new Pedido();
		pedido.setDireccion(direccion);
		pedido.setPizza(pizza);
		pedido.setPrecio(pizza.getPrecio());
		pedido.setUsuario((String)session.getAttribute("usuario"));
		mav.addObject("pedido", pedido);
		mav.addObject("pizza",pizza.toString());
		return mav;
	}
	
	
	
}
