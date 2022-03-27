package br.castro.spring02.dao;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import br.castro.spring02.model.Produto;

public interface ContaCorrenteDAO extends CrudRepository<ContaCorrente, Integer> {

}
