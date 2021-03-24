package com.olmo.EmpleadosREST.Service;


import java.util.ArrayList;
import java.util.List;



import org.springframework.stereotype.Service;

import com.olmo.EmpleadosREST.beans.Departamento;

@Service
public class DepartamentoDTO{

	private Integer id;

	
	private String nombre;

	
	private DireccionDTO dir = new DireccionDTO();

	
	private List<String> trabajadores = new ArrayList<>();

	

	public DepartamentoDTO() {
		super();
	}

	public DepartamentoDTO(Departamento dept) {
		super();
		this.id = dept.getId();
		this.nombre = dept.getNombre();
		this.dir = new DireccionDTO(dept.getDir());
		for(int i= 0;i<dept.getTrabajadores().size();i++) {
			this.trabajadores.add(dept.getTrabajadores().get(i).getNombre());
		}
	}

	public DepartamentoDTO(Integer id, String nombre, DireccionDTO dir, List<String> trabajadores) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.dir = dir;
		this.trabajadores = trabajadores;
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


	public DireccionDTO getDir() {
		return dir;
	}


	public void setDir(DireccionDTO dir) {
		this.dir = dir;
	}


	public List<String> getTrabajadores() {
		return trabajadores;
	}


	public void setTrabajadores(List<String> trabajadores) {
		this.trabajadores = trabajadores;
	}
	


	
	
	
	
}
