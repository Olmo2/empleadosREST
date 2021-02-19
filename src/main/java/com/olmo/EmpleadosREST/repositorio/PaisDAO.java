package com.olmo.EmpleadosREST.repositorio;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.olmo.EmpleadosREST.beans.Pais;

@Repository
public interface PaisDAO extends CrudRepository<Pais, String> {

}
