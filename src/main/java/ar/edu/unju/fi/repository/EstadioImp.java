package ar.edu.unju.fi.repository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import ar.edu.unju.fi.Tolaba3817Tp5Application;
import ar.edu.unju.fi.model.Estadio;
/**
 * Con esta clase se implementa todo lo definido en la
 * interfaz IEstadio
 * A continuacion se utiliza @Repository para que esta 
 * clase sea administrada por Spring
 * @author Jorge Tolaba
 */
@Repository("estadioImp")
public class EstadioImp implements IEstadio {
	/**
	 * Creacion de la variable estadio
	 * Autoinyeccion de dependencias
	 */
	@Autowired
	private Estadio estadio;
	/**
	 * Definicion del atributo Logger
	 */
	public static Logger LOG = LoggerFactory.getLogger(Tolaba3817Tp5Application.class);
	@Override
	public void guardar() {
		// Accion realizada para guardar un objeto Estadio en la Base de Datos
		LOG.info("El estadio "+estadio.getNombre()+"Fundado en "+estadio.getFechaFundacion()+"fue guardado");
	}

	@Override
	public Estadio mostrar() {
		// Se recuperan todos los datos de la Estadio
		LOG.info("Mostrar estadio");
		return estadio;
	}

	@Override
	public void eliminar() {
		//Se elimina el Objeto Estadio de la Base de Datos
		LOG.info("Eliminar estadio");

	}

	@Override
	public Estadio modificar() {
		// Se modifica el Objeto Estadio en la Base de Datos
		LOG.info("Modificar estadio");
		return estadio;
	}

}
