package com.mx.crudalumnosnivel.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mx.crudalumnosnivel.dao.AlumnoDao;
import com.mx.crudalumnosnivel.dominio.Alumno;

@Service
public class AlumnoServImpl implements AlumnoServ {

	@Autowired
	AlumnoDao alumnoDao;

	@Override
	public void guardar(Alumno alumno) {
		

		alumnoDao.save(alumno);
	}

	@Override
	public void editar(Alumno alumno) {
		

		alumnoDao.save(alumno);
	}

	@Override
	public void eliminar(Alumno alumno) {
		
		alumnoDao.delete(alumno);

	}

	@Override
	public Alumno buscar(Alumno alumno) {
		
		return alumnoDao.findById(alumno.getId()).orElse(null);
	}

	@Override
	public List<Alumno> listar() {
		// TODO Auto-generated method stub
		return (List<Alumno>) alumnoDao.findAll();
	}

}

//By Eliezer SF