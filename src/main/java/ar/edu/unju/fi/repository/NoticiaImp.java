package ar.edu.unju.fi.repository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import ar.edu.unju.fi.Tolaba3817Tp5Application;
import ar.edu.unju.fi.model.Noticia;
/**
 * Con esta clase se implementa todo lo definido en la
 * interfaz INoticia
 * A continuacion se utiliza @Repository para que esta 
 * clase sea administrada por Spring
 * @author Jorge Tolaba
 */
@Repository("noticiaImp")
public class NoticiaImp implements INoticia {
	/**
	 * Creacion de la variable noticia
	 * Autoinyeccion de dependencias
	 */
	@Autowired
	private Noticia noticia;
	/**
	 * Definicion del atributo Logger
	 */
	public static Logger LOG = LoggerFactory.getLogger(Tolaba3817Tp5Application.class);
	
	@Override
	public void guardar() {
		// Accion realizada para guardar un objeto Noticia en la Base de Datos
		LOG.info("La Noticia "+noticia.getTitulo()+" fue guardada con exito");
	}

	@Override
	public Noticia mostrar() {
		// Se recuperan todos los datos de la Noticia
		LOG.info("Mostrar noticia");
		return noticia;
	}

	@Override
	public void eliminar() {
		//Se elimina el Objeto Noticia de la Base de Datos
		LOG.info("Eliminar noticia");

	}

	@Override
	public Noticia modificar() {
		// Se modifica el Objeto Noticia en la Base de Datos
		LOG.info("Modificar noticia");
		return noticia;
	}

}
