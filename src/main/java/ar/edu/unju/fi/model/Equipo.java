package ar.edu.unju.fi.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
/**
 * Creacion de la Clase Equipo
 * Para que la Clase Equipo sea administrada por el
 * contenedor de Spring agregamos la anotacion @Component 
 * @author Jorge Tolaba
 */
@Component
/**
 * @Entity Se establece que esta clase se 
 * comportara como una entidad
 */
//@Entity
//@Table(name ="equipos")
public class Equipo {
	/**
	 * nombre del equipo
	 */
	private String nombre;
	/**
	 * Datos del estadio 
	 * Se utiliza la anotacion @Autowired para realizar la inyeccion 
	 * dependencias
	 */
	@Autowired
	private Estadio estadio;
//-------------CONSTRUCTORES-------------------
	public Equipo(){
	}
//----------METODOS ACCESORES------------------
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Estadio getEstadio() {
		return estadio;
	}
	public void setEstadio(Estadio estadio) {
		this.estadio = estadio;
	}
	/**
	 * Sobreescritura del metodo ToString
	 */
	@Override
	public String toString() {
		return "Equipo [nombre=" + nombre + ", estadio=" + estadio + "]";
	}
	
}
