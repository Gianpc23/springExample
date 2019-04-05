package modelo.persistencia;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import modelo.entidades.Pelicula;

@Component
public class PeliculaDaoRowMapper implements RowMapper<Pelicula>{

	@Override
	/*La funcion de esta clase es simplificar la conversion de 1 ResultSet a objetos*/
	public Pelicula mapRow(ResultSet rs, int rowNum) throws SQLException {
		Pelicula p = new Pelicula();
		p.setId(rs.getInt("ID"));
		p.setTitulo(rs.getString("TITULO"));
		p.setGenero(rs.getString("GENERO"));
		p.setDirector(rs.getString("DIRECTOR"));
		p.setYear(rs.getInt("YEAR"));
		return p;
	}

}
