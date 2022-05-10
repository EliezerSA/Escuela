package com.mx.crudalumnosnivel.servicio;

import java.util.List;

import com.mx.crudalumnosnivel.dominio.Alumno;


public interface AlumnoServ {

	public void guardar(Alumno alumno);
	public void editar(Alumno alumno);
	public void eliminar(Alumno alumno);
	public Alumno buscar(Alumno alumno);
	
	public List<Alumno> listar();
}

//By Eliezer SF