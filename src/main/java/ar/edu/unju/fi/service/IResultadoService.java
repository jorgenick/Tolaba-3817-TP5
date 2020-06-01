package ar.edu.unju.fi.service;

import ar.edu.unju.fi.model.Resultado;
/**
 * Creacion de la interfaz IResultadoService para disminuir el acoplamiento
 * @author Jorge Tolaba
 */
public interface IResultadoService {
	public void guardar();
	public Resultado mostrar();
	public void eliminar();
	public Resultado modificar();

}
