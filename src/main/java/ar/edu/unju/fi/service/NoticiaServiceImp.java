package ar.edu.unju.fi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import ar.edu.unju.fi.model.Noticia;
import ar.edu.unju.fi.repository.INoticia;
/**
 * Con esta clase se implementa todo lo definido en la
 * interfaz INoticiaService
 * A continuacion se utiliza @Repository para que esta 
 * clase sea administrada por Spring
 * @author Jorge Tolaba
 */
@Repository
public class NoticiaServiceImp implements INoticiaService {
	/**
	 * Creacion de la variable inoticia
	 * Autoinyeccion de dependencias
	 */
	@Autowired
	private INoticia inoticia;

	@Override
	public void guardar() {
		inoticia.guardar();
	}

	@Override
	public Noticia mostrar() {
		Noticia noticia=inoticia.mostrar();
		return noticia;
	}

	@Override
	public void eliminar() {
		inoticia.eliminar();

	}

	@Override
	public Noticia modificar() {
		Noticia noticia=inoticia.modificar();
		return noticia;
	}

}
