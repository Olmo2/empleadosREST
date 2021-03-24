package com.olmo.EmpleadosREST.Service;

import java.sql.Date;

import org.springframework.stereotype.Service;

import com.olmo.EmpleadosREST.beans.Trabajador;

@Service
public class TrabajadorDTO {

	
	private Integer id;

	private String nombre;

	private String apellidos;

	private String email;

	private String tlf;

	private Date fecha_alta;

	TrabajoDTO trabajo = new TrabajoDTO();

	DepartamentoDTO dept = new DepartamentoDTO();

	public TrabajadorDTO() {
		super();
	}
	

	public TrabajadorDTO(Trabajador trab) {
		super();
		this.id = trab.getId();
		this.nombre = trab.getNombre();
		this.apellidos = trab.getApellidos();
		this.email = trab.getEmail();
		this.tlf = trab.getTlf();
		this.fecha_alta = trab.getFecha_alta();
		this.trabajo = new TrabajoDTO();
		this.dept = new DepartamentoDTO(trab.getDept());
	}


	public TrabajadorDTO(Integer id, String nombre, String apellidos, String email, String tlf, Date fecha_alta,
			TrabajoDTO trabajo, DepartamentoDTO dept) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.email = email;
		this.tlf = tlf;
		this.fecha_alta = fecha_alta;
		this.trabajo = trabajo;
		this.dept = dept;
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

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTlf() {
		return tlf;
	}

	public void setTlf(String tlf) {
		this.tlf = tlf;
	}

	public Date getFecha_alta() {
		return fecha_alta;
	}

	public void setFecha_alta(Date fecha_alta) {
		this.fecha_alta = fecha_alta;
	}

	public TrabajoDTO getTrabajo() {
		return trabajo;
	}

	public void setTrabajo(TrabajoDTO trabajo) {
		this.trabajo = trabajo;
	}

	public DepartamentoDTO getDept() {
		return dept;
	}

	public void setDept(DepartamentoDTO dept) {
		this.dept = dept;
	}
	
	
	
}
