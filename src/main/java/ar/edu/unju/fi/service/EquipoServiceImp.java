package ar.edu.unju.fi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import ar.edu.unju.fi.model.Equipo;
import ar.edu.unju.fi.repository.IEquipo;
/**
 * Con esta clase se implementa todo lo definido en la
 * interfaz IEquipoService
 * A continuacion se utiliza @Repository para que esta 
 * clase sea administrada por Spring
 * @author Jorge Tolaba
 */
@Repository
public class EquipoServiceImp implements IEquipoService {
	/**
	 * Creacion de la variable iequipo
	 * Autoinyeccion de dependencias
	 */
	 @Autowired
	 private IEquipo iequipo;

	@Override
	public void guardar() {
		// TODO Auto-generated method stub
		iequipo.guardar();

	}

	@Override
	public Equipo mostrar() {
		// TODO Auto-generated method stub
		Equipo equipo = iequipo.mostrar();
		return equipo;
	}

	@Override
	public void eliminar() {
		// TODO Auto-generated method stub
		iequipo.eliminar();
	}

	@Override
	public Equipo modificar() {
		// TODO Auto-generated method stub
		Equipo equipo= iequipo.modificar();
		return equipo;
	}

}
