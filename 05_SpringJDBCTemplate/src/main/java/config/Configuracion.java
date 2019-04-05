package config;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;


/*
 * Con esta anotacion le decimos a Spring (en caso de que sea escaneada)
 * que esta clase va a llevar la creacion de beans de Spring.
 * 
 * */
@Configuration
@ComponentScan("modelo")//Equivalente a poner <context:component-scan>
public class Configuracion {

	@Bean
	public DataSource dataSource() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://localhost:3306/spring?useUnicode=true"
				+ "&useJDBCCompliantTimezoneShift=true&"
				+ "useLegacyDatetimeCode=false&serverTimezone=UTC");
		dataSource.setUsername("root");
		dataSource.setPassword("Gianpc25");
		return dataSource;
	}
	
	/*Este sera el objeto que gestione las conexiones a la bbdd y realice las consultas*/
	@Bean
	public JdbcTemplate jdbcTemplate(DataSource dataSource) {
		return new JdbcTemplate(dataSource);
	}
	
	
	
	
	
	
}
