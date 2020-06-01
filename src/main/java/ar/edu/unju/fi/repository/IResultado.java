package ar.edu.unju.fi.repository;

import ar.edu.unju.fi.model.Resultado;
/**
 * Creacion de la interfaz IResultado para disminuir el acoplamiento
 * @author Jorge Tolaba
 */
public interface IResultado {
	public void guardar();
	public Resultado mostrar();
	public void eliminar();
	public Resultado modificar();

}
