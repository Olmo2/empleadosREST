package com.olmo.EmpleadosREST.negocio;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.olmo.EmpleadosREST.beans.Departamento;
import com.olmo.EmpleadosREST.beans.Direccion;
import com.olmo.EmpleadosREST.beans.Pais;
import com.olmo.EmpleadosREST.beans.Trabajador;
import com.olmo.EmpleadosREST.beans.Trabajo;
import com.olmo.EmpleadosREST.repositorio.DepartamentoDAO;
import com.olmo.EmpleadosREST.repositorio.DireccionDAO;
import com.olmo.EmpleadosREST.repositorio.PaisDAO;
import com.olmo.EmpleadosREST.repositorio.TrabajadorDAO;
import com.olmo.EmpleadosREST.repositorio.TrabajoDAO;



@RestController
public class Rutas {
	
	
	@Autowired
	DepartamentoDAO deptDAO;
	
	@Autowired
	DireccionDAO direccionDAO;
	
	@Autowired
	PaisDAO paisDAO;
	
	@Autowired
	TrabajadorDAO trabajadorDAO;
	
	@Autowired
	TrabajoDAO trabajoDAO;
	
	
	@GetMapping("/departamento/{id}")
	public Optional<Departamento> departamento(@PathVariable Integer id) {
		
		Optional<Departamento> dept;
		dept = deptDAO.findById(id);
		
		
	return dept;
	}
	
	@GetMapping("/direccion/{id}")
	public Optional<Direccion> direccion(@PathVariable Integer id) {
		
		Optional<Direccion> dir;
		dir = direccionDAO.findById(id);
		
		
	return dir;
	}
	
	@GetMapping("/pais/{id}")
	public Optional<Pais> pais(@PathVariable String id) {
		
		Optional<Pais> pais;
		pais = paisDAO.findById(id);
		
		
	return pais;
	}
	
	@GetMapping("/trabajador/{id}")
	public Optional<Trabajador> trabajador(@PathVariable Integer id) {
		
		Optional<Trabajador> trabajador;
		trabajador = trabajadorDAO.findById(id);
		
	return trabajador;
	}
	
	@GetMapping("/trabajo/{id}")
	public Optional<Trabajo> trabajo(@PathVariable Integer id) {
		
		Optional<Trabajo> trabajo;
		trabajo = trabajoDAO.findById(id);
		
	return trabajo;
	}
	

}
