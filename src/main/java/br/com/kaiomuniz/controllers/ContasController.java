package br.com.kaiomuniz.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/contas")
public class ContasController {

	@PostMapping
	public ResponseEntity<String> post() {
		return ResponseEntity.ok("Conta criada com sucesso.");
	}

	@PutMapping
	public ResponseEntity<String> put() {
		return ResponseEntity.ok("Conta atualizada com sucesso.");
	}

	@DeleteMapping
	public ResponseEntity<String> delete() {
		return ResponseEntity.ok("Conta excluída com sucesso.");
	}

	@GetMapping
	public ResponseEntity<String> getAll() {
		return ResponseEntity.ok("Contas obtidas com sucesso.");
	}
}
