package modelo.persistencia;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import modelo.entidades.Pelicula;

@Repository
public class DaoPeliculaJdbcTemplate implements DaoPelicula{

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Autowired
	private PeliculaDaoRowMapper rowMapper;

	@Override
	/* @return int numero de columnas afectadas.*/
	public int insertar(Pelicula p) {
		String query = "insert into peliculas (TITULO, DIRECTOR, GENERO, YEAR) "
				+ "values (?,?,?,?)";
		return jdbcTemplate.update(query,p.getTitulo(),p.getDirector(),
				p.getGenero(),p.getYear());
	}

	@Override
	public int modificar(Pelicula p) {
		String query = "update peliculas SET TITULO=?, DIRECTOR=?, GENERO=?, YEAR=? "
				+ "where ID=?";
		return jdbcTemplate.update(query,p.getTitulo(),
				p.getDirector(),p.getGenero(),p.getYear(),p.getId());
	}

	@Override
	public int borrar(int id) {
		String query = "delete from peliculas where id=?";
		return jdbcTemplate.update(query,id);
	}

	@Override
	public Pelicula buscar(int id) {
		String query = "select * from peliculas where id=?";
		/*OJO: queryForObject espera un resultado. Si no obtiene 1 y solo 1, salta
		 * una excepcion.*/
		Pelicula p = jdbcTemplate.queryForObject(query, rowMapper,id);
		return p;
	}

	@Override
	public List<Pelicula> listar() {
		String query = "select * from peliculas";
		List<Pelicula> lista = jdbcTemplate.query(query,rowMapper);
		return lista;
	}

}
