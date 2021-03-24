package com.olmo.EmpleadosREST.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.olmo.EmpleadosREST.beans.Pais;

@Service
public class PaisDTO {

	
	
	private String id;
	
	private String nombre;
	
	private List<String> direcciones = new ArrayList<String>();

	
	
	public PaisDTO() {
		super();
	}

	
	public PaisDTO(Pais pais) {
		super();
		this.id = pais.getId();
		this.nombre = pais.getNombre();
		for(int i= 0;i<pais.getDirecciones().size();i++) {
			this.direcciones.add(pais.getDirecciones().get(i).getCalle());
		}
	}





	public PaisDTO(String id, String nombre, List<String> direcciones) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.direcciones = direcciones;
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

	public List<String> getDirecciones() {
		return direcciones;
	}

	public void setDirecciones(List<String> direcciones) {
		this.direcciones = direcciones;
	}
	
	
	
}
