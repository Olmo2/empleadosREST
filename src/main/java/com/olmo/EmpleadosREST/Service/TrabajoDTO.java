package com.olmo.EmpleadosREST.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.olmo.EmpleadosREST.beans.Trabajo;

@Service
public class TrabajoDTO {

	
	private Integer id;
	
	private String nombre;
	
	private float salario_min;
	
	private float salario_max;
	
	private List<String> trabajadores = new ArrayList<>();
	
	
	

	public TrabajoDTO() {
		super();
	}

	public TrabajoDTO(Trabajo trabajo) {
		super();
		this.id = trabajo.getId() ;
		this.nombre = trabajo.getNombre();
		this.salario_min = trabajo.getSalario_min();
		this.salario_max = trabajo.getSalario_max();
		for(int i= 0;i<trabajo.getTrabajadores().size();i++) {
			this.trabajadores.add(trabajo.getTrabajadores().get(i).getNombre());
		}
	}

	public TrabajoDTO(Integer id, String nombre, float salario_min, float salario_max, List<String> trabajadores) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.salario_min = salario_min;
		this.salario_max = salario_max;
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

	public float getSalario_min() {
		return salario_min;
	}

	public void setSalario_min(float salario_min) {
		this.salario_min = salario_min;
	}

	public float getSalario_max() {
		return salario_max;
	}

	public void setSalario_max(float salario_max) {
		this.salario_max = salario_max;
	}

	public List<String> getTrabajadores() {
		return trabajadores;
	}

	public void setTrabajadores(List<String> trabajadores) {
		this.trabajadores = trabajadores;
	}
	
	
}
