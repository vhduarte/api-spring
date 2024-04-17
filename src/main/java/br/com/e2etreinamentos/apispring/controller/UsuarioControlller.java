package br.com.e2etreinamentos.apispring.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.e2etreinamentos.apispring.model.Usuario;

@Controller
@RequestMapping("/usuarios")
public class UsuarioControlller {

	private final List<Usuario> usuarios = new ArrayList<>();

	@PostMapping("/cadastro")
	public ResponseEntity<String> cadastrarUsuario(@RequestBody Usuario usuario) {
		if (usuario.getSenha().length() < 8 || usuario.getSenha().length()>15) {

			return ResponseEntity.badRequest().body("Senha deve ter entre 8 e 15 caracteres ");
		}

		return ResponseEntity.status(HttpStatus.CREATED).body("Cadastro com sucesso");

	}

	@GetMapping
	public ResponseEntity<List<Usuario>> consultarUsuario() {
		return ResponseEntity.ok(usuarios);
	}

}
