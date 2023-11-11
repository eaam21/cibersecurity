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
	public String login() {
		return "login";
	}
	
	

}
