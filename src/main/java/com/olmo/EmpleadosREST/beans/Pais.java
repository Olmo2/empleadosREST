package com.olmo.EmpleadosREST.beans;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name="paises")
public class Pais {

	
	@Id
	private String id;
	
	@Column
	private String nombre;
	
	@OneToMany(fetch = FetchType.EAGER, mappedBy = "pais")
	@JsonManagedReference/*anotacion para evitar bucles*/
	private List<Direccion> direcciones = new ArrayList<Direccion>();
	
	public void addDireccion(Direccion dir) {

		if (!direcciones.contains(dir)) {

			direcciones.add(dir);
		}
	}
	

	public Pais() {
		super();
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Direccion> getDirecciones() {
		return direcciones;
	}

	public void setDirecciones(List<Direccion> direcciones) {
		this.direcciones = direcciones;
	}


	@Override
	public String toString() {
		return  nombre ;
	}
	
	
	
}
