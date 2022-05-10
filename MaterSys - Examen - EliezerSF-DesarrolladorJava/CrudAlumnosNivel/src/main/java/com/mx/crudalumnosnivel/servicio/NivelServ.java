package com.mx.crudalumnosnivel.servicio;

import java.util.List;

import com.mx.crudalumnosnivel.dominio.Nivel;


public interface NivelServ {

	public void guardar(Nivel nivelObj);
	public void editar(Nivel nivelObj);
	public void eliminar(Nivel nivelObj);

	public Nivel buscar(Nivel nivelObj);
	public List<Nivel> listar();
}

//By Eliezer SF