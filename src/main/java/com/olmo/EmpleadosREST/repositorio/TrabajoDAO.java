package com.olmo.EmpleadosREST.repositorio;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.olmo.EmpleadosREST.beans.Trabajo;

@Repository
public interface TrabajoDAO extends CrudRepository<Trabajo, Integer> {

}

