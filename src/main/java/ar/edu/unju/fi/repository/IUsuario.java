package ar.edu.unju.fi.repository;

import ar.edu.unju.fi.model.Usuario;
/**
 * Creacion de la interfaz IUsuario para disminuir el acoplamiento
 * @author Jorge Tolaba
 */
public interface IUsuario {
	public void guardar();
	public Usuario mostrar();
	public void eliminar();
	public Usuario modificar();
}
