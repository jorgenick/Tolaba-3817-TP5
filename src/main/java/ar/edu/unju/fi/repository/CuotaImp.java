package ar.edu.unju.fi.repository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import ar.edu.unju.fi.Tolaba3817Tp5Application;
import ar.edu.unju.fi.model.Cuota;
/**
 * Con esta clase se implementa todo lo definido en la
 * interfaz ICuota
 * A continuacion se utiliza @Repository para que esta 
 * clase sea administrada por Spring
 * @author Jorge Tolaba
 */
@Repository("cuotaImp")
public class CuotaImp implements ICuota {
	/**
	 * Creacion de la variable cuota
	 * Autoinyeccion de dependencias
	 */
	@Autowired
	private Cuota cuota;
/**
 * Definicion del atributo Logger
 */
	public static Logger LOG = LoggerFactory.getLogger(Tolaba3817Tp5Application.class);
	
	@Override
	public void guardar() {
		// Accion realizada para guardar un objeto Cuota en la Base de Datos
		LOG.info("La cuota del Usuario "+cuota.getUsuario().getNombre()+" "+cuota.getUsuario().getApellido()+" fue guardada "+", Monto guardado: $"+cuota.getMonto());
	}

	@Override
	public Cuota mostrar() {
		// Se recuperan todos los datos de la Cuota
		LOG.info("Mostrar cuota");
		return cuota;
	}

	@Override
	public void eliminar() {
		//Se elimina el Objeto Cuota de la Base de Datos
		LOG.info("Eliminar cuota");

	}
	
	@Override
	public Cuota modificar() {
		// Se modifica el Objeto Cuota en la Base de Datos
		LOG.info("Modificar cuota");
		return cuota;
	}

}
