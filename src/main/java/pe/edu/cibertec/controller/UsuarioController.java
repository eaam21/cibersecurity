package pe.edu.cibertec.controller;

import java.util.ArrayList;
import java.util.Collection;

import org.apache.tomcat.util.net.openssl.ciphers.Authentication;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UsuarioController {

	@GetMapping("/")
	public String inicio() {
		return "inicio";
	}
	
	@GetMapping("/login")
	public String login() {
		return "login";
	}

	@GetMapping("/home")
	public String home() {
		return "home";
	}
	
	@GetMapping("/admin")
	public String admin() {
		return "admin";
	}

}
