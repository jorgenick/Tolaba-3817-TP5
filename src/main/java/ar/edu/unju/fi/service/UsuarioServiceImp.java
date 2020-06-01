package ar.edu.unju.fi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import ar.edu.unju.fi.model.Usuario;
import ar.edu.unju.fi.repository.IUsuario;
/**
 * Con esta clase se implementa todo lo definido en la
 * interfaz IUsuarioService
 * A continuacion se utiliza @Repository para que esta 
 * clase sea administrada por Spring
 * @author Jorge Tolaba
 */
@Repository
public class UsuarioServiceImp implements IUsuarioService {
	/**
	 * Creacion de la variable iusuario
	 * Autoinyeccion de dependencias
	 */
	@Autowired
	private IUsuario iusuario;

	@Override
	public void guardar() {
		iusuario.guardar();
	}

	@Override
	public Usuario mostrar() {
		Usuario usuario=iusuario.mostrar();
		return usuario;
	}

	@Override
	public void eliminar() {
		iusuario.eliminar();

	}

	@Override
	public Usuario modificar() {
		Usuario usuario= iusuario.modificar();
		return usuario;
	}

}
