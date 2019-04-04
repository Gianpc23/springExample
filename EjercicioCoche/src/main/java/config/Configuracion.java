package config;

import org.springframework.beans.factory.annotation.Qualifier;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import daos.DAOCocheImpl;
import gestor.GestorCoche;
import vistas.VistaCoche;

@Configuration
public class Configuracion {
	
	@Bean
	public GestorCoche gestorCoche(DAOCocheImpl daoCocheImpl,
			VistaCoche vistaCoche) {
		GestorCoche gc = new GestorCoche();
		gc.setCocheImpl(daoCocheImpl);
		gc.setVs(vistaCoche);
		return gc;
	}
	
	@Bean
	public DAOCocheImpl daoCocheImpl() {
		DAOCocheImpl dao = new DAOCocheImpl();
		return dao;
	}
	
	@Bean
	 public VistaCoche vistaCoche() {
		 VistaCoche vs = new VistaCoche();
		 return vs;
	 }
	
}
