package ar.edu.unju.fi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import ar.edu.unju.fi.service.IUsuarioService;
/**
 * Con Cotroller le decimos a la applicacion que esta clase 
 * va a actuar como un controlador
 * @author Jorge Tolaba
 */
@Controller
public class MainCotroller {
	/**
	 * Autoinyeccion de dependencias
	 */
	@Autowired
	private IUsuarioService usuarioService;
//Se Escanea desde la raiz
	@RequestMapping("/")
	public String main(Model model) {
		model.addAttribute("usuario",usuarioService.mostrar().getNombre());
		model.addAttribute("apellido",usuarioService.mostrar().getApellido());
		return "index";
	}
	
	@RequestMapping("/formularios")
	public String formularios(Model model) {
		model.addAttribute("usuario",usuarioService.mostrar().getNombre());
		model.addAttribute("apellido",usuarioService.mostrar().getApellido());
		return "formularios";
	}
	@RequestMapping("/equipos")
	public String equipos(Model model) {

		return "equipos";
	}
	
	@RequestMapping("/fixture")
	public String fixture(Model model) {

		return "fixture";
	}

}
