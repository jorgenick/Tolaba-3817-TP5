package ar.edu.unju.fi.service;

import ar.edu.unju.fi.model.Cuota;
/**
 * Creacion de la interfaz ICuotaService para disminuir el acoplamiento
 * @author Jorge Tolaba
 */
public interface ICuotaService {
	
	public void guardar();
	public Cuota mostrar();
	public void eliminar();
	public Cuota modificar();
}
