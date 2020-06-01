package ar.edu.unju.fi.repository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import ar.edu.unju.fi.Tolaba3817Tp5Application;
import ar.edu.unju.fi.model.Usuario;
/**
 * Con esta clase se implementa todo lo definido en la
 * interfaz IUsuario
 * A continuacion se utiliza @Repository para que esta 
 * clase sea administrada por Spring
 * @author Jorge Tolaba
 */
@Repository("usuarioImp")
public class UsuarioImp implements IUsuario {
	/**
	 * Creacion de la variable usuario
	 * Autoinyeccion de dependencias
	 */
	@Autowired
	private Usuario usuario;
	/**
	 * Definicion del atributo Logger
	 */
	public static Logger LOG = LoggerFactory.getLogger(Tolaba3817Tp5Application.class);

	@Override
	public void guardar() {
		// Accion realizada para guardar un objeto Usuario en la Base de Datos
		LOG.info("El usuario "+usuario.getNombre()+" "+usuario.getApellido()+" fue guardado "+" DNI: "+usuario.getDni());
	}

	@Override
	public Usuario mostrar() {
		// Se recuperan todos los datos de la Usuario
		LOG.info("Mostrar los datos del usuario");
		return usuario;
	}

	@Override
	public void eliminar() {
		//Se elimina el Objeto Usuario de la Base de Datos
		LOG.info("Se elimino el usuario de la BD");
	}

	@Override
	public Usuario modificar() {
		// Se modifica el Objeto Usuario en la Base de Datos
		LOG.info("Modificando un usuario");
		return usuario;
	}
}


