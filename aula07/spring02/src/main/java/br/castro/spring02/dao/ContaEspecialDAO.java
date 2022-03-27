package br.castro.spring02.dao;

import org.springframework.data.repository.CrudRepository;

import br.castro.spring02.model.ContaEspecial;

public interface ContaEspecialDAO extends CrudRepository<ContaEspecial, Integer> {

}
