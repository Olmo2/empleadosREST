package com.olmo.EmpleadosREST.beans;


import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name = "departamentos")
public class Departamento {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;

	@Column
	private String nombre;

	@ManyToOne
	@JsonBackReference
	private Direccion dir = new Direccion();

	@OneToMany(fetch = FetchType.EAGER, mappedBy = "dept")
	@JsonManagedReference
	private List<Trabajador> trabajadores = new ArrayList<>();

	public void addTrabajador(Trabajador trabajador) {

		if (!trabajadores.contains(trabajador)) {

			trabajadores.add(trabajador);
		}
	}


	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Direccion getDir() {
		return dir;
	}

	public void setDir(Direccion dir) {
		this.dir = dir;
	}

	public List<Trabajador> getTrabajadores() {
		return trabajadores;
	}

	public void setTrabajadores(List<Trabajador> trabajadores) {
		this.trabajadores = trabajadores;
	}

	@Override
	public String toString() {
		return "Nombre=" + nombre ;
	}
	
	

}
