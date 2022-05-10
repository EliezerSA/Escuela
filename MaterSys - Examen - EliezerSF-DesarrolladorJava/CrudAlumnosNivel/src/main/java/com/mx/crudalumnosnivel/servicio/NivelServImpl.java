package com.mx.crudalumnosnivel.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mx.crudalumnosnivel.dao.NivelDao;
import com.mx.crudalumnosnivel.dominio.Nivel;

@Service
public class NivelServImpl implements NivelServ {

	@Autowired
	NivelDao nivelDao;

	@Override
	public void guardar(Nivel nivelObj) {
		nivelDao.save(nivelObj);

	}

	@Override
	public void editar(Nivel nivelObj) {
		nivelDao.save(nivelObj);

	}

	
	@Override
	public void eliminar(Nivel nivelObj) {
		
		nivelDao.delete(nivelObj);

	}

	@Override
	public Nivel buscar(Nivel nivelObj) {
	
		return nivelDao.findById(nivelObj.getIdNivel()).orElse(null);
	}

	@Override
	public List<Nivel> listar() {
		
		return (List<Nivel>) nivelDao.findAll();
	}

}

//By Eliezer SF