package com.olmo.EmpleadosREST.repositorio;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.olmo.EmpleadosREST.beans.Trabajador;

@Repository
public interface TrabajadorDAO extends CrudRepository<Trabajador, Integer> {

}