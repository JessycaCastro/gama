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

import br.castro.spring02.dao.ContaCorrenteDAO;
import br.castro.spring02.model.ContaCorrente;

@RestController
@CrossOrigin("*")
public class ContaCorrenteController {

	@Autowired
	private ContaCorrenteDAO dao;

	@GetMapping("/contas")
	public ResponseEntity<ArrayList<ContaCorrente>> obterTodos() {
		ArrayList<ContaCorrente> lista = (ArrayList<ContaCorrente>) dao.findAll(); // lista todos

		if (lista != null) {
			return ResponseEntity.ok(lista); // ok - status 200
		} else {
			return ResponseEntity.notFound().build(); // status 404
		}
	}

	@GetMapping("/conta/{numero}")
	public ResponseEntity<ContaCorrente> obterContaCorrentePorNumero(@PathVariable int numero) {
		ContaCorrente conta = dao.findById(numero).orElse(null); // busca o produto pela chave primária

		if (conta != null) {
			return ResponseEntity.ok(conta);
		} else {
			return ResponseEntity.notFound().build();
		}
	}

	@PostMapping("/conta/nova")
	public ResponseEntity<ContaCorrente> novaContaCorrente(@RequestBody ContaCorrente conta) {
		try {
			ContaCorrente novaContaCorrente = dao.save(conta);
			return ResponseEntity.ok(novaContaCorrente);
		} catch (Exception e) {
			// return ResponseEntity.badRequest().build();
			return ResponseEntity.status(400).build();
		}

	}

	@PostMapping("/conta/atualiza")
    public ResponseEntity<ContaCorrente> atualizaContaCorrente(@RequestBody ContaCorrente conta){
        try {
            if(conta.getNumero() > 0){
                ContaCorrente novaContaCorrente = dao.save(conta);    
                return ResponseEntity.ok(novaConta);
            }
            return ResponseEntity.badRequest().build();
        } catch (Exception e) {
            return ResponseEntity.badRequest().build();
        }
    }
