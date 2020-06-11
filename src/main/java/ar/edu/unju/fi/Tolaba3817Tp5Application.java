package ar.edu.unju.fi;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ar.edu.unju.fi.model.Cuota;
import ar.edu.unju.fi.model.Equipo;
import ar.edu.unju.fi.model.Estadio;
import ar.edu.unju.fi.model.Noticia;
import ar.edu.unju.fi.model.Resultado;
import ar.edu.unju.fi.model.Usuario;

import ar.edu.unju.fi.service.ICuotaService;
import ar.edu.unju.fi.service.IEquipoService;
import ar.edu.unju.fi.service.IEstadioService;
import ar.edu.unju.fi.service.INoticiaService;
import ar.edu.unju.fi.service.IResultadoService;
import ar.edu.unju.fi.service.IUsuarioService;

@SpringBootApplication
public class Tolaba3817Tp5Application implements CommandLineRunner{
/**
 * Se utiliza la anotacion @Autowired para realizar la autoinyeccion 
 * dependencias de cada una de las clases
 */
	@Autowired
	IUsuarioService usuarioService;
	@Autowired
	Usuario usuario;
	
	@Autowired
	ICuotaService cuotaService;
	@Autowired
	Cuota cuota;
	
	@Autowired
	INoticiaService noticiaService;
	@Autowired
	Noticia noticia;
	
	@Autowired
	IEstadioService estadioService;
	@Autowired
	Estadio estadio;
	
	@Autowired
	IEquipoService equipoService;
	@Autowired
	Equipo equipo;

	@Autowired
	IResultadoService resultadoService;
	@Autowired
	Resultado resultado;
//--------------Arranca el Programa------------------
	public static void main(String[] args) {
		SpringApplication.run(Tolaba3817Tp5Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		//Inicializa las variables del objeto usuario
		usuario.setApellido("Tolaba");
		usuario.setDireccion("Mina sol de mayo n°268 - Barrio Santa Barbara");
		usuario.setDni(37502020);
		usuario.setFechaAlta(LocalDate.now());
		usuario.setFechaNacimiento(LocalDate.of(1993, 06, 17));
		usuario.setNombre("Jorge");
		usuario.setPassword("123");
		usuario.setTipo("SOCIO");
		
		usuarioService.guardar();
		
		//Inicializa las variables del objeto Cuota
		cuota.setEstado("PAGADO");
		cuota.setId(54455);
		cuota.setFechaPago(LocalDate.now());
		cuota.setPeriodo("periodo");
		cuota.setMonto(55.5d);
		cuota.setUsuario(usuario);
		//Se guarda el objeto
		cuotaService.guardar();
		
		//Inicializa las variables del Objeto Noticia
		noticia.setTitulo("Los animales en Africa");
		noticia.setFecha(LocalDate.now());
		noticia.setResumen("Este es un resumen de la notticia");
		//Se guarda el objeto
		noticiaService.guardar();
		
		//Inicializa las variables del Objeto Estadio
		estadio.setCapacidad(1000000);
		estadio.setCuidad("San Salvador de Jujuy");
		estadio.setDireccion("Avenida 9 de julio -258");
		estadio.setFechaFundacion(LocalDate.of(2020, 05, 02));
		estadio.setNombre("Boca");
		//Se guarda el objeto
		estadioService.guardar();
		
		//Inicializa las variables del Objeto Equipo
		equipo.setNombre("Boca");
		equipo.setEstadio(estadio);
		//Se guarda el objeto
		equipoService.guardar();
		
		//Inicializa las variables del Objeto Resultado
//		resultado.setEquipo1(equipo);
//		resultado.setEquipo1(equipo);
		resultado.setFecha(LocalDate.now());
		resultado.setGolesEquipo1(5);
		resultado.setGolesEquipo2(10);
		//Se guarda el objeto
		resultadoService.guardar();
	}

}
