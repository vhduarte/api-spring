package br.com.e2etreinamentos.apispring.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import br.com.e2etreinamentos.apispring.model.LoginFormulario;

@Controller
public class LoginController {
	
	private static final String usernameValido = "teste";
	private static final String passwordValido = "Teste@123";
	
	
	@PostMapping("/login")
	@ResponseBody
	public ResponseEntity<String> login(@RequestBody LoginFormulario lFormulario) {
		
		
		if (lFormulario.getUsername().equals(usernameValido)) {
			return ResponseEntity.ok("{\"mensagem\":\"login com sucesso\"}");
			
		}else {
			
			return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("{\"mensagem\":\"Dados invalidos.\"}");
			
			
		}
		
		
	
	}
	
 

}
