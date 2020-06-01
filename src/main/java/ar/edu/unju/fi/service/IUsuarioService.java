package ar.edu.unju.fi.service;

import ar.edu.unju.fi.model.Usuario;
/**
 * Creacion de la interfaz IUsuarioService para disminuir el acoplamiento
 * @author Jorge Tolaba
 */
public interface IUsuarioService {
	
	public void guardar();
	public Usuario mostrar();
	public void eliminar();
	public Usuario modificar();

}
