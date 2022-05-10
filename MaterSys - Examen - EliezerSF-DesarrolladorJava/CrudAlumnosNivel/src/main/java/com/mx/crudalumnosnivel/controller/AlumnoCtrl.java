package com.mx.crudalumnosnivel.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mx.crudalumnosnivel.servicio.AlumnoServ;

@Controller
@RequestMapping("ctrl/alumno")
public class AlumnoCtrl {

	@Autowired
	AlumnoServ alumnoServ;
	@GetMapping("listar")
	public String listar(Model model){
		
		var lista = alumnoServ.listar();
		model.addAttribute("lista", lista);
		return "indexAlumno";
		
	}
}
//By Eliezer SF