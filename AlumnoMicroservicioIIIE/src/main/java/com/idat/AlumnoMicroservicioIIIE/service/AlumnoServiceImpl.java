package com.idat.AlumnoMicroservicioIIIE.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.idat.AlumnoMicroservicioIIIE.dto.AlumnoDTO;
import com.idat.AlumnoMicroservicioIIIE.model.Alumno;
import com.idat.AlumnoMicroservicioIIIE.repository.AlumnoRepository;

@Service
public class AlumnoServiceImpl implements AlumnoService {

	@Autowired
	private AlumnoRepository repository;

	@Override
	public List<AlumnoDTO> listar() {

		List<AlumnoDTO> listado = new ArrayList<>();
		AlumnoDTO dto = null;
		List<Alumno> lista = repository.findAll();

		for (Alumno alumno : lista) {
			dto = new AlumnoDTO();
			dto.setApe(alumno.getApellido());
			dto.setNom(alumno.getNombre());
			dto.setCod(alumno.getIdAlumno());
			listado.add(dto);

		}

		return listado;
	}

	@Override
	public AlumnoDTO obtenerId(Integer id) {

		Alumno alumno = repository.findById(id).orElse(null);

		AlumnoDTO dto = new AlumnoDTO();
		dto.setApe(alumno.getApellido());
		dto.setNom(alumno.getNombre());
		dto.setCod(alumno.getIdAlumno());

		return dto;
	}

	@Override
	public void guardar(AlumnoDTO alumno) {

		Alumno alu = new Alumno();
		alu.setApellido(alumno.getApe());
		alu.setNombre(alumno.getNom());
		alu.setIdAlumno(alumno.getCod());

		repository.save(alu);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		repository.deleteById(id);
	}

	@Override
	public void actualizar(AlumnoDTO alumno) {

		Alumno alu = new Alumno();
		alu.setApellido(alumno.getApe());
		alu.setNombre(alumno.getNom());
		alu.setIdAlumno(alumno.getCod());

		repository.saveAndFlush(alu);
	}

}
