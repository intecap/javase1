package co.edu.intecap.inventory.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import co.edu.intecap.inventory.domain.Bodega;
import co.edu.intecap.inventory.repository.BodegaRepository;

@Controller
@RequestMapping(path = "/bodega")
public class BodegaController {

	@GetMapping(path = "/add")
	public @ResponseBody String addNewUser(@RequestParam String nombre, @RequestParam String direccion) {

		Bodega bodega = new Bodega();
		bodega.setNombre(nombre);
		bodega.setDireccion(direccion);
		bodegaRepository.save(bodega);
		return "Saved";
	}

	@GetMapping(path = "/all")
	public @ResponseBody Iterable<Bodega> getAllUsers() {
		return bodegaRepository.findAll();
	}

	@Autowired
	private BodegaRepository bodegaRepository;

}
