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
@Table(name="direcciones")
public class Direccion {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	@Column
	private String calle;
	
	@Column
	private String cp;
	
	@Column
	private String ciudad;
	
	@Column
	private String provincia;
	
	@ManyToOne
	@JsonBackReference
	private Pais pais = new Pais();
	
	@OneToMany(fetch = FetchType.EAGER, mappedBy = "dir")
	@JsonManagedReference
	private List<Departamento> departamentos = new ArrayList<>();
	
	public void addDepartamento(Departamento dept) {

		if (!departamentos.contains(dept)) {

			departamentos.add(dept);
		}
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCalle() {
		return calle;
	}

	public void setCalle(String calle) {
		this.calle = calle;
	}

	public String getCp() {
		return cp;
	}

	public void setCp(String cp) {
		this.cp = cp;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public String getProvincia() {
		return provincia;
	}

	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}

	public Pais getPais() {
		return pais;
	}

	public void setPais(Pais pais) {
		this.pais = pais;
	}

	public List<Departamento> getDepartamentos() {
		return departamentos;
	}

	public void setDepartamentos(List<Departamento> departamentos) {
		this.departamentos = departamentos;
	}

	@Override
	public String toString() {
		return "Calle=" + calle + ", Código Postal=" + cp + ", Ciudad=" + ciudad + ", Provincia="
				
				+ provincia + ", Pais=" + pais ;
	}
	
	
	
	
}
