package com.olmo.EmpleadosREST.repositorio;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.olmo.EmpleadosREST.beans.Direccion;

@Repository
public interface DireccionDAO extends CrudRepository<Direccion, Integer> {

}
