package ar.edu.unju.fi.model;

import java.time.LocalDate;
import org.springframework.stereotype.Component;
/**
 * Creacion de la Clase Noticia
 * Para que la Clase Noticia sea administrada por el
 * contenedor de Spring agregamos la anotacion @Component 
 * @author Jorge Tolaba
 */
@Component
public class Noticia {
	/**
	 * fecha de la Noticia
	 */
	private LocalDate fecha;
	/**
	 * Titulo de la Noticia
	 */
	private String titulo;
	/**
	 * Resumen de Noticia
	 */
	private String resumen;
//---------CONSTRUCTORES---------------
	public Noticia() {
	}
//---------METODOS ACCESORES------------
	public LocalDate getFecha() {
		return fecha;
	}
	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getResumen() {
		return resumen;
	}
	public void setResumen(String resumen) {
		this.resumen = resumen;
	}
	/**
	 * Sobreescritura del metodo ToString
	 */
	@Override
	public String toString() {
		return "Noticia [fecha=" + fecha + ", titulo=" + titulo + ", resumen=" + resumen + "]";
	}
	
}
