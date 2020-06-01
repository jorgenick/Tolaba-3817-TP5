package ar.edu.unju.fi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import ar.edu.unju.fi.model.Estadio;
import ar.edu.unju.fi.repository.IEstadio;
/**
 * Con esta clase se implementa todo lo definido en la
 * interfaz IEstadioService
 * A continuacion se utiliza @Repository para que esta 
 * clase sea administrada por Spring
 * @author Jorge Tolaba
 */
@Repository
public class EstadioServiceImp implements IEstadioService {
	/**
	 * Creacion de la variable iestadio
	 * Autoinyeccion de dependencias
	 */
	@Autowired
	private IEstadio iestadio;

	@Override
	public void guardar() {
		// TODO Auto-generated method stub
		iestadio.guardar();

	}

	@Override
	public Estadio mostrar() {
		// TODO Auto-generated method stub
		Estadio estadio= iestadio.mostrar();
		return estadio;
	}

	@Override
	public void eliminar() {
		// TODO Auto-generated method stub
		iestadio.eliminar();

	}

	@Override
	public Estadio modificar() {
		// TODO Auto-generated method stub
		Estadio estadio=iestadio.modificar();
		return estadio;
	}

}
