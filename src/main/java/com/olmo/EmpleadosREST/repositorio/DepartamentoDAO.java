package com.olmo.EmpleadosREST.repositorio;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.olmo.EmpleadosREST.beans.Departamento;

@Repository
public interface DepartamentoDAO extends CrudRepository<Departamento, Integer> {

}
