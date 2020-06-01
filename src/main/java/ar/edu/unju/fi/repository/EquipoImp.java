package ar.edu.unju.fi.repository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import ar.edu.unju.fi.Tolaba3817Tp5Application;
import ar.edu.unju.fi.model.Equipo;
/**
 * Con esta clase se implementa todo lo definido en la
 * interfaz IEquipo
 * A continuacion se utiliza @Repository para que esta 
 * clase sea administrada por Spring
 * @author Jorge Tolaba
 */
@Repository("equipoImp")
public class EquipoImp implements IEquipo {
	/**
	 * Creacion de la variable equipo
	 * Autoinyeccion de dependencias
	 */
	@Autowired
	private Equipo equipo;
	/**
	 * Definicion del atributo Logger
	 */
	public static Logger LOG = LoggerFactory.getLogger(Tolaba3817Tp5Application.class);

	@Override
	public void guardar() {
		// Accion realizada para guardar un objeto Equipo en la Base de Datos
		LOG.info("El equipo "+equipo.getNombre()+" y el Estadio "+equipo.getEstadio().getNombre()+" fueron guardados con exito");
	}

	@Override
	public Equipo mostrar() {
		// Se recuperan todos los datos de la Equipo
		LOG.info("Mostrar los datos del equipo");
		return equipo;
	}

	@Override
	public void eliminar() {
		//Se elimina el Objeto Equipo de la Base de Datos
		LOG.info("Eliminar los datos del equipo");
	}

	@Override
	public Equipo modificar() {
		// Se modifica el Objeto Equipo en la Base de Datos
		LOG.info("Modificar los datos del equipo");
		return equipo;
	}

}
