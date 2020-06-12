package ar.edu.unju.fi.model;
/**Comentario de prueba GIT HUB
 * 
 */
import java.time.LocalDate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
/**
 * Creacion de la Clase Cuota
 * Para que la Clase Cuota sea administrada por el
 * contenedor de Spring agregamos la anotacion @Component 
 * @author Jorge Tolaba
 */
@Component
public class Cuota {
/**
 * id de la cuota
 */
private long id;
/**
 * Fecha de pago de la cuota
 */
private LocalDate fechaPago;
/**
 * Periodo que abarca la cuota
 */
private String periodo;
/**
 * Monto de la cuota
 */
private double monto;
/**
 * Estado de la cuota (Pagado/NO Pagado)
 */
private String estado;
/**
 * Datos del usuario
 * Se utiliza la anotacion @Autowired para realizar la inyeccion 
 * dependencias
 */
@Autowired
private Usuario usuario;
//-------------CONSTRUCTORES-----------
	public Cuota() {
	}
//-------METODOS ACCESORES-----------
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public LocalDate getFechaPago() {
		return fechaPago;
	}
	public void setFechaPago(LocalDate fechaPago) {
		this.fechaPago = fechaPago;
	}
	public String getPeriodo() {
		return periodo;
	}
	public void setPeriodo(String periodo) {
		this.periodo = periodo;
	}
	public double getMonto() {
		return monto;
	}
	public void setMonto(double monto) {
		this.monto = monto;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	/**
	 * Sobreescritura del metodo ToString
	 */
	@Override
	public String toString() {
		return "Cuota [id=" + id + ", fechaPago=" + fechaPago + ", periodo=" + periodo + ", monto=" + monto
				+ ", estado=" + estado + ", usuario=" + usuario + "]";
	}
	
}
