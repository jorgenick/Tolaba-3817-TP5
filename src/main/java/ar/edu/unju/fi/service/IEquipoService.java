package ar.edu.unju.fi.service;

import ar.edu.unju.fi.model.Equipo;
/**
 * Creacion de la interfaz IEquipoService para disminuir el acoplamiento
 * @author Jorge Tolaba
 */
public interface IEquipoService {
	public void guardar();
	public Equipo mostrar();
	public void eliminar();
	public Equipo modificar();

}
