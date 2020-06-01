package ar.edu.unju.fi.repository;

import ar.edu.unju.fi.model.Equipo;
/**
 * Creacion de la interfaz IEquipo para disminuir el acoplamiento
 * @author Jorge Tolaba
 */
public interface IEquipo {
	public void guardar();
	public Equipo mostrar();
	public void eliminar();
	public Equipo modificar();
}
