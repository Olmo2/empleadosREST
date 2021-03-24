package com.olmo.EmpleadosREST.Service;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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

@Service
public class ServiceDTO {
	
	@Autowired
	private DepartamentoDAO deptDAO;
	
	@Autowired
	private DireccionDAO dirDAO;
	
	@Autowired
	private PaisDAO paisDAO;
	
	@Autowired
	private TrabajadorDAO trabajadorDAO;
	
	@Autowired
	private TrabajoDAO trabajoDAO;
	
	
	
	/*DEPARTAMENTO*/
	@Transactional
	public List<DepartamentoDTO> findAllDept() {
		
		List<Departamento> lista=(List<Departamento>) deptDAO.findAll();
		List<DepartamentoDTO> listaDTO = new ArrayList<>();
		for(int i=0;i<lista.size();i++) {
			listaDTO.add(new DepartamentoDTO(lista.get(i)));
		}		
		return listaDTO;
	}
	
	@Transactional
	public DepartamentoDTO findDeptById(Integer id){
		
		return new DepartamentoDTO(deptDAO.findById(id).orElse(null));
		
	}
	/*DIRECCION*/
	@Transactional
	public List<DireccionDTO> findAllDir() {
		
		List<Direccion> lista=(List<Direccion>) dirDAO.findAll();
		List<DireccionDTO> listaDTO = new ArrayList<>();
		for(int i=0;i<lista.size();i++) {
			listaDTO.add(new DireccionDTO(lista.get(i)));
		}		
		return listaDTO;
	}
	
	@Transactional
	public DireccionDTO findDirById(Integer id){
		
		return new DireccionDTO(dirDAO.findById(id).orElse(null));
		
	}
	
	/*PAIS*/
	@Transactional
	public List<PaisDTO> findAllPais() {
		
		List<Pais> lista=(List<Pais>) paisDAO.findAll();
		List<PaisDTO> listaDTO = new ArrayList<>();
		for(int i=0;i<lista.size();i++) {
			listaDTO.add(new PaisDTO(lista.get(i)));
		}		
		return listaDTO;
	}
	
	@Transactional
	public PaisDTO findPaisById(String id){
		
		return new PaisDTO(paisDAO.findById(id).orElse(null));
		
	}
	
	/*TRABAJADOR*/
	@Transactional
	public List<TrabajadorDTO> findAllTrabajador() {
		
		List<Trabajador> lista=(List<Trabajador>) trabajadorDAO.findAll();
		List<TrabajadorDTO> listaDTO = new ArrayList<>();
		for(int i=0;i<lista.size();i++) {
			listaDTO.add(new TrabajadorDTO(lista.get(i)));
		}		
		return listaDTO;
	}
	
	@Transactional
	public TrabajadorDTO findTrabajadorById(Integer id){
		
		return new TrabajadorDTO(trabajadorDAO.findById(id).orElse(null));
		
	}
	
	/*TRABAJO*/
	@Transactional
	public List<TrabajoDTO> findAllTrabajo() {
		
		List<Trabajo> lista=(List<Trabajo>) trabajoDAO.findAll();
		List<TrabajoDTO> listaDTO = new ArrayList<>();
		for(int i=0;i<lista.size();i++) {
			listaDTO.add(new TrabajoDTO(lista.get(i)));
		}		
		return listaDTO;
	}
	
	@Transactional
	public TrabajoDTO findTrabajoById(Integer id){
		
		return new TrabajoDTO(trabajoDAO.findById(id).orElse(null));
		
	}

}
