package com.idat.AlumnoMicroservicioIIIE.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "alumnos")
public class Alumno {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idAlumno;
	private String nombre;
	private String apellido;
	
	public Alumno() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Alumno(Integer idAlumno, String nombre, String apellido) {
		super();
		this.idAlumno = idAlumno;
		this.nombre = nombre;
		this.apellido = apellido;
	}
	public Integer getIdAlumno() {
		return idAlumno;
	}
	public void setIdAlumno(Integer idAlumno) {
		this.idAlumno = idAlumno;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	

}
