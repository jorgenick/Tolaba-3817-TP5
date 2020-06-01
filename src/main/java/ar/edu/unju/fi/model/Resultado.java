package ar.edu.unju.fi.model;

import java.time.LocalDate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
/**
 * Creacion de la Clase Resultado
 * Para que la Clase Resultado sea administrada por el
 * contenedor de Spring agregamos la anotacion @Component 
 * @author Jorge Tolaba
 */
@Component
public class Resultado {
	/**
	 * Fecha de Resultado
	 */
	private LocalDate fecha;
	/**
	 * Datos del equipo1 
	 * Se utiliza la anotacion @Autowired para realizar la inyeccion 
	 * dependencias
	 */
	@Autowired
	private Equipo equipo1;
	/**
	 * Datos del equipo2 
	 * Se utiliza la anotacion @Autowired para realizar la inyeccion 
	 * dependencias
	 */
	@Autowired
	private Equipo equipo2;
	/**
	 * Cantidad de goles Equipo 1
	 */
	private int golesEquipo1;
	/**
	 * Cantidad de goles Equipo 2
	 */
	private int golesEquipo2;
//-------------CONSTRUCTORES-----------------
	public Resultado() {
	}
//----------METODOS ACCESORES--------------
	public LocalDate getFecha() {
		return fecha;
	}
	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}
	public Equipo getEquipo1() {
		return equipo1;
	}
	public void setEquipo1(Equipo equipo1) {
		this.equipo1 = equipo1;
	}
	public Equipo getEquipo2() {
		return equipo2;
	}
	public void setEquipo2(Equipo equipo2) {
		this.equipo2 = equipo2;
	}
	public int getGolesEquipo1() {
		return golesEquipo1;
	}
	public void setGolesEquipo1(int golesEquipo1) {
		this.golesEquipo1 = golesEquipo1;
	}
	public int getGolesEquipo2() {
		return golesEquipo2;
	}
	public void setGolesEquipo2(int golesEquipo2) {
		this.golesEquipo2 = golesEquipo2;
	}
	/**
	 * Sobreescritura del metodo ToString
	 */
	@Override
	public String toString() {
		return "Resultado [fecha=" + fecha + ", equipo1=" + equipo1 + ", equipo2=" + equipo2 + ", golesEquipo1="
				+ golesEquipo1 + ", golesEquipo2=" + golesEquipo2 + "]";
	}
	
}
