package br.castro.spring02.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.castro.spring02.dao.ContaEspecialDAO;
import br.castro.spring02.model.Conta;
import br.castro.spring02.model.ContaEspecial;

@RestController
@CrossOrigin("*") 
public class ContaEspecialController {

	@Autowired
	private ContaEspecialDAO dao;

	@GetMapping("/conta")
	public ResponseEntity<ArrayList<ContaEspecial>> obterTodos() {
		ArrayList<ContaEspecial> lista = (ArrayList<ContaEspecial>) dao.findAll(); 

		if (lista != null) {
			return ResponseEntity.ok(lista);
		} else {
			return ResponseEntity.notFound().build(); // status 404
		}
	}

	@GetMapping("/conta/{numero}")
	public ResponseEntity<ContaEspecial> obterContaEspecial(@PathVariable int numero) {
		ContaEspecial conta = dao.findById(numero).orElse(null);
		if (conta != null) {
			return ResponseEntity.ok(conta);
		} else {
			return ResponseEntity.notFound().build();
		}
	}

	@PostMapping("/conta/nova")
	public ResponseEntity<Conta> novaContaEspecial(@RequestBody ContaEspecial conta) {
		try {
			ContaEspecial novaContaEspecial = dao.save(conta);
			return ResponseEntity.ok(novaContaEspecial);
		} catch (Exception e) {
			// return ResponseEntity.badRequest().build();
			return ResponseEntity.status(400).build();
		}

	}

	@PostMapping("/conta/atualiza")
	public ResponseEntity<ContaEspecial> atualizaContaEspecial(@RequestBody ContaEspecial conta) {
		try {
			if (conta.getNumero() > 0) {
				ContaEspecial novaContaEspecial = dao.save(conta);
				return ResponseEntity.ok(novaContaEspecial);
			}
			return ResponseEntity.badRequest().build();
		} catch (Exception e) {
			return ResponseEntity.badRequest().build();
		}
	}
}
