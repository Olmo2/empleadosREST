package com.olmo.EmpleadosREST.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.olmo.EmpleadosREST.beans.Direccion;

@Service
public class DireccionDTO {

	
	private Integer id;
	
	private String calle;
	
	private String cp;
	
	private String ciudad;
	
	private String provincia;
	
	private PaisDTO pais = new PaisDTO();
	
	private List<String> departamentos = new ArrayList<>();
	
	

	public DireccionDTO() {
		super();
	}
	
	public DireccionDTO(Direccion dir) {
		super();
		this.id = dir.getId();
		this.calle = dir.getCalle();
		this.cp = dir.getCp();
		this.ciudad = dir.getCiudad();
		this.provincia = dir.getProvincia();
		this.pais = new PaisDTO(dir.getPais());
		for(int i= 0;i<dir.getDepartamentos().size();i++) {
			this.departamentos.add(dir.getDepartamentos().get(i).getNombre());
		}
	}

	public DireccionDTO(Integer id, String calle, String cp, String ciudad, String provincia, PaisDTO pais,
			List<String> departamentos) {
		super();
		this.id = id;
		this.calle = calle;
		this.cp = cp;
		this.ciudad = ciudad;
		this.provincia = provincia;
		this.pais = pais;
		this.departamentos = departamentos;
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

	public PaisDTO getPais() {
		return pais;
	}

	public void setPais(PaisDTO pais) {
		this.pais = pais;
	}

	public List<String> getDepartamentos() {
		return departamentos;
	}

	public void setDepartamentos(List<String> departamentos) {
		this.departamentos = departamentos;
	}
	
	
}
