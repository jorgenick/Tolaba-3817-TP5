package ar.edu.unju.fi.repository;

import ar.edu.unju.fi.model.Estadio;
/**
 * Creacion de la interfaz IEstadio para disminuir el acoplamiento
 * @author Jorge Tolaba
 */
public interface IEstadio {
	public void guardar();
	public Estadio mostrar();
	public void eliminar();
	public Estadio modificar();
	
}
