package ar.edu.unju.fi.repository;

import ar.edu.unju.fi.model.Noticia;
/**
 * Creacion de la interfaz INoticia para disminuir el acoplamiento
 * @author Jorge Tolaba
 */
public interface INoticia {
	public void guardar();
	public Noticia mostrar();
	public void eliminar();
	public Noticia modificar();

}
