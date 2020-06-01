package ar.edu.unju.fi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import ar.edu.unju.fi.model.Resultado;
import ar.edu.unju.fi.repository.IResultado;
/**
 * Con esta clase se implementa todo lo definido en la
 * interfaz IResultadoService
 * A continuacion se utiliza @Repository para que esta 
 * clase sea administrada por Spring
 * @author Jorge Tolaba
 */
@Repository
public class ResultadoServiceImp implements IResultadoService {
	/**
	 * Creacion de la variable iresultado
	 * Autoinyeccion de dependencias
	 */
	@Autowired
	private IResultado iresultado;

	@Override
	public void guardar() {
		// TODO Auto-generated method stub
		iresultado.guardar();

	}

	@Override
	public Resultado mostrar() {
		// TODO Auto-generated method stub
		Resultado resultado=iresultado.mostrar();
		return resultado;
	}

	@Override
	public void eliminar() {
		// TODO Auto-generated method stub
		iresultado.eliminar();

	}

	@Override
	public Resultado modificar() {
		// TODO Auto-generated method stub
		Resultado resultado=iresultado.modificar();
		return resultado;
	}

}
