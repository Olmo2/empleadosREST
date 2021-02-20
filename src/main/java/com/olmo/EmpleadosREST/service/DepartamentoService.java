package com.olmo.EmpleadosREST.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;

import com.olmo.EmpleadosREST.beans.Departamento;
import com.olmo.EmpleadosREST.repositorio.DepartamentoDAO;

public class DepartamentoService {
	
	@Autowired
	private DepartamentoDAO deptDAO;
	
	
	@Transactional
	public List<Departamento> findAll(){
		
		return (List<Departamento>) deptDAO.findAll();
	}
	
	@Transactional
	public List<Departamento> findById(Integer id){
		
		return (List<Departamento>) deptDAO.findById(id).orElse(null);
		
		
	}

}
