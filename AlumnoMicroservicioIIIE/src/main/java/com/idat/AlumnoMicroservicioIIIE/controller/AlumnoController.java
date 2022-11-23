package com.idat.AlumnoMicroservicioIIIE.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.idat.AlumnoMicroservicioIIIE.dto.AlumnoDTO;
import com.idat.AlumnoMicroservicioIIIE.service.AlumnoService;

@Controller
@RequestMapping("/api/alumno/v1")
public class AlumnoController {
	
	@Autowired
	private AlumnoService service;
	
	@GetMapping("/hola")
	public @ResponseBody String hola() {
		return "Hoa querido profesor";
	}
	
	@GetMapping("/listar")
	public @ResponseBody List<AlumnoDTO> listar() {
		return service.listar();
	}
	
	@GetMapping("/listar{id}")
	public @ResponseBody AlumnoDTO obtenerId(@PathVariable Integer id) {
		  return service.obtenerId(id);
	}
	
	@PostMapping("/guardar")
	public @ResponseBody void guardar(@RequestBody AlumnoDTO dto) {
		service.guardar(dto);
	}
	
	@PostMapping("/actualizar")
	public @ResponseBody void actualizar(@RequestBody AlumnoDTO dto) {
		service.actualizar(dto);
	}
	
	@PostMapping("/eliminar/{id}")
	public @ResponseBody void eliminar(@RequestBody Integer id) {
		service.eliminar(id);
	}

}