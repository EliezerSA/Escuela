package com.mx.crudalumnosnivel.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mx.crudalumnosnivel.dominio.Nivel;
import com.mx.crudalumnosnivel.servicio.NivelServ;

@RestController
@RequestMapping("NivelWs")
@CrossOrigin
public class NivelWs {

	@Autowired
	NivelServ nivelServ;
	
	@GetMapping("listar")
	public List<Nivel> listar(){
		List<Nivel> lista= nivelServ.listar();
		return lista;
	}
	//Verificar en Postman
	@PostMapping("buscar")
	public Nivel buscar(@RequestBody Nivel nivel) {
		return nivelServ.buscar(nivel);
	}
	@PostMapping("guardar")
	public void guardar(@RequestBody Nivel nivel) {
		nivelServ.guardar(nivel);
	}
	@PostMapping("editar")
	public void editar(@RequestBody Nivel nivel) {
		nivelServ.editar(nivel);
	}
	@PostMapping("eliminar")
	public void eliminar(@RequestBody Nivel nivel) {
		nivelServ.eliminar(nivel);
	}
}
//By Eliezer SF
