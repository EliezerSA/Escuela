package com.mx.crudalumnosnivel.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mx.crudalumnosnivel.dominio.Alumno;
import com.mx.crudalumnosnivel.servicio.AlumnoServ;

@RestController
@RequestMapping("AlumnoWs")
@CrossOrigin
public class AlumnoWs {

	@Autowired
	AlumnoServ alumnoServ;
	
	//http://localhost:4200/AlumnoWs/listar
	@GetMapping("listar")
	public List<Alumno> listar(){
		List<Alumno> lista= alumnoServ.listar();
		return lista;
	}
	
	//Verificar en POSTMAN
	@PostMapping("buscar")
	public Alumno buscar(@RequestBody Alumno alumno) {
		return alumnoServ.buscar(alumno);
	}
	@PostMapping("guardar")
	public void guardar(@RequestBody Alumno alumno) {
		alumnoServ.guardar(alumno);
	}
	@PostMapping("editar")
	public void editar(@RequestBody Alumno alumno) {
		alumnoServ.editar(alumno);
	}
	@PostMapping("eliminar")
	public void eliminar(@RequestBody Alumno alumno) {
		alumnoServ.eliminar(alumno);
	}
}
//By Eliezer SF
