package com.mx.crudalumnosnivel.dominio;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "ALUMNOS3")
public class Alumno {

	/* CREATE TABLE ALUMNOS3(
ID NUMBER PRIMARY KEY,
NOMBRE NVARCHAR2(60),
APATERNO NVARCHAR2(60),
AMATERNO NVARCHAR2(60),
FNACIMIENTO NVARCHAR2(20),
TELEFONO NVARCHAR2(13),
ID_NIVEL NUMBER,
CONSTRAINT FK_NIVEL_ALUMNOS3 FOREIGN KEY (ID_NIVEL) REFERENCES NIVEL(ID_NIVEL)
);*/
	
	@Id
	int id;
	String nombre;
	String apaterno;
	String amaterno;
	String fnacimiento;
	int telefono;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "ID_NIVEL")
	Nivel nivel;

	public Alumno() {
		
	}

	public Alumno(int id, String nombre, String apaterno, String amaterno, String fnacimiento, int telefono,
			Nivel nivel) {
	
		this.id = id;
		this.nombre = nombre;
		this.apaterno = apaterno;
		this.amaterno = amaterno;
		this.fnacimiento = fnacimiento;
		this.telefono = telefono;
		this.nivel = nivel;
	}

	@Override
	public String toString() {
		return "Alumno [id=" + id + ", nombre=" + nombre + ", apaterno=" + apaterno + ", amaterno=" + amaterno
				+ ", fnacimiento=" + fnacimiento + ", telefono=" + telefono + ", nivel=" + nivel + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApaterno() {
		return apaterno;
	}

	public void setApaterno(String apaterno) {
		this.apaterno = apaterno;
	}

	public String getAmaterno() {
		return amaterno;
	}

	public void setAmaterno(String amaterno) {
		this.amaterno = amaterno;
	}

	public String getFnacimiento() {
		return fnacimiento;
	}

	public void setFnacimiento(String fnacimiento) {
		this.fnacimiento = fnacimiento;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	public Nivel getNivel() {
		return nivel;
	}

	public void setNivel(Nivel nivel) {
		this.nivel = nivel;
	}
	
	
	
	
}

//By Eliezer SF
