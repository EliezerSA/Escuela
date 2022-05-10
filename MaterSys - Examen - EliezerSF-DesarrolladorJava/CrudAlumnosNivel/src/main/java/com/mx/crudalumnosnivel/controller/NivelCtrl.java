package com.mx.crudalumnosnivel.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mx.crudalumnosnivel.servicio.NivelServ;

@Controller
@RequestMapping("ctrl/nivel")
public class NivelCtrl {

	@Autowired
	NivelServ nivelServ;
	@GetMapping("listar")
	public String listar(Model model){
		
		var lista = nivelServ.listar();
		model.addAttribute("lista", lista);
		return "indexNivel";
		
	}
}

//By Eliezer SF