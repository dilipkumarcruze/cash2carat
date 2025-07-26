package com.App.Controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.App.Entity.User;
import com.App.Service.AuthService;

@RestController
@RequestMapping("/api/auth")
@CrossOrigin
public class AuthController {

	private final AuthService auth;

	public AuthController(AuthService auth) {
		this.auth = auth;
	}

	@PostMapping("/register")
	public ResponseEntity<?> register(@RequestBody User user) {
		String token = auth.register(user);
		return ResponseEntity.ok().body("{\"token\":\"" + token + "\"}");
	}

	@PostMapping("/login")
	public ResponseEntity<?> login(@RequestBody LoginRequest req) {
		String token = auth.login(req.email, req.password);
		return ResponseEntity.ok().body("{\"token\":\"" + token + "\"}");
	}

	static class LoginRequest {
		public String email;
		public String password;
	}
}
