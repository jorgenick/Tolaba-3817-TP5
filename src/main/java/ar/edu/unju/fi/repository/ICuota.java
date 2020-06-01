package ar.edu.unju.fi.repository;

import ar.edu.unju.fi.model.Cuota;
/**
 * Creacion de la interfaz ICuota para disminuir el acoplamiento
 * @author Jorge Tolaba
 */
public interface ICuota {
	public void guardar();
	public Cuota mostrar();
	public void eliminar();
	public Cuota modificar();
}
