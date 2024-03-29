package com.olmo.EmpleadosREST.negocio;


import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.olmo.EmpleadosREST.Service.DepartamentoDTO;
import com.olmo.EmpleadosREST.Service.ServiceDTO;
import com.olmo.EmpleadosREST.Service.TrabajadorDTO;
import com.olmo.EmpleadosREST.Service.TrabajoDTO;
import com.olmo.EmpleadosREST.beans.Departamento;
import com.olmo.EmpleadosREST.Service.DireccionDTO;
import com.olmo.EmpleadosREST.Service.PaisDTO;
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
	ServiceDTO service;

	@Autowired
	DireccionDAO direccionDAO;

	@Autowired
	PaisDAO paisDAO;

	@Autowired
	TrabajadorDAO trabajadorDAO;

	@Autowired
	TrabajoDAO trabajoDAO;

	/* DEPARTAMENTOS */
//	@GetMapping("/departamento/{id}")
//	public ModelAndView departamento(@PathVariable Integer id) {
//		/* Creo el Model And View */
//		ModelAndView mav = new ModelAndView();
//
//		Departamento dept;
//		dept = deptDAO.findById(id).orElse(null);
//		/* Obj departamento */
//		mav.addObject("dept", dept);
//
//		/* Defino el nombre de la vista */
//		mav.setViewName("departamento");
//
//		return mav;
//	}

	@GetMapping("/departamentos")
	public List<DepartamentoDTO> todosLosDepartamentos() {
		return service.findAllDept();
	}

	@GetMapping("/departamento/{id}")
	public DepartamentoDTO departamento(@PathVariable Integer id) {

		return service.findDeptById(id);

	}

	@DeleteMapping("/departamento/delete/{id}")
	public String departamentoDelete(@PathVariable Integer id) {

		 service.deleteDeptById(id);
		 
		 return "Exito";

	}


//	@GetMapping("/departamentos")
//	public ModelAndView todosLosDepartamentos() {
//		/* Creo el Model And View */
//		ModelAndView mav = new ModelAndView();
//		/* Creo la lista de departamentos */
//		List<Departamento> depts = (List<Departamento>) deptDAO.findAll();
//		/* añado la lista y un objeto departamento para luego iterar con el */
//		mav.addObject("depts", depts);
//		mav.addObject("dept", new Departamento());
//		/* Obj trabajador */
//		mav.addObject("trabajador", new Trabajador());
//
//		/* Defino el nombre de la vista */
//		mav.setViewName("departamentos");
//
//		return mav;
//	}

//	@GetMapping("/departamento")
//	public ModelAndView departamentoForm() {
//		/* Creo el Model And View */
//		ModelAndView mav = new ModelAndView();
//		/* Creo la lista de departamentos */
//		List<Departamento> depts = (List<Departamento>) deptDAO.findAll();
//		/* añado la lista y un objeto departamento para luego iterar con el */
//		mav.addObject("depts", depts);
//		mav.addObject("dept", new Departamento());
//		
//		List<Direccion> dirs = (List<Direccion>) direccionDAO.findAll();
//		/* añado la lista y un objeto departamento para luego iterar con el */
//		mav.addObject("dirs", dirs);
//		mav.addObject("dir", new Direccion());
//		
//		/* Creo la lista de trabajadores */
//		List<Trabajador> trabajadores = (List<Trabajador>) trabajadorDAO.findAll();
//		/* añado la lista y un objeto trabajador para luego iterar con el */
//		mav.addObject("trabajadores", trabajadores);
//		mav.addObject("trabajador", new Trabajador());
//		
//		
//
//		/* Defino el nombre de la vista */
//		mav.setViewName("departamentoAnadir");
//
//		return mav;
//	}

//	@PostMapping("/departamento/anadir")
//	public void addDepartamento(@ModelAttribute Departamento dept,HttpServletResponse response) throws IOException {
//		List<Departamento> depts = (List<Departamento>) deptDAO.findAll();
//		dept.setId(depts.size());
//		deptDAO.save(dept);
//		
//		response.sendRedirect( "/departamentos");
//		
//	}

//	@GetMapping("/departamento/borrar/{id}")
//	public void deleteDepartamento(@PathVariable Integer id,HttpServletResponse response) throws IOException {
//		
//		
//		deptDAO.deleteById(id);
//		
//		response.sendRedirect( "/departamentos");
//		
//	}

	/* DIRECCIONES */

	@GetMapping("/direcciones")
	public List<DireccionDTO> todasLasDirecciones() {

		return service.findAllDir();
	}

	@GetMapping("/direccion/{id}")
	public DireccionDTO direccion(@PathVariable Integer id) {

		return service.findDirById(id);

	}
	
	@DeleteMapping("/direccion/delete/{id}")
	public String direccionDelete(@PathVariable Integer id) {

		 service.deleteDirById(id);
		 
		 return "Exito";

	}

//	@GetMapping("/direccion/{id}")
//	public ModelAndView direccion(@PathVariable Integer id) {
//		/* Creo el Model And View */
//		ModelAndView mav = new ModelAndView();
//
//		Direccion dir;
//		dir = direccionDAO.findById(id).orElse(null);
//		/* Obj departamento */
//		mav.addObject("dir", dir);
//
//		/* Defino el nombre de la vista */
//		mav.setViewName("direccion");
//
//		return mav;
//	}

//	@GetMapping("/direcciones")
//	public ModelAndView todasLasDirecciones() {
//		/* Creo el Model And View */
//		ModelAndView mav = new ModelAndView();
//		/* Creo la lista de departamentos */
//		List<Direccion> dirs = (List<Direccion>) direccionDAO.findAll();
//		/* añado la lista y un objeto departamento para luego iterar con el */
//		mav.addObject("dirs", dirs);
//		mav.addObject("dir", new Direccion());
//
//		/* Obj Departamento */
//		mav.addObject("dept", new Departamento());
//
//		/* Defino el nombre de la vista */
//		mav.setViewName("direcciones");
//
//		return mav;
//	}

	/* PAISES */
	@GetMapping("/paises")
	public List<PaisDTO> todosLosPaises() {

		return service.findAllPais();
	}

	@GetMapping("/pais/{id}")
	public PaisDTO pais(@PathVariable String id) {

		return service.findPaisById(id);

	}
	
	@DeleteMapping("/pais/delete/{id}")
	public String paisDelete(@PathVariable String id) {

		 service.deletePaisById(id);
		 
		 return "Exito";

	}
//	@GetMapping("/pais/{id}")
//	public ModelAndView pais(@PathVariable String id) {
//
//		/* Creo el Model And View */
//		ModelAndView mav = new ModelAndView();
//		/* Creo la lista de departamentos */
//		List<Pais> paises = (List<Pais>) paisDAO.findAll();
//
//		Pais pais;
//		pais = paisDAO.findById(id).orElse(null);
//		/* Obj departamento */
//		mav.addObject("pais", pais);
//		/* Defino el nombre de la vista */
//		mav.setViewName("pais");
//
//		return mav;
//	}

//	@GetMapping("/paises")
//	public ModelAndView todosLosPaises() {
//		/* Creo el Model And View */
//		ModelAndView mav = new ModelAndView();
//		/* Creo la lista de paises */
//		List<Pais> paises = (List<Pais>) paisDAO.findAll();
//		/* añado la lista y un objeto pais para luego iterar con el */
//		mav.addObject("paises", paises);
//		mav.addObject("pais", new Pais());
//
//		/* Obj Direccion */
//		mav.addObject("dir", new Direccion());
//		/* Defino el nombre de la vista */
//		mav.setViewName("paises");
//
//		return mav;
//	}

	/* TRABAJADORES */
	@GetMapping("/trabajadores")
	public List<TrabajadorDTO> todosLosTrabajadores() {

		return service.findAllTrabajador();
	}

	@GetMapping("/trabajador/{id}")
	public TrabajadorDTO trabajador(@PathVariable Integer id) {

		return service.findTrabajadorById(id);

	}
	
	@DeleteMapping("/trabajador/delete/{id}")
	public String trabajadorDelete(@PathVariable Integer id) {

		 service.deleteTrabajadorById(id);
		 
		 return "Exito";

	}
	
//	@GetMapping("/trabajador/{id}")
//	public ModelAndView trabajador(@PathVariable Integer id) {
//
//		/* Creo el Model And View */
//		ModelAndView mav = new ModelAndView();
//
//		Trabajador trabajador;
//		trabajador = trabajadorDAO.findById(id).orElse(null);
//		/* Obj trabajador */
//		mav.addObject("trabajador", trabajador);
//		/* Defino el nombre de la vista */
//		mav.setViewName("trabajador");
//
//		return mav;
//	}

//	@GetMapping("/trabajadores")
//	public ModelAndView todosLosTrabajadores() {
//		/* Creo el Model And View */
//		ModelAndView mav = new ModelAndView();
//		/* Creo la lista de trabajadores */
//		List<Trabajador> trabajadores = (List<Trabajador>) trabajadorDAO.findAll();
//		/* añado la lista y un objeto trabajador para luego iterar con el */
//		mav.addObject("trabajadores", trabajadores);
//		mav.addObject("trabajador", new Trabajador());
//
//		/* Defino el nombre de la vista */
//		mav.setViewName("trabajadores");
//
//		return mav;
//	}

	/* TRABAJO */
	@GetMapping("/trabajos")
	public List<TrabajoDTO> todosLosTrabajos() {

		return service.findAllTrabajo();
	}

	@GetMapping("/trabajo/{id}")
	public TrabajoDTO trabajo(@PathVariable Integer id) {

		return service.findTrabajoById(id);

	}
	
	@DeleteMapping("/trabajo/delete/{id}")
	public String trabajoDelete(@PathVariable Integer id) {

		 service.deleteTrabajoById(id);
		 
		 return "Exito";

	}
	
//	@GetMapping("/trabajo/{id}")
//	public ModelAndView trabajo(@PathVariable Integer id) {
//
//		/* Creo el Model And View */
//		ModelAndView mav = new ModelAndView();
//
//		Trabajo trabajo;
//		trabajo = trabajoDAO.findById(id).orElse(null);
//		/* Obj trabajador */
//		mav.addObject("trabajo", trabajo);
//		/* Defino el nombre de la vista */
//		mav.setViewName("trabajo");
//
//		return mav;
//	}

//	@GetMapping("/trabajos")
//	public ModelAndView todosLosTrabajos() {
//		/* Creo el Model And View */
//		ModelAndView mav = new ModelAndView();
//		/* Creo la lista de trabajadores */
//		List<Trabajo> trabajos = (List<Trabajo>) trabajoDAO.findAll();
//		/* añado la lista y un objeto trabajo para luego iterar con el */
//		mav.addObject("trabajos", trabajos);
//		mav.addObject("trabajo", new Trabajo());
//
//		/* Defino el nombre de la vista */
//		mav.setViewName("trabajos");
//
//		return mav;
//	}

}
