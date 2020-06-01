package ar.edu.unju.fi.repository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import ar.edu.unju.fi.Tolaba3817Tp5Application;
import ar.edu.unju.fi.model.Resultado;
/**
 * Con esta clase se implementa todo lo definido en la
 * interfaz IResultado
 * A continuacion se utiliza @Repository para que esta 
 * clase sea administrada por Spring
 * @author Jorge Tolaba
 */
@Repository("resultadoImp")
public class ResultadoImp implements IResultado {
	/**
	 * Creacion de la variable resultado
	 * Autoinyeccion de dependencias
	 */
	@Autowired
	private Resultado resultado;
	/**
	 * Definicion del atributo Logger
	 */
	public static Logger LOG = LoggerFactory.getLogger(Tolaba3817Tp5Application.class);
	@Override
	public void guardar() {
		// Accion realizada para guardar un objeto Resultado en la Base de Datos
		LOG.info("Los resultados de la fecha "+resultado.getFecha()+" fueron guardados con exito");

	}

	@Override
	public Resultado mostrar() {
		/// Se recuperan todos los datos de la Resultado
		LOG.info("Mostrar equipos y resultados");
		return resultado;
	}

	@Override
	public void eliminar() {
		//Se elimina el Objeto Resultado de la Base de Datos
		LOG.info("Eliminar equipos y resultados");

	}

	@Override
	public Resultado modificar() {
		// Se modifica el Objeto Resultado en la Base de Datos
		LOG.info("Modificar equipos y resultados");
		return resultado;
	}

}
