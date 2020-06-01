package ar.edu.unju.fi.service;

import ar.edu.unju.fi.model.Estadio;
/**
 * Creacion de la interfaz IEstadioService para disminuir el acoplamiento
 * @author Jorge Tolaba
 */
public interface IEstadioService {
	public void guardar();
	public Estadio mostrar();
	public void eliminar();
	public Estadio modificar();

}
