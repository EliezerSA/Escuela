package com.mx.crudalumnosnivel.dominio;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "NIVEL")
public class Nivel {

	/*CREATE TABLE NIVEL(
			ID_NIVEL NUMBER PRIMARY KEY,
			DESCRIPCION NVARCHAR2(100)
			);*/
	
	@Id
	int idNivel;
	String descripcion;
	
	@OneToMany(mappedBy = "nivel", cascade = CascadeType.ALL)
	List<Alumno> lista = new ArrayList<Alumno>();

	public Nivel() {
		
	}

	public Nivel(int idNivel, String descripcion, List<Alumno> lista) {
		
		this.idNivel = idNivel;
		this.descripcion = descripcion;
		this.lista = lista;
	}

	@Override
	public String toString() {
		return "Nivel [idNivel=" + idNivel + ", descripcion=" + descripcion + ", lista=" + lista + "]";
	}

	public int getIdNivel() {
		return idNivel;
	}

	public void setIdNivel(int idNivel) {
		this.idNivel = idNivel;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public List<Alumno> getLista() {
		return lista;
	}

	public void setLista(List<Alumno> lista) {
		this.lista = lista;
	}
	
	

}

//By Eliezer SF